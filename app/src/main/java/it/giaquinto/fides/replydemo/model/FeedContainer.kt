package it.giaquinto.fides.replydemo.model

import it.giaquinto.fides.replydemo.model.feedrss.FeedItem
import javax.inject.Singleton

@Singleton
class FeedContainer {
    var ansa: MutableMap<String, List<FeedItem>> = mutableMapOf() // Canale - lista feed
    var miur: MutableMap<String, List<FeedItem>> = mutableMapOf()
    var repubblica: MutableMap<String, List<FeedItem>> = mutableMapOf()

    var publisher: MutableMap<String, MutableMap<String, List<FeedItem>>> = mutableMapOf()

    init {
        publisher["AGI"] = mutableMapOf()
        publisher["Ansa"] = mutableMapOf()
        publisher["Miur"] = mutableMapOf()
        publisher["Repubblica"] = mutableMapOf()
        publisher["TomsHW"] = mutableMapOf()
    }


}