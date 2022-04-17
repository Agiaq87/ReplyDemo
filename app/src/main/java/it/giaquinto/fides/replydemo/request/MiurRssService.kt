package it.giaquinto.fides.replydemo.request

import it.giaquinto.fides.replydemo.model.feedrss.Feed
import retrofit2.Response
import retrofit2.http.GET

interface MiurRssService {
    @GET("documents/20182/0/news-mi-rss.xml/2354a985-3d0c-f2df-1945-713c198bb8ad?t=1634916151826")
    suspend fun getNews(): Response<Feed>

    @GET("comunicati?p_p_id=com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_PQibxq1lWdyu&p_p_lifecycle=2&p_p_state=normal&p_p_mode=view&p_p_resource_id=getRSS&p_p_cacheability=cacheLevelPage")
    suspend fun getComunication(): Response<Feed>

    @GET("atti-di-notifica?p_p_id=com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_1iuwg1bAWS5K&p_p_lifecycle=2&p_p_state=normal&p_p_mode=view&p_p_resource_id=getRSS&p_p_cacheability=cacheLevelPage")
    suspend fun getNotification(): Response<Feed>

    @GET("normativa?p_p_id=com_liferay_asset_publisher_web_portlet_AssetPublisherPortlet_INSTANCE_OXOyq2TZX0Cz&p_p_lifecycle=2&p_p_state=normal&p_p_mode=view&p_p_resource_id=getRSS&p_p_cacheability=cacheLevelPage")
    suspend fun getNormativa(): Response<Feed>
}