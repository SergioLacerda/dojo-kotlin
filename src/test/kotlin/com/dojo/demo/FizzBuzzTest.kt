package com.dojo.demo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FizzBuzzTest {

    @Test
    fun testaNumeroUm(){
        assertEquals("1", FizzBuzz.execute(1))
    }
    
    @Test
    fun testaFizz(){
        assertEquals("fizz", FizzBuzz.execute(3))
    }

    @Test
    fun testaBuzz(){
        assertEquals("buzz", FizzBuzz.execute(5))
    }

    @Test
    fun testaFizzBuzz(){
        assertEquals("fizzbuzz", FizzBuzz.execute(15))
    }
}