package it.giaquinto.fides.replydemo.ui.fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import it.giaquinto.fides.replydemo.databinding.FragmentPublisherBinding
import it.giaquinto.fides.replydemo.ui.viewmodel.MainViewModel

@AndroidEntryPoint
class NewsFragment : Fragment() {

    private val viewModel by viewModels<MainViewModel>()
    private val handler: Handler = Handler(Looper.getMainLooper())

    private lateinit var binding: FragmentPublisherBinding // Voglio riciclare il layout già presente

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =
            FragmentPublisherBinding.inflate(layoutInflater) // Voglio riciclare il layout già presente

        handler.post {
            binding.textView.text = "" // TODO
        }

        return binding.root
    }
}