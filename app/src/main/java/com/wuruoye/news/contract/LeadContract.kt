package com.wuruoye.news.contract

import com.wuruoye.library.contract.WIView
import com.wuruoye.library.contract.WPresenter


class LeadContract {
    interface View : WIView {
        fun goToNext()
    }

    abstract class Presenter : WPresenter<View>() {
        abstract fun setLead()
    }
}