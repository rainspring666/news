package com.wuruoye.news.presenter

import com.wuruoye.news.contract.LeadContract
import com.wuruoye.news.model.UserCache


class LeadPresenter : LeadContract.Presenter() {
    private val mUserCache = UserCache.getInstance()

    override fun setLead() {
        mUserCache.isLead = true
    }
}