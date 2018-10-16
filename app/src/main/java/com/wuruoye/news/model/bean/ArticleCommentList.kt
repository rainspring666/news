package com.wuruoye.news.model.bean


data class ArticleCommentList(
        var next: Long,
        var list: List<ArticleComment>
)