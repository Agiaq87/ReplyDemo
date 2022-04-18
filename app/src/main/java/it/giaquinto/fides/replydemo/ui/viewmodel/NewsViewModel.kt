package it.giaquinto.fides.replydemo.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import it.giaquinto.fides.replydemo.model.FeedContainer
import it.giaquinto.fides.replydemo.model.feedrss.FeedItem
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    val feedContainer: FeedContainer
) : ViewModel() {
    val newsList = MutableLiveData<List<FeedItem>>()

    fun setCurrentList(publisher: String) {
        val list = feedContainer.publisher[publisher]?.keys?.toList()
    }
}