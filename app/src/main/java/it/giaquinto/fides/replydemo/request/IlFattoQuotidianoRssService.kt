package it.giaquinto.fides.replydemo.request

import it.giaquinto.fides.replydemo.model.feedrss.Feed
import retrofit2.Response
import retrofit2.http.GET

interface IlFattoQuotidianoRssService {
    @GET("feed/")
    suspend fun getHome(): Response<Feed>
}