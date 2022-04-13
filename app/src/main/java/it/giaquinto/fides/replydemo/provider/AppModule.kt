package it.giaquinto.fides.replydemo.provider

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import it.giaquinto.fides.replydemo.constant.Constant
import it.giaquinto.fides.replydemo.db.Database
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providePublisherDatabase(@ApplicationContext app: Context) =
        Room.databaseBuilder(app, Database::class.java, Constant.DATABASE_NAME).build()

    @Provides
    @Singleton
    fun providePublisherDao(db: Database) = db.getPublisherDao()

    @Provides
    @Singleton
    fun provideNewsDao(db: Database) = db.getNewsDao()
}