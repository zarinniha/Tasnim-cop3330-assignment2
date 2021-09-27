/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zarin Tasnim
 */
package ex26;
import java.lang.Math;
import java.util.Scanner;

class PaymentCalculator {

    public static double calculateMonthsUntilPaidOff(double apr, double b, double p) {
        double i= apr/(365*100);
        double temp = b/p;
        double temp1=Math.pow((1+i),30);
        double temp2=Math.log(1+i);
        double temp3=Math.log(1+temp*(1-temp1));

        double n= Math.ceil((-1*temp3)/(temp2*30)); //calculation the number of years


        return n;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your balance? ");
        double b = sc.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        double i = sc.nextDouble();

        System.out.print("What is the monthly payment you can make? ");
        double p = sc.nextDouble();

        double n = calculateMonthsUntilPaidOff(i,b,p);
        System.out.print("It will take you " +n+ " months to pay off this card.");
    }

}
