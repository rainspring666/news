package com.wuruoye.news.model.bean


data class ArticleList(
        var app: String,
        var category: String,
        var next: String,
        var data: List<ArticleItem>
)