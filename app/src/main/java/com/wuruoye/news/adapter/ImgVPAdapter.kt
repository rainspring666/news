package com.wuruoye.news.adapter

import android.support.v4.view.PagerAdapter
import android.view.View
import android.view.ViewGroup


class ImgVPAdapter(
        private val imgList: List<View>
) :PagerAdapter() {


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun getCount(): Int {
        return imgList.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = imgList[position]
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}