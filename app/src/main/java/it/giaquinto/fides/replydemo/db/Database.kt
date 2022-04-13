package it.giaquinto.fides.replydemo.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import it.giaquinto.fides.replydemo.model.News
import it.giaquinto.fides.replydemo.model.Publisher

@Database(
    entities = [News::class, Publisher::class],
    version = 1
)
@TypeConverters(Converters::class)
abstract class Database: RoomDatabase() {

    abstract fun getNewsDao(): NewsDAO

    abstract fun getPublisherDao(): PublisherDAO
}