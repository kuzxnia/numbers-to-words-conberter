package com.kuzniarski.converter

var TEN = 10
var ONE_HUNDRED = 100
var ONE_THOUSAND = 1000
var ONE_MILLION = 1000000
var ONE_BILLION = 1000000000
var ONE_TRILLION = 1000000000000
var ONE_QUADRILLION = 1000000000000000
var MAX = 9007199254740992

var TO_TWENTY = arrayOf(
        "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
        "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
)

var TENTHS_LESS_THAN_HUNDRED = arrayOf(
        "zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
)

fun convertToWord(num: Long) : String {
    val words = ArrayList<String>()
    var number = num
    
    while(number != 0.toLong()) {

        when {
            number < 20 -> {
                words.add(TO_TWENTY[number.toInt()])
                number = 0
            }
            number < ONE_HUNDRED -> {
                val remainder :Int= (number % TEN).toInt()
                var word = TENTHS_LESS_THAN_HUNDRED[(number / TEN).toInt()]
                if (remainder < 10) word += "-" + TO_TWENTY[remainder]

                words.add(word)
                number = 0
            }
            number < ONE_THOUSAND -> {
                words.add( convertToWord(number / ONE_HUNDRED) + " hundred, ")
                number %= ONE_HUNDRED
            }
            number < ONE_MILLION -> {
                words.add( convertToWord(number / ONE_THOUSAND) + " thousand, ")
                number %= ONE_THOUSAND
            }
            number < ONE_BILLION -> {
                words.add( convertToWord(number / ONE_MILLION) + " million, ")
                number %= ONE_MILLION
            }
            number < ONE_TRILLION -> {
                words.add( convertToWord(number / ONE_BILLION) + " billion, ")
                number %= ONE_BILLION
            }
            number < ONE_QUADRILLION -> {
                words.add( convertToWord(number / ONE_TRILLION) + " trillion, ")
                number %= ONE_TRILLION
            }
            number <= MAX -> {
                words.add( convertToWord(number / ONE_QUADRILLION) + " quadrillion, ")
                number %= ONE_QUADRILLION
            }
        }

    }
    return words.joinToString(separator = "")
}