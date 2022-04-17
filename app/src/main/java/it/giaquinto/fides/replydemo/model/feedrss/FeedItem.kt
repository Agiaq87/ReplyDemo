package it.giaquinto.fides.replydemo.model.feedrss

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "item", strict = false)
data class FeedItem @JvmOverloads constructor(
    @field:Element(name = "title")
    @param:Element(name = "title")
    var title: String? = null,

    @field:Element(name = "link")
    @param:Element(name = "link")
    var link: String? = null,

    /*@field:Element(name = "pubDate")
    @param:Element(name = "pubDate")
    var pubDate: String? = null,*/

    @field:Element(name = "description", required = false)
    @param:Element(name = "description", required = false)
    var description: String? = null
)
