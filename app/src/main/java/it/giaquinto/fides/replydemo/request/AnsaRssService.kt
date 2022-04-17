package it.giaquinto.fides.replydemo.request

import it.giaquinto.fides.replydemo.model.feedrss.Feed
import retrofit2.Response
import retrofit2.http.GET

interface AnsaRssService {
    @GET("ansait_rss.xml")
    suspend fun getHome(): Response<Feed>

    @GET("notizie/cultura/cinema/cinema_rss.xml")
    suspend fun getCinema(): Response<Feed>

    @GET("notizie/politica/politica_rss.xml")
    suspend fun getPolitica(): Response<Feed>

    @GET("notizie/mondo/mondo_rss.xml")
    suspend fun getWorld(): Response<Feed>

    @GET("notizie/economia/economia_rss.xml")
    suspend fun getEconomy(): Response<Feed>

    @GET("notizie/sport/calcio/calcio_rss.xml")
    suspend fun getSoccer(): Response<Feed>

    @GET("notizie/cultura/cultura_rss.xml")
    suspend fun getCulture(): Response<Feed>

    @GET("notizie/tecnologia/tecnologia_rss.xml")
    suspend fun getTech(): Response<Feed>

    @GET("notizie/topnews/topnews_rss.xml")
    suspend fun getTopNews(): Response<Feed>

    @GET("notizie/photogallery/foto_rss.xml")
    suspend fun getPhoto(): Response<Feed>

    @GET("notizie/videogallery/video_rss.xml")
    suspend fun getVideo(): Response<Feed>

    /*
    No Good :(
    suspend fun all(): List<Response<Feed>> = listOf(
        getHome(),
        getCinema(),
        getPolitica(),
        getWorld(),
        getWorld(),
        getEconomy(),
        getSoccer(),
        getCulture(),
        getTech(),
        getTopNews(),
        getPhoto(),
        getVideo()
    )*/
}