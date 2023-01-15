package com.example.kotlinpractice

val square={number :Int -> number*number}
val nameAge ={name:String, age:Int ->
    "my name is ${name}, I'm ${age}."
}

val pizzaIsGreat:String.()->String={
    this + "Pizza is the best!"
}

fun extendString(name:String, age:Int):String{
    val introduce :String.(Int)->String= {"I am ${this} and ${it} years old"}
    return name.introduce(age)
}

val calculateGrade:(Int)->String={
    when (it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

fun main() {
    println(square(12))
    println(nameAge("heeyeon",22))
    val a= "heeyeon said "
    println(a.pizzaIsGreat())
    println(extendString("heeyeon",22))
    println(calculateGrade(97))
}