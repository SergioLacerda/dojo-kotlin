package com.dojo.demo.jokenpo

class Jokenpo {
    companion object {
        fun play(playerOne: JokenpoEnum, playerTwo: JokenpoEnum): Boolean {
            return getWeakness(playerOne) != playerTwo
        }

        private fun getWeakness(type: JokenpoEnum): JokenpoEnum {
            return when {
                type == JokenpoEnum.PAPER -> JokenpoEnum.SCISSORS;
                type == JokenpoEnum.SCISSORS -> JokenpoEnum.ROCK;
                else -> JokenpoEnum.PAPER
            }

        }
    }
}