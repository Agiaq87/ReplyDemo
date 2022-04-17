package it.giaquinto.fides.replydemo.repository

import it.giaquinto.fides.replydemo.db.PublisherDAO
import it.giaquinto.fides.replydemo.model.Publisher
import javax.inject.Inject

class PublisherRepository @Inject constructor(
    private val publisherDao: PublisherDAO
) {
    suspend fun insert(publisher: Publisher) = publisherDao.insertPublisher(publisher)

    suspend fun delete(publisher: Publisher) = publisherDao.deletePublisher(publisher)

    fun getAll() = publisherDao.getAllPublisher()

    fun getTotal() = publisherDao.getTotalPublisher()

}