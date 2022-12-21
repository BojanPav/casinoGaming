package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private String name;
    private int startMoney;
    private int currentMoney;
    private ArrayList<Integer> betNums;
    private ArrayList<Integer> betAmounts;

    public Player(String name, int money) {
        this.name = name;
        this.startMoney = money;
        this.currentMoney = startMoney;
        this.betNums = new ArrayList<>();
        this.betAmounts = new ArrayList<>();
    }

    public void placeBets() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers you want to bet on (separated by spaces): ");
        String betNumsInput = sc.nextLine();
        String[] betNumsString = betNumsInput.split(" ");
        for (String s : betNumsString) {
            int betNum = Integer.parseInt(s);
            if (betNum >= 0 && betNum <= 36) {
                betNums.add(betNum);
            } else {
                System.out.println("Invalid bet number: " + betNum + ". Skipping this bet.");
            }
        }
        System.out.println("Enter your bet amounts for each number (separated by spaces): ");
        String betAmountsInput = sc.nextLine();
        String[] betAmountsString = betAmountsInput.split(" ");
        if (betAmountsString.length != betNums.size()) {
            System.out.println("Number of bet amounts does not match number of bet numbers. Please try again.");
            placeBets();
        } else {
            for (String s : betAmountsString) {
                betAmounts.add(Integer.parseInt(s));
            }
        }
    }

    public void playRoulette() {
        Roulette roulette = new Roulette();
        placeBets();
        RouletteNumber winningNumber = roulette.getWinningNumber();
        System.out.println("Winning number is: " + winningNumber.getValue() + " " + winningNumber.getColor());

        int winnings = 0;
        for (int i = 0; i < betNums.size(); i++) {
            if (winningNumber.getValue() == betNums.get(i)) {
                winnings += betAmounts.get(i) * 36;
            }
        }

        // Calculate the total bet amount
        int totalBetAmount = 0;
        for (int betAmount : betAmounts) {
            totalBetAmount += betAmount;
        }

        currentMoney += winnings - totalBetAmount;
        if (winnings > 0) {
            System.out.println("Congratulations! You won $" + winnings + ". You now have $" + currentMoney + " on your account.");
        } else {
            System.out.println("Sorry, you lost. You now have $" + currentMoney + " on your account.");
        }
    }


}
