package com.example.kotlinpractice

fun main(){
    //helloWorld()
    //println(add(4,5))
//    val name = "heeyeon"
//    val lastName = "Lee"
//    println("my name is ${name + lastName} I'm 22")
//    println("is this true? ${1==0}")
//    println("this is 2\$a")
    //checkNum(2)
    //forAndWhile()
    //nullCheck()
    ignoreNulls("a")
}

fun helloWorld() : Unit{
    println("Hello World!")
}

fun add(a:Int, b:Int):Int{
    return a+b
}

fun hi(){
    var a:Int=10
    var b:Int=9

    b=100

    val c=100
    var d=100
    var name="heeyeon"
}

fun maxBy(a:Int,b:Int):Int=if(a>b) a else b

fun checkNum(score:Int) {
    when (score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
    }
    var b: Int = when (score) {
        1 -> 1
        2 -> 2
        else -> 3
    }
    println("b : ${b}")

    when (score) {
        in 90..100 -> println("Good")
        in 10..80 -> println("Not bad")
        else -> println("okay")
    }
}

fun array(){
    val array=arrayOf(1,2,3)
    val list= listOf(1,2,3)

    val array2= arrayOf(1,"d",3.4f)
    val list2 = listOf(1, "d", 11L)

    array[0]=3
    val result=list.get(0)

    val arrayList= arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 20

}

fun forAndWhile(){
    val students = arrayListOf("joyce", "james", "jenny", "jennifer")

    for (name in students){
        println("${name}")
    }

    for ((index,name)in students.withIndex()){
        println("${index+1}번째 학생 : ${name}")
    }

    var sum: Int = 0
    for(i in 1..10){
        sum+=i
    }
    println(sum)

    var index:Int=0
    while(index<10){
        println("current index : ${index}")
        index++
    }
}

fun nullCheck(){
    var name: String = "joyce"
    var nullName: String? = null

    var nameInUpperCase=name.toUpperCase()
    var nullNameInUpperCase = nullName?.toUpperCase()

    val lastname: String? = null
    val fullname = name + " " + (lastname ?: "No lastName")
    println(fullname)
}

fun ignoreNulls(str:String?){
    val mNotNull: String = str!!
    val upper=mNotNull.toUpperCase()

    val email: String? = "heeyeonXX@nana.vom"
    email?.let{
        println("my email is ${email}"/*+it*/)
    }
}