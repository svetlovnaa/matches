package com.company;

public class GameOfMatches {

    public int numberOfMatches = 20;
    public int computerProgress = 0;
    public int playerProgress = 0;

    MessageOfGame messageOfGame = new MessageOfGame();
    ComputerLogic computerLogic = new ComputerLogic();

    public void startNewGame() {
        messageOfGame.reportTheStart();
    }

    public void getComputerMove(int playerProgress) {
        switch (playerProgress) {
            case 1:
                computerProgress = computerLogic.moveForOneMatch();
                this.numberOfMatches -= computerProgress;
                break;
            case 2:
                computerProgress = computerLogic.moveForTwoMatches();
                this.numberOfMatches -= computerProgress;
                break;
            case 3:
                computerProgress = computerLogic.moveForThreeMatches();
                this.numberOfMatches -= computerProgress;
                break;
            default:
                computerProgress = computerLogic.makeFirstProgress();
                this.numberOfMatches -= computerProgress;
        }
    }

    public void makeComputerMove() {
        getComputerMove(playerProgress);
        messageOfGame.reportTheProgressOfTheComputer(computerProgress);
    }

    public void makePlayerMove() {
        if (numberOfMatches == 1) {
            messageOfGame.reportTheEnd();
        } else {
            playerProgress = messageOfGame.reportTheProgressOfThePlayer();
            this.numberOfMatches -= playerProgress;
        }
    }

    public int getNumbersOfMatchesOnBoard() {
        messageOfGame.reportTheRemainingMatches(numberOfMatches);
        return numberOfMatches;
    }
}
