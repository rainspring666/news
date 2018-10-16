package com.wuruoye.news.model.bean


data class ArticleInfo (
        var comment_num: Int,
        var praise_num: Int,
        var collect_num: Int,
        var is_praise: Boolean,
        var is_collect: Boolean
) {
}