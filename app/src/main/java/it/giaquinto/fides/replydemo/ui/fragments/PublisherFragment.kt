package it.giaquinto.fides.replydemo.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import it.giaquinto.fides.replydemo.R
import it.giaquinto.fides.replydemo.ui.viewmodel.MainViewModel

@AndroidEntryPoint
class PublisherFragment : Fragment(R.layout.fragment_publisher) {

    private val viewModel by viewModels<MainViewModel>()
}