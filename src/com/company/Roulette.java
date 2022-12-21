package com.company;

import java.util.Random;

public class Roulette {

    private RouletteNumber[] numbers;

    public Roulette() {
        createNumbers();
    }

    public void createNumbers() {
        numbers = new RouletteNumber[37];
        for (int i = 0; i < 37; i++) {
            numbers[i] = new RouletteNumber(i, setColor(i));
        }
    }

    private RouletteNumber.Color setColor(int i) {
        if (i == 0) {
            return RouletteNumber.Color.GREEN;
        } else if (i > 0 && i < 10) {
            if (i % 2 == 0) {
                return RouletteNumber.Color.BLACK;
            } else {
                return RouletteNumber.Color.RED;
            }
        } else if (i >= 10 && i < 19) {
            if (i % 2 == 0) {
                return RouletteNumber.Color.RED;
            } else {
                return RouletteNumber.Color.BLACK;
            }
        } else if (i >= 19 && i < 29) {
            if (i % 2 == 0) {
                return RouletteNumber.Color.BLACK;
            } else {
                return RouletteNumber.Color.RED;
            }
        } else if (i >= 29 && i < 37) {
            if (i % 2 == 0) {
                return RouletteNumber.Color.RED;
            } else {
                return RouletteNumber.Color.BLACK;
            }
        } else {
            return RouletteNumber.Color.GREEN;
        }
    }

    public RouletteNumber getWinningNumber() {
        Random generator = new Random();
        int ballDrop = generator.nextInt(numbers.length);
        return numbers[ballDrop];
    }
}









