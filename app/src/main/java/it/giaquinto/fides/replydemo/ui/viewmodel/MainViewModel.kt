package it.giaquinto.fides.replydemo.ui.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import it.giaquinto.fides.replydemo.repositories.NewsRepository
import it.giaquinto.fides.replydemo.repositories.PublisherRepository
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val publisherRepository: PublisherRepository,
    val newsRepository: NewsRepository
) : ViewModel() {

}