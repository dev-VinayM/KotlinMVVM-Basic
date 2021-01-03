package com.devvin.kotlinmvvm_basic.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.devvin.kotlinmvvm_basic.R
import com.devvin.kotlinmvvm_basic.viewmodel.HomeViewModel

class HomeActivity : AppCompatActivity() {
    // create viewmodel instance, if the activity is recreated it receives the same
    // instance of viewmodel
    private val viewModel : HomeViewModel by viewModels()           //from activity-ktx artifact

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.getHeroesListFromRepository()

    }
}