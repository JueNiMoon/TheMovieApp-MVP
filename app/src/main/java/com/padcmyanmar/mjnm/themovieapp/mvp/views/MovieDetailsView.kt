package com.padcmyanmar.mjnm.themovieapp.mvp.views

import com.padcmyanmar.mjnm.themovieapp.data.vos.ActorVO
import com.padcmyanmar.mjnm.themovieapp.data.vos.MovieVO

interface MovieDetailsView : BaseView {
    fun showMovieDetails(movie : MovieVO)
    fun showCreditByMovies(cast: List<ActorVO>,crew : List<ActorVO>)
    fun navigateBack()
}