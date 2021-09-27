/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zarin Tasnim
 */
package ex31;

import java.util.Scanner;

class heartRate {

    //not allosking non numric value
    public static boolean validateString(String input) {

        return input.matches("[0-9]+");
    }

    public static void printTable(int rate, int age) {
        int TargetHeartRate;
        System.out.print(String.format("Resting Pulse: %d\t\tAge: %d\n\n", rate, age));
        System.out.print(String.format("Intensit\t\t | Rate\n"));
        System.out.print("------------------------------\n");
        for (int i = 55; i <= 95; i++) {
            TargetHeartRate = (((220 - age) - rate) * i / 100) + rate; //formula
            System.out.print(String.format("%d%% %14s %d bpm\n", i,"|", TargetHeartRate));


        }
    }

    public static void main(String[] args) {
        int age;
        int rate;

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("what is your age? ");
            String input1 = sc.nextLine();
            if (validateString(input1)) {
                age = Integer.parseInt(input1);
                break;
            }

        }
        while (true) {
            System.out.print("what is your heartrate? ");
            String input2 = sc.nextLine();
            if (validateString(input2)) {
                rate = Integer.parseInt(input2);
                break;
            }

        }
        printTable(rate, age);


    }


}
