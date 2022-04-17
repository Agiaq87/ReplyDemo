package it.giaquinto.fides.replydemo.ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import it.giaquinto.fides.replydemo.model.Publisher
import it.giaquinto.fides.replydemo.repository.NewsRepository
import it.giaquinto.fides.replydemo.repository.PublisherRepository
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val publisherRepository: PublisherRepository,
    private val newsRepository: NewsRepository
) : ViewModel() {

    private val _publisherList: MutableLiveData<List<Publisher>> by lazy {
        MutableLiveData<List<Publisher>>().also { t ->
            t.value?.forEach {
                Log.e("MainViewModel", it.toString())
            }
        }
    }

    val publisherList: LiveData<List<Publisher>> = _publisherList

}