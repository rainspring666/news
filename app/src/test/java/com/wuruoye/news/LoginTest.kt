package com.wuruoye.news

import org.junit.Test

class LoginTest {

    lateinit var location:String
    var name:String = "java"
        get() = field.toUpperCase()
        private set(value) {
            if (value != ""){
                field = value
            }
        }
    fun test(){
        this.name = "kotlin"
        this.name = ""
        print(this.name)    //输出值为"KOTLIN"
    }
}
