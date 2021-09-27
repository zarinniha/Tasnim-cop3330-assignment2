
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zarin Tasnim
 */

package ex24;
import java.util.Scanner;
import java.util.Arrays;


class anagramChecker {

    static boolean isAnagram(String str1, String str2) {

        //converting to lower case
        String st1 = str1.toLowerCase();
        String st2 = str2.toLowerCase();
        boolean result = true;

        if (st1.length() == st2.length()) {

            //creating char array
            char[] Array1 = st1.toCharArray();
            char[] Array2 = st2.toCharArray();

            //sorting the char array
            Arrays.sort(Array1);
            Arrays.sort(Array2);

            return Arrays.equals(Array1, Array2);


        } else {
            return false;
        }
    }

    public static void printOutput(String s1, String s2)
    {
        if (isAnagram(s1, s2)) {
            System.out.println("\""+s1 +"\"" +" and "+ "\""+ s2 + "\""+ " are anagrams.");
        } else {
            System.out.println("\""+s1 +"\"" +" and "+ "\""+ s2 + "\""+ " are not anagrams.");

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = sc.nextLine();
        printOutput(s1,s2); //print

    }


}
