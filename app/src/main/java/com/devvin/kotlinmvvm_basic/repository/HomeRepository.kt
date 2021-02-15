package com.devvin.kotlinmvvm_basic.repository

import android.util.Log
import com.devvin.kotlinmvvm_basic.model.HeroData
import com.devvin.kotlinmvvm_basic.webservice.NetworkResponse
import com.devvin.kotlinmvvm_basic.webservice.NetworkResponseListener
import com.devvin.kotlinmvvm_basic.webservice.WebserviceClass
import retrofit2.Response

class HomeRepository : NetworkResponseListener<List<HeroData>> {

    private val webservice = WebserviceClass.makeRetrofitService()

    fun getHeroList(): List<HeroData>? {
        webservice.getHeroes().enqueue(object : NetworkResponse<List<HeroData>>(this){})
        return null
    }

    override fun onSuccess(response: List<HeroData>) {
       Log.i("onSuccess","received")
    }
}