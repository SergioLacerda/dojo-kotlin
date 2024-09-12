package com.dojo.demo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SMSTest {

    @Test
    fun testLetterSameNumber(){
        assertEquals("A", SMS.convert("1"));
        assertEquals("B", SMS.convert("11"));
        assertEquals("C", SMS.convert("111"));
    }

    @Test
    fun testDifferentNumber(){
        assertEquals("AD", SMS.convert("12"));
    }

    @Test
    fun testSameNumbersWithSpace(){
        assertEquals("A A", SMS.convert("1_1"));
    }
}