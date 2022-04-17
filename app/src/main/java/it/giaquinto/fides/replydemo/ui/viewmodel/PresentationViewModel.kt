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
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class PresentationViewModel @Inject constructor(
    private val ansaRssService: AnsaRssService,
    private val miurRssService: MiurRssService,
    private val repubblicaRssService: RepubblicaRssService,
    private val tomsHwRssService: TomsHwRssService,
    private val agiRssService: AgiRssService,
    private val feedContainer: FeedContainer
) : ViewModel() {
    val progress = MutableLiveData<Int>()
    val text = MutableLiveData<String>()

    var counter = 0
    var sempaphoreForSwitch = true
    lateinit var switchToNext: () -> Unit

    init {
        progress.value = 0
        text.value = "Start"
    }

    suspend fun fetch() {
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                ansaRssService.getHome(),
                "Ansa Home",
                feedContainer.publisher["Ansa"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                ansaRssService.getCinema(),
                "Ansa Cinema",
                feedContainer.publisher["Ansa"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                ansaRssService.getPolitica(),
                "Ansa Politica",
                feedContainer.publisher["Ansa"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                ansaRssService.getWorld(),
                "Ansa Mondo",
                feedContainer.publisher["Ansa"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                ansaRssService.getEconomy(),
                "Ansa Economy",
                feedContainer.publisher["Ansa"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                ansaRssService.getSoccer(),
                "Ansa Calcio",
                feedContainer.publisher["Ansa"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                ansaRssService.getCulture(),
                "Ansa Culture",
                feedContainer.publisher["Ansa"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                ansaRssService.getTech(),
                "Ansa Tech",
                feedContainer.publisher["Ansa"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                ansaRssService.getTopNews(),
                "Ansa Top News",
                feedContainer.publisher["Ansa"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                ansaRssService.getPhoto(),
                "Ansa Foto",
                feedContainer.publisher["Ansa"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                ansaRssService.getVideo(),
                "Ansa Video",
                feedContainer.publisher["Ansa"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                miurRssService.getNews(),
                "Miur News",
                feedContainer.publisher["Miur"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                miurRssService.getComunication(),
                "Miur Comunicati",
                feedContainer.publisher["Miur"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                miurRssService.getNotification(),
                "Miur Atti di notifica",
                feedContainer.publisher["Miur"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                miurRssService.getNormativa(),
                "Miur Normativa",
                feedContainer.publisher["Miur"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getHome(),
                "Repubblica Home",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getPolitica(),
                "Repubblica Politica",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getEsteri(),
                "Repubblica Esteri",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getEconomia(),
                "Repubblica Normativa",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getCronaca(),
                "Repubblica Cronaca",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getGallerie(),
                "Repubblica Gallerie",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getAmbiente(),
                "Repubblica Ambiente",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getSolidarieta(),
                "Repubblica Solidarietà",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getPersone(),
                "Repubblica Persone",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getSalute(),
                "Repubblica Salute",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getScuola(),
                "Repubblica Scuola",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getScienza(),
                "Repubblica Scienza",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getTecnologia(),
                "Repubblica Tecnologia",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getSport(),
                "Repubblica Sport",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getCalcio(),
                "Repubblica Calcio",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getSerieA(),
                "Repubblica SerieA",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getSerieB(),
                "Repubblica SerieB",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getFormulaUno(),
                "Repubblica Formula Uno",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getMotoGp(),
                "Repubblica Moto GP",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getTennis(),
                "Repubblica Tennis",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getBasket(),
                "Repubblica Basket",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getRugby(),
                "Repubblica Rugby",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getCiclismo(),
                "Repubblica Ciclismo",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getGolf(),
                "Repubblica Golf",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getOtherSports(),
                "Repubblica Altri sports",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getArte(),
                "Repubblica Arte",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getCultura(),
                "Repubblica Cultura",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getFuoriGiri(),
                "Repubblica Fuori Giri",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getMonsignore(),
                "Repubblica Monsignore",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getCruciverba(),
                "Repubblica Cruciverba",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getGraffio(),
                "Repubblica Graffio",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getLaParola(),
                "Repubblica La Parola",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getLessicoENuvole(),
                "Repubblica Lessico e Nuvole",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getLobby(),
                "Repubblica Lobby",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getNaviInBottiglia(),
                "Repubblica Navi in bottiglia",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getPotere(),
                "Repubblica Potere",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getPuntoSvirgola(),
                "Repubblica Punto e Svirgola",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getBussole(),
                "Repubblica Bussole",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getSpyCalcio(),
                "Repubblica Spy Calcio",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getPolis(),
                "Repubblica Polis",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                repubblicaRssService.getDekoder(),
                "Repubblica Dekoder",
                feedContainer.publisher["Repubblica"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                tomsHwRssService.getHome(),
                "TomsHW",
                feedContainer.publisher["TomsHW"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                tomsHwRssService.getAutomotive(),
                "TomsHW Automotive",
                feedContainer.publisher["TomsHW"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                tomsHwRssService.getBusiness(),
                "TomsHW Business",
                feedContainer.publisher["TomsHW"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                tomsHwRssService.getDiscount(),
                "TomsHW Discount",
                feedContainer.publisher["TomsHW"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                tomsHwRssService.getGame(),
                "TomsHW Game",
                feedContainer.publisher["TomsHW"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                tomsHwRssService.getHardware(),
                "TomsHW Hardware",
                feedContainer.publisher["TomsHW"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                tomsHwRssService.getPopCulture(),
                "TomsHW Pop Culture",
                feedContainer.publisher["TomsHW"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                tomsHwRssService.getSmartphone(),
                "TomsHW Smartphone",
                feedContainer.publisher["TomsHW"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                tomsHwRssService.getScience(),
                "TomsHW Science",
                feedContainer.publisher["TomsHW"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                tomsHwRssService.getMore(),
                "TomsHW More",
                feedContainer.publisher["TomsHW"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.cronaca(),
                "AGI Cronaca",
                feedContainer.publisher["AGI"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.economia(),
                "AGI Economia",
                feedContainer.publisher["AGI"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.politica(),
                "AGI Politica",
                feedContainer.publisher["AGI"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.estero(),
                "AGI Estero",
                feedContainer.publisher["AGI"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.cultura(),
                "AGI Cultura",
                feedContainer.publisher["AGI"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.sport(),
                "AGI Sport",
                feedContainer.publisher["AGI"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.innovazione(),
                "AGI Innovazione",
                feedContainer.publisher["AGI"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.lifestyle(),
                "AGI Lifestyle",
                feedContainer.publisher["AGI"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.abruzzo(),
                "AGI Abruzzo",
                feedContainer.publisher["AGI"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.calabria(),
                "AGI Calabria",
                feedContainer.publisher["AGI"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.campania(),
                "AGI Campania",
                feedContainer.publisher["AGI"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.emiliaRomagna(),
                "AGI Emilia Romagna",
                feedContainer.publisher["AGI"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.friuliVeneziaGiulia(),
                "AGI Friuli Venezia Giulia",
                feedContainer.publisher["AGI"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.lazio(),
                "AGI Lazio",
                feedContainer.publisher["AGI"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.liguria(),
                "AGI Liguria",
                feedContainer.publisher["AGI"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.lombardia(),
                "AGI Lombardia",
                feedContainer.publisher["AGI"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.marche(),
                "AGI Marche",
                feedContainer.publisher["AGI"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.molise(),
                "AGI Molise",
                feedContainer.publisher["AGI"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.piemonte(),
                "AGI Piemonte",
                feedContainer.publisher["AGI"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.puglia(),
                "AGI Puglia",
                feedContainer.publisher["AGI"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.sardegna(),
                "AGI Sardegna",
                feedContainer.publisher["AGI"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.sicilia(),
                "AGI Sicilia",
                feedContainer.publisher["AGI"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.toscana(),
                "AGI Toscana",
                feedContainer.publisher["AGI"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.umbria(),
                "AGI Umbria",
                feedContainer.publisher["AGI"]!!
            )
        }
        CoroutineScope(Dispatchers.IO).launch {
            elaborate(
                agiRssService.veneto(),
                "AGI Veneto",
                feedContainer.publisher["AGI"]!!
            )
        }
    }

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
        counter++

        feed?.let {
            progress.postValue(progress.value?.plus(1) ?: 0)
            text.postValue(entity)
            if (it.channelTitle != null && it.articleList != null) {
                map[it.channelTitle!!] = it.articleList!!
            }
        }

        if (counter > 60) {
            if (sempaphoreForSwitch) {
                sempaphoreForSwitch = false
                switchToNext()
            }
        }
    }
}