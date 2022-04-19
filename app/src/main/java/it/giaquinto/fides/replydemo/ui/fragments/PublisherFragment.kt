package it.giaquinto.fides.replydemo.ui.fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import it.giaquinto.fides.replydemo.R
import it.giaquinto.fides.replydemo.databinding.FragmentPublisherBinding
import it.giaquinto.fides.replydemo.ui.adapters.PublisherAdapter
import it.giaquinto.fides.replydemo.ui.viewmodel.PublisherViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@AndroidEntryPoint
class PublisherFragment : Fragment() {

    private val viewModel: PublisherViewModel by viewModels()
    private val binding: FragmentPublisherBinding by lazy {
        FragmentPublisherBinding.inflate(
            layoutInflater
        )
    }
    private val publisherAdapter by lazy {
        PublisherAdapter {
            findNavController().navigate(
                R.id.action_publisherFragment_to_argumentsFragment,
                bundleOf("publisher" to it)
            )
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        CoroutineScope(Dispatchers.Main.immediate).launch {
            setupRecyclerView()
        }

        binding.reOrder.setOnClickListener {
            viewModel.reOrderList()
        }


        return binding.root
    }

    override fun onStart() {
        binding.searchText.addTextChangedListener(
            object : TextWatcher {
                private var currentList: List<String>? = null
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    Log.e("TextWatcher", "before")
                }

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    Log.e("TextWatcher", "onChange")
                    p0?.let {
                        currentList = if (it.length >= 3) {
                            viewModel.searchList(it.toString())
                        } else {
                            viewModel.originalList()
                        }
                    }
                }

                override fun afterTextChanged(p0: Editable?) {
                    Log.e("TextWatcher", "after")
                    currentList?.let {
                        if (it.isEmpty()) {
                            Toast.makeText(
                                this@PublisherFragment.requireContext(),
                                "Nessun risultato trovato",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else {
                            publisherAdapter.setList(it)
                        }
                    }
                }

            }
        )
        super.onStart()
    }

    private fun setupRecyclerView() = binding.recycleView.apply {
        adapter = publisherAdapter
        layoutManager = LinearLayoutManager(requireActivity())
        /*publisherAdapter.setListener = {
            findNavController().navigate(
                R.id.action_publisherFragment_to_argumentsFragment,
                bundleOf("publisher" to it)
            )
        }*/

        viewModel.publisherList.observe(
            viewLifecycleOwner
        ) {
            publisherAdapter.setList(it)
        }
    }
}