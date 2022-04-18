package it.giaquinto.fides.replydemo.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import it.giaquinto.fides.replydemo.model.FeedContainer
import javax.inject.Inject

@HiltViewModel
class ArgumentsViewModel @Inject constructor(
    val feedContainer: FeedContainer
) : ViewModel() {
    private var order = true

    val argumentsList = MutableLiveData<List<String>>()
    var publisher: String = ""


    fun orderList() =
        if (order) {

            order = false
        } else {

            order = true
        }

    fun searchList(value: String): List<String> {
        val list = mutableListOf<String>()

        argumentsList.value?.forEach {
            if (it.contains(value, true)) {
                list.add(it)
            }
        }

        return list
    }


}