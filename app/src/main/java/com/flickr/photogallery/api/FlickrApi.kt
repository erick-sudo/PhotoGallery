package com.flickr.photogallery.api

import retrofit2.http.GET
import retrofit2.http.Query

interface FlickrApi {

    @GET("/services/rest/?method=flickr.interestingness.getList")
    // @GET("/services/rest/list/")
    suspend fun fetchPhotos(): FlickrResponse

    @GET("/services/rest/?method=flickr.photos.search")
    // @GET("/services/rest/search/")
    suspend fun searchPhotos(@Query("text") query: String): FlickrResponse
}