package com.wuruoye.news.contract

import com.wuruoye.library.contract.WIView
import com.wuruoye.library.contract.WPresenter


class StartContract {
    interface View : WIView {
        fun onResultCheck(login: Boolean)
    }

    abstract class Presenter : WPresenter<View>() {
        abstract fun checkLogin()
        abstract fun getTextSize(): Float
        abstract fun isLead(): Boolean
    }
}