package com.example.kotlinpractice

open class Human constructor(val name:String="Anonymous"){
    //constructor 생략가능
    constructor(name:String,age:Int):this(name){
        println("my name is ${name}, ${age}years old")
    }
    //주생성자 실행 후에 부생성자 실행
    init{
        println("New human has been born!!")
    }
    fun eatingCake(){
        println("This is so yummy~")
    }

    open fun singASong(){
        println("lalala")
    }
}

class Korean : Human(){
    override fun singASong(){
        super.singASong()
        println("라라라")
        println("my name is :${name}")
    }
}


fun main() {
//    val human = Human("minsu")
//    val stranger=Human()
//    human.eatingCake()
   val mom=Human("Kuri",50)
//    println("this human's name is ${stranger.name}")
    val korean=Korean()
    korean.singASong()
}