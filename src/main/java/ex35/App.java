/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zarin Tasnim
 */
package ex35;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

class pickingWinner {

    //getting a random name from the list

    public static String getRandom(ArrayList<String> list) {
        Random r = new Random();
        int item = r.nextInt(list.size());
        String randomAnswer = list.get(item);
        return randomAnswer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        while (true) {
            System.out.print("Enter a name: ");
            String input = sc.nextLine();
            if (input.equals("")) {
                String winner = getRandom(names);
                System.out.print("The winner is...." + winner+".");
                break;

            } else {
                names.add(input);
            }

        }
    }

}
