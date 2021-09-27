/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zarin Tasnim
 */
package ex30;

class multiplicationTable {

    //nested for loop
    public static void doMultiplication() {
        for (int i = 1; i < 13; i++) {
            for (int j = 1; j < 13; j++) {
                int k = i * j;
                System.out.print(String.format("%4d", k)); //formating
            }
            System.out.print("\n");

        }
    }

    public static void main(String[] args) {

        doMultiplication();


    }
}
