package com.wuruoye.news.model.bean


data class ArticleDetail(
        var app: String,
        var category: String,
        var id: String,
        var data: List<DetailItem>
)