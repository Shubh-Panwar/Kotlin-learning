package com.programming.practice

fun main(){
    println("Enter the first number")
    val num1=readln().toInt()
    println("Enter the 2nd number")
    val num2=readln().toInt()
val myresult:Int = add(num1,num2)
    println("The result of sum of $num1 and $num2 is $myresult")

}

fun add(num1:Int,num2:Int):Int{
    val result = num1+num2
    return result
}
