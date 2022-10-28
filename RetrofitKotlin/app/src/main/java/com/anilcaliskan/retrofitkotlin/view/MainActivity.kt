package com.anilcaliskan.retrofitkotlin.view

import android.app.TaskStackBuilder.create
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anilcaliskan.retrofitkotlin.R
import com.anilcaliskan.retrofitkotlin.model.CryptoModel
import com.anilcaliskan.retrofitkotlin.service.CryproAPI
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import java.util.*

class MainActivity : AppCompatActivity() {
    private val BASE_URL = "https://raw.githubusercontent.com/"
    private val cryptoModels: ArrayList<CryptoModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //5d03bd94fe4e492ae78dda7c49a0723a8d3062a0

        loadData()
    }
    private fun loadData(){

        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(CryproAPI::class.java)

    }
}


