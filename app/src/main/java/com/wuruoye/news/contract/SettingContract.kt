package com.wuruoye.news.contract

import com.wuruoye.library.contract.WIView
import com.wuruoye.library.contract.WPresenter


class SettingContract {
    interface View : WIView {
        fun onResultLogout(result: Boolean, info: String)
        fun onResultReloadApi(result: Boolean, info: String)
    }

    abstract class Presenter : WPresenter<View>() {
        abstract fun isLogin(): Boolean
        abstract fun setNoImg(check: Boolean)
        abstract fun setProxy(check: Boolean)
        abstract fun setWeb(check: Boolean)
        abstract fun setTextSize(scale: Float)
        abstract fun getNoImg(): Boolean
        abstract fun getProxy(): Boolean
        abstract fun getWeb(): Boolean
        abstract fun getTextSize(): Float
        abstract fun requestLogout()
        abstract fun requestReloadApi()
    }
}