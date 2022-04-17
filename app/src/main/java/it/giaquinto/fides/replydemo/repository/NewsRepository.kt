package it.giaquinto.fides.replydemo.repository

import it.giaquinto.fides.replydemo.db.NewsDAO
import it.giaquinto.fides.replydemo.model.News
import javax.inject.Inject

class NewsRepository @Inject constructor(
    private val newsDao: NewsDAO
) {

    suspend fun insert(news: News) = newsDao.insertNews(news)

    suspend fun delete(news: News) = newsDao.deleteNews(news)

    fun getAll() = newsDao.getAllNews()

    fun getOrderByPub() = newsDao.getAllNewsOrderByPub()

    fun getOrderByTitle() = newsDao.getAllNewsOrderByTitle()

    fun getTotal() = newsDao.getTotalNews()
}