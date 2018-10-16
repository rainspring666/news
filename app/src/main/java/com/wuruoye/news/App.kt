package com.wuruoye.news

import android.app.Application
import com.wuruoye.library.model.WConfig
import com.wuruoye.library.util.thread.DefaultThreadPool
import com.wuruoye.news.model.NetRequest


class App : Application() {
    override fun onCreate() {
        super.onCreate()

        WConfig.init(this)
        WConfig.initThreadPool(DefaultThreadPool())
        WConfig.initNet(NetRequest())
    }
}