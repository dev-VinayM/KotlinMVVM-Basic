package com.devvin.kotlinmvvm_basic.viewmodel

import androidx.lifecycle.ViewModel
import com.devvin.kotlinmvvm_basic.model.HeroData
import com.devvin.kotlinmvvm_basic.repository.HomeRepository

class HomeViewModel : ViewModel() {
    val repository = HomeRepository()

    fun getHeroesListFromRepository() : List<HeroData>?{
        return repository.getHeroList()
    }
}