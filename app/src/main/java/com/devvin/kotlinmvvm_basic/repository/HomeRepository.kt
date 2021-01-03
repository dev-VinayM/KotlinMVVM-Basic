package com.devvin.kotlinmvvm_basic.repository

import android.util.Log
import com.devvin.kotlinmvvm_basic.model.HeroData
import com.devvin.kotlinmvvm_basic.webservice.WebserviceClass
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeRepository {

    private val webservice = WebserviceClass.makeRetrofitService()

    fun getHeroList() : List<HeroData>?{
        webservice.getHeroes().enqueue(object : Callback<HeroData> {
            override fun onFailure(call: Call<HeroData>, t: Throwable) {
                Log.d("success","response")
            }

            override fun onResponse(call: Call<HeroData>, response: Response<HeroData>) {
                Log.d("failed","response")
            }
        })
        return null
    }
}