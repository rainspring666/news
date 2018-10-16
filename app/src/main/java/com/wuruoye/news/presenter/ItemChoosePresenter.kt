package com.wuruoye.news.presenter

import com.wuruoye.news.contract.ItemChooseContract
import com.wuruoye.news.model.UserCache
import com.wuruoye.news.model.bean.Api
import com.wuruoye.news.model.bean.Title


class ItemChoosePresenter : ItemChooseContract.Presenter() {
    override fun getApi(): Map<String, Api> {
        return UserCache.getInstance().api
    }

    override fun getApis(): List<Map.Entry<String, Api>> {
        val list = arrayListOf<Map.Entry<String, Api>>()
        list.addAll(getApi().entries)
        return list
    }
}