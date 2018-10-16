package com.wuruoye.news.contract

import com.wuruoye.library.contract.WIView
import com.wuruoye.library.contract.WPresenter


class WebContract {
    interface View : WIView {

    }

    abstract class Presenter : WPresenter<View>() {

    }
}