/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zarin Tasnim
 */
package ex37;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collection;
import java.util.*;

class passwordGenerator {

    //choosing random characters

    public static Character randomChar(String input,int n)
    {
        ArrayList<Character> arr = new ArrayList<>();
        Random r = new Random();
        for(int i=0;i<n;i++)
        {
            arr.add(input.charAt(i));

        }

        int select = r.nextInt(n);
        Character rand = arr.get(select);
        return rand;

    }

    //creating a list

    public static void pickChar(ArrayList<Character>list,String input,int count,int n)
    {
        for(int i=0;i<n;i++)
        {

            Character rand= randomChar(input,count);
            list.add(rand);

        }
    }

    //creating the password string

    public static String charTostring(ArrayList<Character>list)
    {
        StringBuilder sb = new StringBuilder();
        for (Character ch: list) {
            sb.append(ch);
        }
        String string = sb.toString();
        return string;
    }

    public static void main(String[] args) {

        ArrayList<Character> chars = new ArrayList<>();
        Random r = new Random();

        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";
        String numbers = "1234567890";

        Scanner sc = new Scanner(System.in);

        System.out.print("What's the minimum length? ");
        int length = sc.nextInt();

        System.out.print("How many special characters? ");
        int lengthCharacters = sc.nextInt();

        System.out.print("How many numbers? ");
        int lengthNumbers = sc.nextInt();

        int lengthLetters= length - (lengthCharacters+lengthNumbers-1);

        //ensuring that there are at least as many letters are there are special characters and number

        if (lengthNumbers + lengthCharacters > lengthLetters) {
            do {
                lengthLetters++;
            } while (lengthNumbers + lengthCharacters >= lengthLetters);
        }

        pickChar(chars,letters,letters.length(),lengthLetters);
        pickChar(chars,numbers,numbers.length(),lengthNumbers);
        pickChar(chars,specialCharacters,specialCharacters.length(),lengthCharacters);


        Collections.shuffle(chars);

        String password =charTostring(chars);

        System.out.print(password);
        }


    }

