package com.dojo.demo

class AutomatedTellerMachine {
    companion object {
        private val AVAILABLE_NOTES: List<Int> = listOf(100, 50, 20, 10)

        fun get(totalValue: String): List<Int> {
            val result: MutableList<Int> = mutableListOf()
            var remainingValue = totalValue.toInt()

            for (note in AVAILABLE_NOTES) {
                while (remainingValue >= note) {
                    result.add(note)
                    remainingValue -= note
                }
            }

            return result
        }
    }
}