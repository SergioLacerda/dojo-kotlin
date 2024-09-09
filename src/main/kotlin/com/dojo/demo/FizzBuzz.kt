package com.dojo.demo

class FizzBuzz {
    companion object {
        fun execute(number: Int): String {
            return when {
                number % 3 == 0 && number % 5 == 0 -> "fizzbuzz"
                number % 3 == 0 -> "fizz"
                number % 5 == 0 -> "buzz"
                else -> number.toString()
            }
        }
    }


}