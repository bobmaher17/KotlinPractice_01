package id.maher.moviedb.Main

import com.google.gson.Gson
import id.maher.moviedb.Model.MovieResponse
import id.maher.moviedb.Network.ApiRepository
import id.maher.moviedb.Network.TMDBApi
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread

class MainPresenter(private val view: MainView, private val apiRepository: ApiRepository, private val gson: Gson) {
    fun getMovieList(){
        doAsync {
            val data = gson.fromJson(apiRepository.doRequest(TMDBApi.getMovie()),
                MovieResponse::class.java)
            uiThread {
                view.showMovieList(data.results)
            }
        }
    }
}