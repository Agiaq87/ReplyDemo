package it.giaquinto.fides.replydemo.ui.viewmodel

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import it.giaquinto.fides.replydemo.model.FeedContainer
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(
    val feedContainer: FeedContainer
) : ViewModel() {


}