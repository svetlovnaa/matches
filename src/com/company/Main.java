package com.company;

public class Main {

    public static void main(String[] args) {

        GameOfMatches gameOfMatches = new GameOfMatches();
        int numberOfMatches = gameOfMatches.numberOfMatches;
        int computerProgress = gameOfMatches.computerProgress;
        int playerProgress = gameOfMatches.playerProgress;

        gameOfMatches.startNewGame();
        while (gameOfMatches.numberOfMatches != 1) {
            gameOfMatches.getNumbersOfMatchesOnBoard();
            gameOfMatches.makeComputerMove();
            gameOfMatches.getNumbersOfMatchesOnBoard();
            gameOfMatches.makePlayerMove();
        }
    }
}
