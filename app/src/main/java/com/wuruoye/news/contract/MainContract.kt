package com.wuruoye.news.contract

import com.wuruoye.library.contract.WIView
import com.wuruoye.library.contract.WPresenter


class MainContract {
    interface View : WIView {
        fun onResultApi()
        fun onLogin()
    }

    abstract class Presenter : WPresenter<View>() {
        abstract fun requestApi()
    }
}