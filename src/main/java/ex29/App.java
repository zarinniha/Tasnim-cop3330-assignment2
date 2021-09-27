/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zarin Tasnim
 */
package ex29;

import java.util.Scanner;

class badInput {

    public static boolean validation(String input)
    {
        return (input.matches("[1-9]+(.*)")); //only allows numeric value beside 0

    }

    public static double getYears(double r)
    {
        double years = 72 / r;
        return years;

    }


    public static void main(String[] args) {

        String input;
        Scanner sc = new Scanner(System.in);

        //trap bad input
        while (true) {
            System.out.print("What is the rate of return? ");
            input = sc.nextLine();
            if (validation(input)) {

                double r = Double.parseDouble(input);

                double years = getYears(r);
                System.out.print(String.format("It will take %.2f years to double your initial inestment.", years));
                break;


            } else {
                System.out.print("Sorry. That's not a valid input.\n");
            }
        }
    }
}
