package com.example.cinemiron.api

import okhttp3.OkHttpClient

object ApiClient {
    private const val BASE_URL= "https://api.themoviedb.org/3/"

    private val loggingInterceptor = HttpLoggingInterceptor().apply{

    }

}