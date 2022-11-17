package functions

import java.util.*

// No parameters, no return value
fun helloWorld(){
    println("Hello world!")
}

// 1 parameter, no return value
fun printWithSpaces(text: String){
    for (char in text){
        print(char + " ")
    }
    println()
}

// No parameters, returns Date
fun getCurrentDate(): Date {
    return Date()
}

// 2 parapmeters, returns Int
fun max(a: Int, b: Int): Int {
    if(a >= b){
        return a
    } else {
        return b
    }
}

fun main(args: Array<String>) {
    helloWorld()
    printWithSpaces("Kotlin is awsome!")
    println(getCurrentDate())




}