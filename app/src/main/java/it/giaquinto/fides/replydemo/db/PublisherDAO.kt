package it.giaquinto.fides.replydemo.db

import androidx.lifecycle.LiveData
import androidx.room.*
import it.giaquinto.fides.replydemo.model.Publisher

@Dao
interface PublisherDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPublisher(publisher: Publisher)

    @Delete
    suspend fun deletePublisher(publisher: Publisher)

    @Query("SELECT * FROM publisher_table")
    fun getAllPublisher(): LiveData<List<Publisher>>


    @Query("SELECT COUNT(*) AS counted FROM publisher_table")
    fun getTotalPublisher(): LiveData<Int>
}