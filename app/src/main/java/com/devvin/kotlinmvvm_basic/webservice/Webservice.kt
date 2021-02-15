package com.devvin.kotlinmvvm_basic.webservice

import com.devvin.kotlinmvvm_basic.model.HeroData
import retrofit2.Call
import retrofit2.http.GET

interface Webservice {

    @GET("marvel")
    fun getHeroes(): Call<List<HeroData>>
}