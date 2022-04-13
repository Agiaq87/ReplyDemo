package it.giaquinto.fides.replydemo.db

import androidx.lifecycle.LiveData
import androidx.room.*
import it.giaquinto.fides.replydemo.model.News

@Dao
interface NewsDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNews(news: News)

    @Delete
    suspend fun deleteNews(news: News)

    @Query("SELECT * FROM news_table")
    fun getAllNews(): LiveData<List<News>>

    @Query("SELECT * FROM news_table ORDER BY pubDate DESC")
    fun getAllNewsOrderByPub(): LiveData<List<News>>

    @Query("SELECT * FROM news_table ORDER BY title DESC")
    fun getAllNewsOrderByTitle(): LiveData<List<News>>

    @Query("SELECT COUNT(*) AS counted FROM news_table")
    fun getTotalNews(): LiveData<Int>
}