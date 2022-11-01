package com.company;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Roulette {

    RouletteNumber numbers[];


    public Roulette() {
        createNumbers();
    }


    public void createNumbers() {
        numbers = new RouletteNumber[37];
        for (int i = 0; i < 37; i++) {
            numbers[i] = new RouletteNumber(i, setColor(i));
            System.out.println(numbers[i].get_value() + numbers[i].get_color());
        }
    }

    private static String setColor(int i) {

        String red = "RED";
        String green = "GREEN";
        String black = "BLACK";

        if (i == 0) {
            return green;
        } else if (i > 0 && i < 18) {
            return black;
        } else return red;
    }

    public RouletteNumber WinNum () {
        Random generator = new Random();
        int BallDrop = generator.nextInt(numbers.length);
       return numbers[BallDrop];
    }

}








