package com.dojo.demo

import com.dojo.demo.jokenpo.Jokenpo
import com.dojo.demo.jokenpo.JokenpoEnum.*
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class JokenpoTest {

    @Test
    fun testePapel(){
        assertTrue(Jokenpo.play(PAPER, ROCK));

        assertFalse(Jokenpo.play(PAPER, SCISSORS));
    }

    @Test
    fun testePedra(){
        assertTrue(Jokenpo.play(ROCK, SCISSORS));

        assertFalse(Jokenpo.play(ROCK, PAPER));
    }

    @Test
    fun testeTesoura(){
        assertTrue(Jokenpo.play(SCISSORS, PAPER));

        assertFalse(Jokenpo.play(SCISSORS, ROCK));
    }
}