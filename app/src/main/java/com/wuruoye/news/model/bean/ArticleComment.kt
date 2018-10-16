package com.wuruoye.news.model.bean


data class ArticleComment(
        var id: Int,
        var article: String,
        var user: LoginUser,
        var parent: ArticleComment?,
        var content: String,
        var time: Long,
        var praise_num: Int,
        var comment_num: Int,
        var is_praise: Boolean
)