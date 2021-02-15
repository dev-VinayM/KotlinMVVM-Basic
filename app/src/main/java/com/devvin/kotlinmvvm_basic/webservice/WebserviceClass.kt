package com.devvin.kotlinmvvm_basic.webservice

import android.content.Context
import com.devvin.kotlinmvvm_basic.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object WebserviceClass {

    fun makeRetrofitService(): Webservice {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(Webservice::class.java)
    }
}