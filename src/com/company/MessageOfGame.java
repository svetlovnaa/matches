package com.company;

import java.util.Scanner;

public class MessageOfGame {

    public void reportTheStart() {
        System.out.println("Начало игры.");
    }

    public int reportTheRemainingMatches(int numberOfMatches) {
        System.out.println("На столе осталось " + numberOfMatches + " спичек");
        return numberOfMatches;
    }

    public void reportTheProgressOfTheComputer(int computerProgress) {
        System.out.println("Количество выбранных компьютером спичек = " + computerProgress);
    }

    public void reportAnIncorrectProgress() {
        System.out.println("Некорректное количество спичек");
    }

    public int reportTheProgressOfThePlayer() {
        System.out.print("Ход игрока. Введите количество спичек: ");
        int playerProgress = new Scanner(System.in).nextInt();
        if (playerProgress > 3 || playerProgress < 1) {
            reportAnIncorrectProgress();
            reportTheProgressOfThePlayer();
        }
        return playerProgress;
    }

    public void reportTheEnd () {
        System.out.println("Для игрока осталась последняя спичка. Игрок проиграл");
    }
}
