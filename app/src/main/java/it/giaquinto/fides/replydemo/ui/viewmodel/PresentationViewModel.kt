package it.giaquinto.fides.replydemo.ui.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import it.giaquinto.fides.replydemo.model.FeedContainer
import it.giaquinto.fides.replydemo.model.feedrss.Feed
import it.giaquinto.fides.replydemo.model.feedrss.FeedItem
import it.giaquinto.fides.replydemo.request.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.cancelChildren
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class PresentationViewModel @Inject constructor(
    private val ansaRssService: AnsaRssService,
    private val miurRssService: MiurRssService,
    private val repubblicaRssService: RepubblicaRssService,
    private val tomsHwRssService: TomsHwRssService,
    private val agiRssService: AgiRssService,
    private val fattoQuotidianoRssService: IlFattoQuotidianoRssService,
    private val feedContainer: FeedContainer
) : ViewModel() {
    // Interni
    private val coroutine = CoroutineScope(Dispatchers.IO)

    // Esposti
    val progress = MutableLiveData<Int>()
    val text = MutableLiveData<String>()

    lateinit var switchToNext: () -> Unit

    init {
        progress.value = 0
        text.value = "Start"
    }

    suspend fun fetch() {
        coroutine.async {
            elaborate(
                ansaRssService.getHome(),
                "Ansa Home",
                feedContainer.publisher["Ansa"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                ansaRssService.getCinema(),
                "Ansa Cinema",
                feedContainer.publisher["Ansa"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                ansaRssService.getPolitica(),
                "Ansa Politica",
                feedContainer.publisher["Ansa"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                ansaRssService.getWorld(),
                "Ansa Mondo",
                feedContainer.publisher["Ansa"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                ansaRssService.getEconomy(),
                "Ansa Economy",
                feedContainer.publisher["Ansa"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                ansaRssService.getSoccer(),
                "Ansa Calcio",
                feedContainer.publisher["Ansa"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                ansaRssService.getCulture(),
                "Ansa Culture",
                feedContainer.publisher["Ansa"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                ansaRssService.getTech(),
                "Ansa Tech",
                feedContainer.publisher["Ansa"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                ansaRssService.getTopNews(),
                "Ansa Top News",
                feedContainer.publisher["Ansa"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                ansaRssService.getPhoto(),
                "Ansa Foto",
                feedContainer.publisher["Ansa"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                ansaRssService.getVideo(),
                "Ansa Video",
                feedContainer.publisher["Ansa"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                miurRssService.getNews(),
                "Miur News",
                feedContainer.publisher["Miur"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                miurRssService.getComunication(),
                "Miur Comunicati",
                feedContainer.publisher["Miur"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                miurRssService.getNotification(),
                "Miur Atti di notifica",
                feedContainer.publisher["Miur"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                miurRssService.getNormativa(),
                "Miur Normativa",
                feedContainer.publisher["Miur"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getHome(),
                "Repubblica Home",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getPolitica(),
                "Repubblica Politica",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getEsteri(),
                "Repubblica Esteri",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getEconomia(),
                "Repubblica Normativa",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getCronaca(),
                "Repubblica Cronaca",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getGallerie(),
                "Repubblica Gallerie",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getAmbiente(),
                "Repubblica Ambiente",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getSolidarieta(),
                "Repubblica Solidarietà",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getPersone(),
                "Repubblica Persone",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getSalute(),
                "Repubblica Salute",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getScuola(),
                "Repubblica Scuola",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getScienza(),
                "Repubblica Scienza",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getTecnologia(),
                "Repubblica Tecnologia",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getSport(),
                "Repubblica Sport",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getCalcio(),
                "Repubblica Calcio",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getSerieA(),
                "Repubblica SerieA",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getSerieB(),
                "Repubblica SerieB",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getFormulaUno(),
                "Repubblica Formula Uno",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getMotoGp(),
                "Repubblica Moto GP",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getTennis(),
                "Repubblica Tennis",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getBasket(),
                "Repubblica Basket",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getRugby(),
                "Repubblica Rugby",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getCiclismo(),
                "Repubblica Ciclismo",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getGolf(),
                "Repubblica Golf",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getOtherSports(),
                "Repubblica Altri sports",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getArte(),
                "Repubblica Arte",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getCultura(),
                "Repubblica Cultura",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getFuoriGiri(),
                "Repubblica Fuori Giri",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getMonsignore(),
                "Repubblica Monsignore",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getCruciverba(),
                "Repubblica Cruciverba",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getGraffio(),
                "Repubblica Graffio",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getLaParola(),
                "Repubblica La Parola",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getLessicoENuvole(),
                "Repubblica Lessico e Nuvole",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getLobby(),
                "Repubblica Lobby",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getNaviInBottiglia(),
                "Repubblica Navi in bottiglia",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getPotere(),
                "Repubblica Potere",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getPuntoSvirgola(),
                "Repubblica Punto e Svirgola",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getBussole(),
                "Repubblica Bussole",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getSpyCalcio(),
                "Repubblica Spy Calcio",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getPolis(),
                "Repubblica Polis",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                repubblicaRssService.getDekoder(),
                "Repubblica Dekoder",
                feedContainer.publisher["Repubblica"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                tomsHwRssService.getHome(),
                "TomsHW",
                feedContainer.publisher["TomsHW"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                tomsHwRssService.getAutomotive(),
                "TomsHW Automotive",
                feedContainer.publisher["TomsHW"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                tomsHwRssService.getBusiness(),
                "TomsHW Business",
                feedContainer.publisher["TomsHW"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                tomsHwRssService.getDiscount(),
                "TomsHW Discount",
                feedContainer.publisher["TomsHW"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                tomsHwRssService.getGame(),
                "TomsHW Game",
                feedContainer.publisher["TomsHW"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                tomsHwRssService.getHardware(),
                "TomsHW Hardware",
                feedContainer.publisher["TomsHW"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                tomsHwRssService.getPopCulture(),
                "TomsHW Pop Culture",
                feedContainer.publisher["TomsHW"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                tomsHwRssService.getSmartphone(),
                "TomsHW Smartphone",
                feedContainer.publisher["TomsHW"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                tomsHwRssService.getScience(),
                "TomsHW Science",
                feedContainer.publisher["TomsHW"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                tomsHwRssService.getMore(),
                "TomsHW More",
                feedContainer.publisher["TomsHW"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                agiRssService.cronaca(),
                "AGI Cronaca",
                feedContainer.publisher["AGI"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                agiRssService.economia(),
                "AGI Economia",
                feedContainer.publisher["AGI"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                agiRssService.politica(),
                "AGI Politica",
                feedContainer.publisher["AGI"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                agiRssService.estero(),
                "AGI Estero",
                feedContainer.publisher["AGI"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                agiRssService.cultura(),
                "AGI Cultura",
                feedContainer.publisher["AGI"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                agiRssService.sport(),
                "AGI Sport",
                feedContainer.publisher["AGI"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                agiRssService.innovazione(),
                "AGI Innovazione",
                feedContainer.publisher["AGI"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                agiRssService.lifestyle(),
                "AGI Lifestyle",
                feedContainer.publisher["AGI"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                agiRssService.abruzzo(),
                "AGI Abruzzo",
                feedContainer.publisher["AGI"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                agiRssService.calabria(),
                "AGI Calabria",
                feedContainer.publisher["AGI"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                agiRssService.campania(),
                "AGI Campania",
                feedContainer.publisher["AGI"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                agiRssService.emiliaRomagna(),
                "AGI Emilia Romagna",
                feedContainer.publisher["AGI"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                agiRssService.friuliVeneziaGiulia(),
                "AGI Friuli Venezia Giulia",
                feedContainer.publisher["AGI"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                agiRssService.lazio(),
                "AGI Lazio",
                feedContainer.publisher["AGI"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                agiRssService.liguria(),
                "AGI Liguria",
                feedContainer.publisher["AGI"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                agiRssService.lombardia(),
                "AGI Lombardia",
                feedContainer.publisher["AGI"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                agiRssService.marche(),
                "AGI Marche",
                feedContainer.publisher["AGI"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                agiRssService.molise(),
                "AGI Molise",
                feedContainer.publisher["AGI"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                agiRssService.piemonte(),
                "AGI Piemonte",
                feedContainer.publisher["AGI"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                agiRssService.puglia(),
                "AGI Puglia",
                feedContainer.publisher["AGI"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                agiRssService.sardegna(),
                "AGI Sardegna",
                feedContainer.publisher["AGI"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                agiRssService.sicilia(),
                "AGI Sicilia",
                feedContainer.publisher["AGI"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                agiRssService.toscana(),
                "AGI Toscana",
                feedContainer.publisher["AGI"]!!
            )
        }.await()
        coroutine.async {
            elaborate(
                agiRssService.umbria(),
                "AGI Umbria",
                feedContainer.publisher["AGI"]!!
            )
        }.await()

        coroutine.async {
            elaborate(
                agiRssService.veneto(),
                "AGI Veneto",
                feedContainer.publisher["AGI"]!!
            )
        }.await()

        coroutine.async {
            elaborate(
                fattoQuotidianoRssService.getHome(),
                "Fatto Quotidiano",
                feedContainer.publisher["FattoQuotidiano"]!!
            )
        }.await()

        switchToNext()
    }

    /**
     * Nel caso l'applicazione venga chiusa, termino tutte le coroutine
     */
    fun stopCoroutine() {
        Log.e("PresentationViewModel", "Cancel all jobs")
        coroutine.coroutineContext.cancelChildren()
    }

    /**
     * Elabora la risposta e provvede a pooplare le relative mappe
     */
    private fun elaborate(
        response: Response<Feed>,
        entity: String,
        map: MutableMap<String, List<FeedItem>>
    ) {
        Log.e("PresentationViewModel", "$entity on ${System.currentTimeMillis()}")
        val feed: Feed? = try {
            response.body()
        } catch (cause: Exception) {
            Log.e("PresentationViewModel", "error parsing response")
            null
        }

        feed?.let {
            progress.postValue(progress.value?.plus(1) ?: 0)
            text.postValue(entity)
            if (it.channelTitle != null && it.articleList != null) {
                map[it.channelTitle!!] = it.articleList!!
            }
        }
    }
}