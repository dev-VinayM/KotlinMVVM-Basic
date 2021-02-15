package com.devvin.kotlinmvvm_basic.webservice

import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * generic class for all api calls.
 * if any method declared here, needs to be handled differently in any class,
 * those methods can be easily overridden
 */
abstract class NetworkResponse<T>(val listener: NetworkResponseListener<T>) : Callback<T> {

    override fun onFailure(call: Call<T>, t: Throwable) {
        Log.d("failed", "response")
    }

    override fun onResponse(call: Call<T>, response: retrofit2.Response<T>) {
        listener.onSuccess(response.body()!!)
    }

    fun makeApiCAll(){

    }
}