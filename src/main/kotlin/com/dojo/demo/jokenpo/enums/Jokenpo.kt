package com.dojo.demo.jokenpo

import com.dojo.demo.jokenpo.enums.JokenpoEnum

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