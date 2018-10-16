package com.wuruoye.news.model.widget

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import android.widget.HorizontalScrollView


class EventHorizontalScrollView : HorizontalScrollView{
    private var mOnTouchListener: OnTouchListener? = null

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) :
            super(context, attrs, defStyleAttr)

    override fun dispatchTouchEvent(ev: MotionEvent?): Boolean {
        if (ev!!.action == MotionEvent.ACTION_UP) {
            mOnTouchListener?.onTouchUp()
        }
        return super.dispatchTouchEvent(ev)
    }

    fun setOnTouchListener(listener: OnTouchListener) {
        mOnTouchListener = listener
    }

    interface OnTouchListener {
        fun onTouchUp()
    }
}