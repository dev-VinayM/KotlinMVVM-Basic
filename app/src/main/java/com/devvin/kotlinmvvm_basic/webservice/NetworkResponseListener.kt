package com.devvin.kotlinmvvm_basic.webservice

interface NetworkResponseListener<Response> {
    fun onSuccess(response : Response)
}