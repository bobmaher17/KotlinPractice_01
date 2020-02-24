package id.maher.moviedb.Network

import id.maher.moviedb.BuildConfig.API_KEY
import id.maher.moviedb.BuildConfig.BASE_URL

object TMDBApi {
    fun getMovie(): String{
        return BASE_URL + API_KEY
    }
}