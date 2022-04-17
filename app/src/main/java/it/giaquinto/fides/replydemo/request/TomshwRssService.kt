package it.giaquinto.fides.replydemo.request

import it.giaquinto.fides.replydemo.model.feedrss.Feed
import retrofit2.Response
import retrofit2.http.GET

interface TomsHwRssService {
    @GET("feed/")
    suspend fun getHome(): Response<Feed>

    @GET("feed/?post_type=hardware")
    suspend fun getHardware(): Response<Feed>

    @GET("feed/?post_type=videogioco")
    suspend fun getGame(): Response<Feed>

    @GET("feed/?post_type=smartphone")
    suspend fun getSmartphone(): Response<Feed>

    @GET("feed/?post_type=culturapop")
    suspend fun getPopCulture(): Response<Feed>

    @GET("feed/?post_type=automotive")
    suspend fun getAutomotive(): Response<Feed>

    @GET("feed/?post_type=business")
    suspend fun getBusiness(): Response<Feed>

    @GET("feed/?post_type=offerta")
    suspend fun getDiscount(): Response<Feed>

    @GET("feed/?post_type=scienze")
    suspend fun getScience(): Response<Feed>

    @GET("feed/?post_type=altro")
    suspend fun getMore(): Response<Feed>
}