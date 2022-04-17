package it.giaquinto.fides.replydemo.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import it.giaquinto.fides.replydemo.model.FeedContainer
import javax.inject.Inject

@HiltViewModel
class PublisherViewModel @Inject constructor(
    private val feedContainer: FeedContainer
) : ViewModel() {
    private var reOrderValue = true

    val publisherList = MutableLiveData<List<String>>()

    init {
        publisherList.value = feedContainer.publisher.keys.toList().sortedDescending()
    }

    fun reOrderList() =
        if (reOrderValue) {
            publisherList.postValue(feedContainer.publisher.keys.toList().sortedDescending())
            reOrderValue = false
        } else {
            publisherList.postValue(feedContainer.publisher.keys.toList())
            reOrderValue = true
        }

    fun searchList(value: String): List<String> {
        val list = mutableListOf<String>()

        publisherList.value?.forEach {
            if (it.contains(value, true)) {
                list.add(it)
            }
        }

        return list.toList()
    }

    fun originalList(): List<String> = publisherList.value!!

}