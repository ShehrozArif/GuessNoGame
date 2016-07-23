package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        boolean flag = false;
        int Counter = 1;
        int credit = 0;

        System.out.println("Do you want to play this game? Y/N");
        char play = input.next().trim().charAt(0);

        if (play == 'Y' || play == 'y') {

            do {
                int generated = rand.nextInt(10) + 1;
                System.out.println("Guess any no between 1 to 10:");
                int ans = input.nextInt();

                if (ans == generated) {
                    System.out.println("you WON !");
                } else {
                    System.out.println("you LOSE !");
                }
                Counter++;
            } while (Counter <= 3);

            System.out.println("Do you want to continue ? Y/N");
            play = input.next().trim().charAt(0);


            if (play == 'Y' || play == 'y') {
                Counter = 1;
                System.out.println("Add credit: ");
                credit = input.nextInt();

                while (Counter <= credit) {
                    int generated = rand.nextInt(10) + 1;
                    System.out.println("Guess any no between 1 to 10:");
                    int ans = input.nextInt();

                    if (ans == generated) {
                        System.out.println("you WON !");
                    } else {
                        System.out.println("you LOSE !");
                    }
                    Counter++;
                }
            }
        }
    }
}