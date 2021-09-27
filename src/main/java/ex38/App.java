/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zarin Tasnim
 */
package ex38;

import java.util.Scanner;
import java.util.ArrayList;

class filteringValues {

    //getting the even number array from the original array

    public static Integer[] filterEvenNumbers(String[] input) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            int num = Integer.parseInt(input[i]);
            int temp=num;
            while (temp >= 2) {
               temp-= 2;
            }
            if (temp == 0) {
                list.add(num);
            }

        }
        Integer[] even = new Integer[list.size()];
        even = list.toArray(even);

        return even;

    }

    //printing the array

    public static void printNumbers(Integer[] arr) {

        System.out.print("The even numbers are ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i] + ".");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input = sc.nextLine();
        String[] numbers = input.split(" ");

        Integer[] evenNumb = filterEvenNumbers(numbers);
        printNumbers(evenNumb);

    }

}