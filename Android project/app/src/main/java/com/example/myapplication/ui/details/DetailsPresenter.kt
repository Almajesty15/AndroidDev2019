package com.example.myapplication.ui.details



class DetailsPresenter : DetailsContract.Presenter {
    private var view: DetailsContract.View? = null

    override fun attachView(view: DetailsContract.View) {
        this.view = view
    }

    override fun detachView() {
        this.view = null
    }
}
