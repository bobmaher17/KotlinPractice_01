package id.maher.moviedb.Main

import id.maher.moviedb.Model.Movie

interface MainView{
    fun showMovieList(data: List<Movie>)
}
