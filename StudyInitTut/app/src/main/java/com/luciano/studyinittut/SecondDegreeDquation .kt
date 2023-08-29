package com.luciano.studyinittut

fun main() {
    secondDegree()
}

private fun helloWord() {
    var msg: String = "Hello, Word"
    println(msg)
    msg = "Esse texto é novo"
    var result = readLine()
    println(msg)
    println(result)
}

private fun secondDegree() {

    println(" Qual o valor de A:")
    var a: Double = readLine()!!.toDouble()
    println("Qual o valor de B: ")
    var b: Double = readLine()!!.toDouble()
    println("Qual o valor de c: ")
    var c = readLine()!!.toDouble()
    println("Resultado: ")
    var result = a + b + c
    println("Resultado: $result")
}