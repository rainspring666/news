package com.wuruoye.news

import org.junit.Assert.assertTrue
import org.junit.Test
class Test {
    @Test fun unitTestingWorks() {
        assertTrue(true)
    }

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
fun main(args: Array<String>) {
    com.wuruoye.news.Test().test()

}