package com.wuruoye.news.contract

import com.wuruoye.library.contract.WIView
import com.wuruoye.library.contract.WPresenter
import com.wuruoye.news.model.bean.Api
import com.wuruoye.news.model.bean.Title


class ItemChooseContract {
    interface View : WIView {

    }

    abstract class Presenter : WPresenter<View>() {
        abstract fun getApi(): Map<String, Api>
        abstract fun getApis(): List<Map.Entry<String, Api>>
    }
}