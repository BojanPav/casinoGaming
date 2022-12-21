package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter the amount of money you are bringing to the casino: ");
        int money = sc.nextInt();

        Player player = new Player(name, money);
        player.playRoulette();
    }
}





