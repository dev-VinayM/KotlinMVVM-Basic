package com.devvin.kotlinmvvm_basic.webservice

import android.content.Context
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object WebserviceClass {

    private val BASE_URL: String = "https://simplifiedcoding.net/demos/"
    private var instance: Retrofit? = null

    fun makeRetrofitService(): Webservice {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(Webservice::class.java)
    }
}