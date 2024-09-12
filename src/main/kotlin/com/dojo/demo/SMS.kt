package com.dojo.demo

class SMS {
    companion object {
        private val LETTERS_MAP = mutableMapOf(
            "_" to " ",
            "1" to "A",
            "11" to "B",
            "111" to "C",
            "2" to "D",
            "22" to "E",
            "222" to "F"
        )

        fun convert(input: String): String {

            var temporaryKey = ""
            var result = ""
            for(targetChar in input){
                val currentChar = if (temporaryKey.isEmpty() ) input[0] else temporaryKey[0]

                if(currentChar == targetChar){
                    temporaryKey += targetChar.toString()
                    continue
                }

                result += LETTERS_MAP[temporaryKey]
                temporaryKey = targetChar.toString()
            }
            result += LETTERS_MAP[temporaryKey]

            return result
        }
    }
}