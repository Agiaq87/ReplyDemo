package it.giaquinto.fides.replydemo.request

import it.giaquinto.fides.replydemo.model.feedrss.Feed
import retrofit2.Response
import retrofit2.http.GET

interface RepubblicaRssService {
    @GET("homepage/rss2.0.xml")
    suspend fun getHome(): Response<Feed>

    @GET("politica/rss2.0.xml")
    suspend fun getPolitica(): Response<Feed>

    @GET("esteri/rss2.0.xml")
    suspend fun getEsteri(): Response<Feed>

    @GET("economia/rss2.0.xml")
    suspend fun getEconomia(): Response<Feed>

    @GET("cronaca/rss2.0.xml")
    suspend fun getCronaca(): Response<Feed>

    @GET("gallerie/rss2.0.xml")
    suspend fun getGallerie(): Response<Feed>

    @GET("ambiente/rss2.0.xml")
    suspend fun getAmbiente(): Response<Feed>

    @GET("solidarieta/rss2.0.xml")
    suspend fun getSolidarieta(): Response<Feed>

    @GET("persone/rss2.0.xml")
    suspend fun getPersone(): Response<Feed>

    @GET("salute/rss2.0.xml")
    suspend fun getSalute(): Response<Feed>

    @GET("scuola_e_universita/rss2.0.xml")
    suspend fun getScuola(): Response<Feed>

    @GET("scienze/rss2.0.xml")
    suspend fun getScienza(): Response<Feed>

    @GET("tecnologia/rss2.0.xml")
    suspend fun getTecnologia(): Response<Feed>

    @GET("sport/rss2.0.xml")
    suspend fun getSport(): Response<Feed>

    @GET("sport/calcio/rss2.0.xml")
    suspend fun getCalcio(): Response<Feed>

    @GET("sport/serie-a/rss2.0.xml")
    suspend fun getSerieA(): Response<Feed>

    @GET("sport/serie-b/rss2.0.xml")
    suspend fun getSerieB(): Response<Feed>

    @GET("sport/formulauno/rss2.0.xml")
    suspend fun getFormulaUno(): Response<Feed>

    @GET("sport/motogp/rss2.0.xml")
    suspend fun getMotoGp(): Response<Feed>

    @GET("sport/tennis/rss2.0.xml")
    suspend fun getTennis(): Response<Feed>

    @GET("sport/basket/rss2.0.xml")
    suspend fun getBasket(): Response<Feed>

    @GET("sport/rugby/rss2.0.xml")
    suspend fun getRugby(): Response<Feed>

    @GET("sport/ciclismo/rss2.0.xml")
    suspend fun getCiclismo(): Response<Feed>

    @GET("sport/golf/rss2.0.xml")
    suspend fun getGolf(): Response<Feed>

    @GET("sport/vari/rss2.0.xml")
    suspend fun getOtherSports(): Response<Feed>

    @GET("speciali/arte/rss2.0.xml")
    suspend fun getArte(): Response<Feed>

    @GET("spettacoli_e_cultura/rss2.0.xml")
    suspend fun getCultura(): Response<Feed>

    @GET("rubriche/fuori-giri/rss2.0.xml")
    suspend fun getFuoriGiri(): Response<Feed>

    @GET("rubriche/il-monsignore/rss2.0.xml")
    suspend fun getMonsignore(): Response<Feed>

    @GET("rubriche/ilcruciverba/rss2.0.xml")
    suspend fun getCruciverba(): Response<Feed>

    @GET("rubriche/ilgraffio/rss2.0.xml")
    suspend fun getGraffio(): Response<Feed>

    @GET("rubriche/la-parola/rss2.0.xml")
    suspend fun getLaParola(): Response<Feed>

    @GET("rubriche/lessicoenuvole/rss2.0.xml")
    suspend fun getLessicoENuvole(): Response<Feed>

    @GET("rubriche/lobby/rss2.0.xml")
    suspend fun getLobby(): Response<Feed>

    @GET("rubriche/naviinbottiglia/rss2.0.xml")
    suspend fun getNaviInBottiglia(): Response<Feed>


    @GET("rubriche/poteri-invisibili/rss2.0.xml")
    suspend fun getPotere(): Response<Feed>

    @GET("rubriche/punto-e-svirgola/rss2.0.xml")
    suspend fun getPuntoSvirgola(): Response<Feed>

    @GET("rubriche/bussole/rss2.0.xml")
    suspend fun getBussole(): Response<Feed>

    @GET("rubriche/spycalcio/rss2.0.xml")
    suspend fun getSpyCalcio(): Response<Feed>

    @GET("rubriche/polis/rss2.0.xml")
    suspend fun getPolis(): Response<Feed>

    @GET("rubriche/dekoder/rss2.0.xml")
    suspend fun getDekoder(): Response<Feed>
}
