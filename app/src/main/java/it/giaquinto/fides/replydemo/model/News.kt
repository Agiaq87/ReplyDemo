package it.giaquinto.fides.replydemo.model

import android.net.Uri
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "news_table")
data class News(
    val title: String,
    val pubDate: String,
    val description: String,
    val link: Uri,
    val publisher: Publisher
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}