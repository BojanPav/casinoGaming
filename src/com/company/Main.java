package com.company;
import java.util.*;
import java.util.Scanner;


public class Main {

    static ArrayList<Player> players= new ArrayList<>();
    static Player player;




    public static void main(String[] args) {

        AddPlayer();
        Roulette Roulette = new Roulette();
        System.out.println( "Winning number is : " +Roulette.WinNum().get_value() + Roulette.WinNum().get_color());

    }
    static void AddPlayer()
    {
        String name;
        Scanner sc= new Scanner(System.in);
        System.out.println("Ime :" );
        name= sc.nextLine();
        System.out.println("Pare :");
        int money= sc.nextInt();
        player=new Player(name,money);

    }


    }



