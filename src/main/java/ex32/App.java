/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zarin Tasnim
 */
package ex32;

import java.util.Scanner;
import java.util.Random;

class numberGame {

    //not allowing non numeric value
    public static boolean inputValidation(String input) {
        if (input.matches("[0-9]+")) {
            return true;
        } else {
            System.out.print("Wrong input. Try again: ");
            return false;
        }
    }

    //getting the level
    public static int chooseLevel(String level) {
        int n=0;
        if (level.matches("1")) {
            n = 10;
        } else if (level.matches("2")) {
            n = 100;
        } else if (level.matches("3")) {
            n = 1000;
        }

        return n;

    }

    //comparing numbers
    public static void compareNumbers(int computer)
    {
       int count = 0;
        while (true) {

            count++;
            Scanner sc2 = new Scanner(System.in);
            String numbString=sc2.nextLine();

            if (inputValidation(numbString)) {
                int user = Integer.parseInt(numbString);
                if (user < computer) {
                    System.out.print("Too low. Guess again? ");
                } else if (user > computer) {
                    System.out.print("Too high. Guess again? ");
                } else {
                    System.out.print("You got it in " + count + " guesses\n\n");
                    break;
                }
            }

        }
    }

    //getting random numbers
    public static int getRandom(int high, int low) {
        Random rand = new Random();
        int random = rand.nextInt(high - low) + low;
        return random;
    }


    public static void main(String[] args) {

        int low = 1;
        int high;
        int computer;
        int count;
        System.out.print("Let's play guess the number!");

        while (true) {
            Scanner sc1 = new Scanner(System.in);
            System.out.print("\nEnter the difficulty level (1, 2, or 3): ");
            String level = sc1.nextLine();
            if (inputValidation(level)) {
                high = chooseLevel(level);
                computer = getRandom(high, low);
                System.out.print("I have my number. What's your guess? ");
                compareNumbers(computer);
                System.out.print("Do you wish to play again (Y/N)? ");
                Scanner sc3 = new Scanner(System.in);
                String answer = sc3.nextLine();

                if (answer.equals("n")) {
                    break;
                } else if (answer.equals("y")) {
                    continue;
                }

            } else {
                continue;
            }
        }


    }
}
