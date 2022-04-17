package it.giaquinto.fides.replydemo.request

import it.giaquinto.fides.replydemo.model.feedrss.Feed
import retrofit2.Response
import retrofit2.http.GET

interface AgiRssService {
    @GET("cronaca/rss")
    suspend fun cronaca(): Response<Feed>

    @GET("economia/rss")
    suspend fun economia(): Response<Feed>

    @GET("politica/rss")
    suspend fun politica(): Response<Feed>

    @GET("estero/rss")
    suspend fun estero(): Response<Feed>

    @GET("cultura/rss")
    suspend fun cultura(): Response<Feed>

    @GET("sport/rss")
    suspend fun sport(): Response<Feed>

    @GET("innovazione/rss")
    suspend fun innovazione(): Response<Feed>

    @GET("lifestyle/rss")
    suspend fun lifestyle(): Response<Feed>

    @GET("regioni/abruzzo/rss")
    suspend fun abruzzo(): Response<Feed>

    @GET("regioni/calabria/rss")
    suspend fun calabria(): Response<Feed>

    @GET("regioni/campania/rss")
    suspend fun campania(): Response<Feed>

    @GET("regioni/emilia-romagna/rss")
    suspend fun emiliaRomagna(): Response<Feed>

    @GET("regioni/friuli-venezia-giulia/rss")
    suspend fun friuliVeneziaGiulia(): Response<Feed>

    @GET("regioni/lazio/rss")
    suspend fun lazio(): Response<Feed>

    @GET("regioni/liguria/rss")
    suspend fun liguria(): Response<Feed>

    @GET("regioni/lombardia/rss")
    suspend fun lombardia(): Response<Feed>

    @GET("regioni/marche/rss")
    suspend fun marche(): Response<Feed>

    @GET("regioni/molise/rss")
    suspend fun molise(): Response<Feed>

    @GET("regioni/piemonte/rss")
    suspend fun piemonte(): Response<Feed>

    @GET("regioni/puglia/rss")
    suspend fun puglia(): Response<Feed>

    @GET("regioni/sardegna/rss")
    suspend fun sardegna(): Response<Feed>

    @GET("regioni/sicilia/rss")
    suspend fun sicilia(): Response<Feed>

    @GET("regioni/toscana/rss")
    suspend fun toscana(): Response<Feed>

    @GET("regioni/umbria/rss")
    suspend fun umbria(): Response<Feed>

    @GET("regioni/veneto/rss")
    suspend fun veneto(): Response<Feed>
}