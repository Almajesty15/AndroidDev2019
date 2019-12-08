package com.example.myapplication.base


interface BasePresenter<in T : BaseView> {
    fun attachView(view: T)
    fun detachView()
}
