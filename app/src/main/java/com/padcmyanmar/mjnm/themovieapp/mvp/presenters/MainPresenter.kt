package com.padcmyanmar.mjnm.themovieapp.mvp.presenters

import com.padcmyanmar.mjnm.themovieapp.delegates.BannerViewHolderDelegate
import com.padcmyanmar.mjnm.themovieapp.delegates.MovieViewHolderDelegate
import com.padcmyanmar.mjnm.themovieapp.delegates.ShowcaseViewHolderDelegate
import com.padcmyanmar.mjnm.themovieapp.mvp.views.MainView

interface MainPresenter : IBasePresenter, BannerViewHolderDelegate, ShowcaseViewHolderDelegate,
        MovieViewHolderDelegate{
            fun initView(view: MainView)
            fun onTapGenre(genrePosition: Int)
}