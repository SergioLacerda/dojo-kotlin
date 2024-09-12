package com.dojo.demo

import org.junit.jupiter.api.Assertions.assertIterableEquals
import org.junit.jupiter.api.Test

class AutomatedTellerMachineTest {

    @Test
    fun testSpecificWithdraw(){
        assertIterableEquals(listOf(100), AutomatedTellerMachine.get("100"))
        assertIterableEquals(listOf(50), AutomatedTellerMachine.get("50"))
        assertIterableEquals(listOf(20), AutomatedTellerMachine.get("20"))
        assertIterableEquals(listOf(10), AutomatedTellerMachine.get("10"))
    }

    @Test
    fun testTwiceWithdraw(){
        assertIterableEquals(listOf(20, 10), AutomatedTellerMachine.get("30"))
        assertIterableEquals(listOf(50, 10), AutomatedTellerMachine.get("60"))
    }

    @Test
    fun testaHugeWithdraws(){
        assertIterableEquals(listOf(100, 100, 100, 20), AutomatedTellerMachine.get("320"))
        assertIterableEquals(listOf(100, 50, 10), AutomatedTellerMachine.get("160"))
    }
}

