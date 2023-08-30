
package com.luciano.studyinittut

import kotlin.math.cos

fun main() {
    IMC()
}

private fun helloWord() {
    var msg: String = "Hello, Word"
    println(msg)
    msg = "Esse texto é novo"
    var result = readLine()
    println(msg)
    println(result)
    println("--------------------------------------")
}

private fun tree() {
    val a = 10
    val b = 20
    val c = 5
    if (a > b) {
        println("A maior $a")
    }
    else println("B é maior $b")
    println("-------------")

    if (a > b && b > c) {
        println("Verdadeiro")
    } else println("Falso")
}

private fun secondDegree() {

    println(
        " Qual o valor de A:")
    var a: Double = readLine()!!.toDouble()
    println("Qual o valor de B: ")
    var b: Double = readLine()!!.toDouble()
    println("Qual o valor de c: ")
    var c = readLine()!!.toDouble()
    println("Resultado: ")
    var result = a + b + c
    println("Resultado: $result")
}

private fun candleTheCake() {
    println("Digite o ano atual: ")
    var currentYear = readln().toInt()
    println("Digite o ano de nascimento")
    var birthYear = readln().toInt()
    var result = currentYear - birthYear
    println("Quantidade de velinhas para por no bolo: $result")
}

private fun modeConverter() {
    println("Quanto você tem em reais?")
    var priceOrigin = readln().toFloat()
    println("Valor da cotação em dólar?")
    var price = readln().toFloat()
    var result = priceOrigin / price
    println("O valor em dólar é R$: $result")


}
private fun realToDollar() {
    println("Qual o valor em reais?")
    var priceOrigin = readln().toFloat()
    println("Qual o valor da cotação?")
    var price = readln().toFloat()
    var result = priceOrigin / price
    println("O seu valor em reais para dólar R$: $result")
}
private fun celsius() {
    println("Qual a temperatura em Celsius?")
    var tempCelsius = readln().toFloat()
    var faire = 0F

    var resultC = tempCelsius / 5
    var celsius = resultC * 9
    faire = 32 + celsius
    println("O resultado é: $faire F")
}

private fun temperatura() {
    println("Qual a temperatura aqui?")
    var tempF = readln().toFloat()
    var celsius = (tempF - 32) / 1.8
    println("A temperatura é: $celsius")
}

private fun impost() {
    println("Qual o valor total de compra?")
    var purchase = readln().toFloat()
    println("Qual o valor do imposto?")
    var impost = readln().toFloat()
    var calc= (purchase * impost) /100
    var result = purchase + calc
    println("Resultado é $result")
}

private fun loan() {
    println("Qual o valor do empréstimo?")
    var emp = readln().toFloat()
    println("Até 12 parcelas")
    var parce = readln().toInt()
    while (parce > 12) {
        println("Preencha té 12 parcelas")
        parce = readln().toInt()
    }
        var jur = 20
        var result = (emp * jur) / 100
        var resultTotal = (emp + result) / parce
        println(" O valor do empréstimo é $emp")
        println("O valor dos juros é $jur %")
        println("O valor total, parcelas: $parce e juros é R$: $resultTotal")
}
private fun IMC() {
    println("Qual o seu peso?")
    var kg = readln().toFloat()
    println("Qual a sua altura?")
    var alt = readln().toFloat()
    var resAlt = alt * alt
    var result = kg / resAlt

    if((result >= 18.0) && (result <= 22.5)) {
        println("Peso ideal: $result")
    }
    else {
        println("Não está bem $result")
    }
}










