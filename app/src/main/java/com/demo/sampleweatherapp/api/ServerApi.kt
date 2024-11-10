package com.demo.sampleweatherapp.api

import retrofit2.http.GET
import retrofit2.http.Query

interface ServerApi {

    @GET("current.json")
    suspend fun getCityWeatherAndImage(@Query("key")  key:String , @Query("q")  q:String ) : String


}