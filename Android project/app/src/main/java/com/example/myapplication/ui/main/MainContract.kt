package com.example.myapplication.ui.main

import com.example.myapplication.base.BasePresenter
import com.example.myapplication.base.BaseView
import com.example.myapplication.data.entities.Repository


interface MainContract {
    interface View : BaseView {
        fun showResults(results: List<Repository>)
        fun showProgress()
        fun hideProgress()
    }

    interface Presenter : BasePresenter<View> {
        fun loadResults()
    }
}
