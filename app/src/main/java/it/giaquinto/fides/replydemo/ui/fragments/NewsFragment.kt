package it.giaquinto.fides.replydemo.ui.fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.hilt.android.AndroidEntryPoint
import it.giaquinto.fides.replydemo.databinding.FragmentPublisherBinding
import it.giaquinto.fides.replydemo.ui.adapters.NewsAdapter
import it.giaquinto.fides.replydemo.ui.viewmodel.NewsViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@AndroidEntryPoint
class NewsFragment : Fragment() {

    private val viewModel by viewModels<NewsViewModel>()
    private val handler: Handler = Handler(Looper.getMainLooper())
    private val newsAdapter by lazy { NewsAdapter() }

    private lateinit var binding: FragmentPublisherBinding // Voglio riciclare il layout già presente

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPublisherBinding.inflate(layoutInflater)

        CoroutineScope(Dispatchers.Main).launch {
            setupRecyclerView()
        }

        //viewModel.setCurrentList()

        handler.post {
            binding.searchText.hint = "Cerca News"
            binding.textView.text = "" // TODO
        }

        binding.reOrder.setOnClickListener {
            //viewModel.reOrderList()
        }

        binding.searchText.addTextChangedListener(
            object : TextWatcher {
                private var currentList: List<String>? = null
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    Log.e("TextWatcher", "before")
                }

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    Log.e("TextWatcher", "onChange")
                    /*p0?.let {
                        currentList = if (it.length >= 3) {
                            viewModel.searchList(it.toString())
                        } else {
                            viewModel.originalList()
                        }
                    }*/
                }

                override fun afterTextChanged(p0: Editable?) {
                    Log.e("TextWatcher", "after")
                    /*currentList?.let {
                        if (it.isEmpty()) {
                            Toast.makeText(
                                this@PublisherFragment.requireContext(),
                                "Nessun risultato trovato",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else {
                            publisherAdapter.setList(it)
                        }
                    }*/
                }

            }
        )

        return binding.root
    }

    private fun setupRecyclerView() = binding.recycleView.apply {
        adapter = newsAdapter
        layoutManager = LinearLayoutManager(requireActivity())
        newsAdapter.openNews = {

        }

        /*viewModel.publisherList.observe(
            viewLifecycleOwner
        ) {
            newsAdapter.setList(it)
        }*/
    }
}