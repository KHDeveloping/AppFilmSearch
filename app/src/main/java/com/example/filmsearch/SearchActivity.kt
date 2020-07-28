package com.example.filmsearch

import android.content.Intent
import android.os.Bundle
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/*
class SearchActivity : AppCompatActivity() {

    private fun showMovieDetails(movie: Movie) {
        val intent = Intent(this, MovieDetailsActivity::class.java)
        intent.putExtra(MOVIE_BACKDROP, movie.backdropPath)
        intent.putExtra(MOVIE_POSTER, movie.posterPath)
        intent.putExtra(MOVIE_TITLE, movie.title)
        intent.putExtra(MOVIE_RATING, movie.rating)
        intent.putExtra(MOVIE_RELEASE_DATE, movie.releaseDate)
        intent.putExtra(MOVIE_OVERVIEW, movie.overview)
        startActivity(intent)
    }

    private lateinit var searchMovies: RecyclerView
    private lateinit var searchMoviesAdapter: MoviesAdapter
    private lateinit var searchMoviesLayoutMgr: LinearLayoutManager

    private var searchMoviesPage = 1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener() {
            fun onQueryTextSubmit(query: String?): Boolean {
                return true
            }

            fun onQueryTextChange(newText: String?): Boolean {
                return true
            }
        })



        searchMovies = findViewById(android.R.id.search_movies)
        searchMoviesLayoutMgr = LinearLayoutManager(
            this,
            LinearLayoutManager.HORIZONTAL,
            false
        )
        searchMovies.layoutManager = searchMoviesLayoutMgr
        searchMoviesAdapter = MoviesAdapter(mutableListOf()) { movie -> showMovieDetails(movie) }
        searchMovies.adapter = searchMoviesAdapter

        getSearchMovies()
    }


    private fun getSearchMovies() {
        MoviesRepository.getSearchMovies(
            searchMoviesPage,
            ::onSearchMoviesFetched,
            ::onError
        )
    }


    private fun attachSearchMoviesOnScrollListener() {
        searchMovies.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                val totalItemCount = searchMoviesLayoutMgr.itemCount
                val visibleItemCount = searchMoviesLayoutMgr.childCount
                val firstVisibleItem = searchMoviesLayoutMgr.findFirstVisibleItemPosition()

                if (firstVisibleItem + visibleItemCount >= totalItemCount / 2) {
                    searchMovies.removeOnScrollListener(this)
                    searchMoviesPage++
                    getSearchMovies()
                }
            }
        })
    }

    private fun onSearchMoviesFetched(movies: List<Movie>) {
        searchMoviesAdapter.appendMovies(movies)
        attachSearchMoviesOnScrollListener()
    }

    private fun onError() {
        Toast.makeText(this,"error", Toast.LENGTH_SHORT).show()
    }


}
*/