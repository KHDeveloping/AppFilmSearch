package com.example.filmsearch

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface Api {

    @GET("movie/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "96cb8dd19cc2146135ce0e64812ff6d3",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/now_playing")
    fun getNowPlayingMovies(
        @Query("api_key") apiKey: String = "96cb8dd19cc2146135ce0e64812ff6d3",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("movie/upcoming")
    fun getUpcomingMovies(
        @Query("api_key") apiKey: String = "96cb8dd19cc2146135ce0e64812ff6d3",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>

    @GET("search/movie")
    fun getSearchMovies(
        @Query("api_key") apiKey: String = "96cb8dd19cc2146135ce0e64812ff6d3",
        @Query("page") page: Int
      // @Query ("string") search: String
    ):Call<GetMoviesResponse>



}

