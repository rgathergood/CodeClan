package com.example.rgathergood.rockpaperscissorslab;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rgathergood on 21/03/2018.
 */

public class TestGame {

    Game game1;
    Game game2;
    Game game3;
    Game game4;

    @Before
    public void before() {
        game1 = new Game(Game.Choice.ROCK, Game.Choice.ROCK);
        game2 = new Game(Game.Choice.ROCK, Game.Choice.SCISSORS);
        game3 = new Game(Game.Choice.SCISSORS, Game.Choice.PAPER);
        game4 = new Game(Game.Choice.PAPER, Game.Choice.ROCK);
    }

    @Test
    public void itsADraw() {
        assertEquals("It's a draw!", game1.play());

    }

    @Test
    public void rockBeatsScissors() {
        assertEquals("You win! ROCK beats SCISSORS", game2.play());
    }

    @Test
    public void scissorsBeatsPaper() {
        assertEquals("You win! SCISSORS beats PAPER", game3.play());
    }

    @Test
    public void paperBeatsRock() {
        assertEquals("You win! PAPER beats ROCK", game4.play());
    }

}
