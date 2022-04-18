package it.giaquinto.fides.replydemo.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import it.giaquinto.fides.replydemo.databinding.FragmentPublisherBinding
import it.giaquinto.fides.replydemo.ui.adapters.ArgumentsAdapter
import it.giaquinto.fides.replydemo.ui.viewmodel.ArgumentsViewModel

@AndroidEntryPoint
class ArgumentsFragment : Fragment() {
    private val viewModel: ArgumentsViewModel by viewModels()
    private lateinit var binding: FragmentPublisherBinding
    private val argumentsAdapter by lazy { ArgumentsAdapter() }

}