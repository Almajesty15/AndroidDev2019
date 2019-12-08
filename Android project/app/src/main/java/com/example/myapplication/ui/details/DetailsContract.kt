package com.example.myapplication.ui.details

import com.example.myapplication.base.BasePresenter
import com.example.myapplication.base.BaseView


interface DetailsContract {
    interface View : BaseView
    interface Presenter : BasePresenter<View>
}
