package com.andrew

fun main(args: Array<String>) {
//    print("Hello Kotlin")
//    Human().Hello() //執行呼叫類別名稱就可以new一個類別 前面不需要加new
    val h = Human()//使用val定義值之後，就不用再改變裡面的值。 也可以用var放入值
    h.Hello()
}

class Human {
    fun Hello(){ //如果不回傳任何值 也不用特別寫入void
        var age = 19 //指定為Int
        println("Hello Kotlin$age")
        var weight = 66.5f
        println("Hello Kotlin$weight")
        var name : String //如果用var空值，要先給資料型態才不會有錯誤
    }
}