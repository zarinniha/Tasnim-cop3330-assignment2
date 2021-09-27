/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zarin Tasnim
 */
package ex28;
import java.util.Scanner;


class addingNumbers {

    public static void main(String[] args)
    {
        int n=0;
        for(int i=0;i<5;i++)
        {
            Scanner sc = new Scanner (System.in); //keep asking the user
            System.out.print("Enter a number: ");
            int x=sc.nextInt();
            n=n+x;  //creating the total

        }
        System.out.print("The total is "+n+".");
    }
}
