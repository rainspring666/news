package com.wuruoye.news.model.bean


data class Title(
        var title: String,
        var items: Map<String, Item>
) {
}