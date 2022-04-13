package it.giaquinto.fides.replydemo.db

import android.net.Uri
import androidx.room.TypeConverter
import it.giaquinto.fides.replydemo.model.Publisher


class Converters {

    @TypeConverter
    fun uriToString(uri: Uri): String = uri.toString()

    @TypeConverter
    fun stringToUri(uri: String): Uri = Uri.parse(uri)

    @TypeConverter
    fun publisherToString(publisher: Publisher): String = publisher.toString()

    @TypeConverter
    fun stringToPublisher(publisher: String): Publisher = Publisher.fromString(publisher)
}