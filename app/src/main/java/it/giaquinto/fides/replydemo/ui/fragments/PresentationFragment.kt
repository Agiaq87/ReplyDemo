package it.giaquinto.fides.replydemo.ui.fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import it.giaquinto.fides.replydemo.R
import it.giaquinto.fides.replydemo.databinding.FragmentPresentationBinding
import it.giaquinto.fides.replydemo.ui.viewmodel.PresentationViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@AndroidEntryPoint
class PresentationFragment : Fragment() {
    private val viewModel: PresentationViewModel by viewModels()
    private lateinit var binding: FragmentPresentationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPresentationBinding.inflate(layoutInflater)

        //viewModel = ViewModelProvider(this).get(PresentationViewModel::class.java)
        binding.presentationViewModel = viewModel
        binding.lifecycleOwner = this
        viewModel.switchToNext = { goToNext() }

        CoroutineScope(Dispatchers.Main).launch {
            viewModel.fetch()
        }

        return binding.root
    }

    private fun goToNext() =
        Handler(Looper.getMainLooper()).post {
            findNavController()
                .navigate(R.id.action_presentationFragment_to_publisherFragment)
        }
}