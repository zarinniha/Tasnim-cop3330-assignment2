/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zarin Tasnim
 */
package ex33;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;


class magicBall {

    //creating the arraylist
    public static ArrayList<String> createArray() {
        ArrayList<String> answers = new ArrayList<>();
        answers.add("Yes");
        answers.add("No");
        answers.add("Maybe");
        answers.add("Ask again later");
        return (answers);

    }

    //choosing a random answer
    public static String getRandom(ArrayList<String> answers) {
        Random r = new Random();
        int item = r.nextInt(answers.size());
        String randomAnswer = answers.get(item);
        return randomAnswer;
    }

    public static void main(String[] args) {

        System.out.print("What is your question?\n >");
        Scanner sc = new Scanner(System.in);
        String question = sc.nextLine();
        ArrayList<String> answers = createArray();

        Random rand = new Random();

        String randomAnswer = getRandom(answers);
        System.out.print(randomAnswer);


    }

}
