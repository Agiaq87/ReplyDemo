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
import it.giaquinto.fides.replydemo.model.FeedContainer
import it.giaquinto.fides.replydemo.request.*
import retrofit2.Retrofit
import retrofit2.converter.simplexml.SimpleXmlConverterFactory
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

    @Provides
    @Singleton
    fun provideAnsaService(): AnsaRssService = Retrofit.Builder()
        .baseUrl("https://www.ansa.it/sito/")
        .addConverterFactory(SimpleXmlConverterFactory.create())
        .build()
        .create(AnsaRssService::class.java)

    @Provides
    @Singleton
    fun provideMiurService(): MiurRssService = Retrofit.Builder()
        .baseUrl("https://www.miur.gov.it/")
        .addConverterFactory(SimpleXmlConverterFactory.create())
        .build()
        .create(MiurRssService::class.java)

    @Provides
    @Singleton
    fun provideRepubblicaService(): RepubblicaRssService = Retrofit.Builder()
        .baseUrl("https://www.repubblica.it/rss/")
        .addConverterFactory(SimpleXmlConverterFactory.create())
        .build()
        .create(RepubblicaRssService::class.java)

    @Provides
    @Singleton
    fun provideTomsHwService(): TomsHwRssService = Retrofit.Builder()
        .baseUrl("https://www.tomshw.it/")
        .addConverterFactory(SimpleXmlConverterFactory.create())
        .build()
        .create(TomsHwRssService::class.java)

    @Provides
    @Singleton
    fun provideAgiService(): AgiRssService = Retrofit.Builder()
        .baseUrl("https://www.agi.it/")
        .addConverterFactory(SimpleXmlConverterFactory.create())
        .build()
        .create(AgiRssService::class.java)

    @Provides
    @Singleton
    fun provideFattoService(): IlFattoQuotidianoRssService = Retrofit.Builder()
        .baseUrl("https://www.ilfattoquotidiano.it/")
        .addConverterFactory(SimpleXmlConverterFactory.create())
        .build()
        .create(IlFattoQuotidianoRssService::class.java)

    @Provides
    @Singleton
    fun provideFeedContainer(): FeedContainer = FeedContainer()
}