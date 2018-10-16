package com.wuruoye.news.model.bean


data class ArticleCollect(
        var id: Int,
        var article: String,
        var user: String,
        var content: ArticleItem,
        var time: Long
)