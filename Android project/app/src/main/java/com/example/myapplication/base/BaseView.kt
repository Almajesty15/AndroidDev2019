package com.example.myapplication.base


interface BaseView {
    fun showError(error: String)
    fun injectDependencies()
}
