package com.example.rgathergood.rockpaperscissorslab;

import java.util.Random;

/**
 * Created by rgathergood on 21/03/2018.
 */

public class Game {

    public enum Choice {ROCK, PAPER, SCISSORS};

    public enum Result {WIN, LOSE, DRAW};

    private Choice computerSelection;
    private Result gameResult;
    private int userScore;
    private int computerScore;

    public Game() {
        this.userScore = 0;
        this.computerScore = 0;
    }

    public Choice setComputerRandomChoice() {
        Random random = new Random();
        computerSelection = Choice.values()[random.nextInt(Choice.values().length)];
        return computerSelection;
    }

    public String play(Choice userSelection) {
        this.computerSelection = setComputerRandomChoice();
        if (computerSelection == userSelection) {
            gameResult = Result.DRAW;
            return "It's a draw!";
        }
        else if (computerSelection == Choice.ROCK && userSelection == Choice.SCISSORS) {
            gameResult = Result.LOSE;
            addToComputerScore();
            return "You lose! " + computerSelection + " beats " + userSelection;
        }
        else if (computerSelection == Choice.PAPER && userSelection == Choice.ROCK) {
            gameResult = Result.LOSE;
            addToComputerScore();
            return "You lose! " + computerSelection + " beats " + userSelection;
        }
        else if (computerSelection == Choice.SCISSORS && userSelection == Choice.PAPER) {
            gameResult = Result.LOSE;
            addToComputerScore();
            return "You lose! " + computerSelection + " beats " + userSelection;
        } else {
            gameResult = Result.WIN;
            addToUserScore();
        }
        return "You win! " + userSelection + " beats " + computerSelection;
    }

    public void addToUserScore() {
        this.userScore += 1;
    }

    public void addToComputerScore() {
        this.computerScore += 1;
    }

    public void resetScores() {
        this.userScore = 0;
        this.computerScore = 0;
    }

    public Integer getUserScore() {
        return this.userScore;
    }

    public Integer getComputerScore() {
        return this.computerScore;
    }

    
}
