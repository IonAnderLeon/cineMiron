package com.example.cinemiron.api

import com.example.mywhatsapp.data.Pelis
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieApiService {

    @GET("search/movie")
    suspend fun searchMovies(
        @Query("query") query: String,
        @Query("api_key") apiKey: String,
        @Query("language") language : String = "es-ES",
        @Query("page") page : Int = 1
    )

    @GET("movie/{movie_id}")
    suspend fun getMovieDetails(
        @Path("movie_id")movieID: Int,
        @Query("api_key") apiKey: String,
        @Query("language") language: String = "es-ES"
        ): Pelis



}