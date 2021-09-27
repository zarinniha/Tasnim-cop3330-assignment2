/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zarin Tasnim
 */

package ex36;

import java.util.ArrayList;
import java.util.Scanner;


class computingStatistics {

    //calculating the average
    public static double average(ArrayList<Double> list) {
        double result=0;
        double total = 0;
        for (int i = 0; i < list.size(); i++)
        {

            total+=list.get(i);
        }
        result = total/list.size();
        return result;

    }


    //finding the max

    public static double max(ArrayList<Double> list)
    {
        double max=Double.MIN_VALUE;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>max)
            {
                max = list.get(i);
            }else
            {
                continue;
            }
        }
        return max;
    }

    //finding the min

    public static double min(ArrayList<Double> list)
    {
        double min=Double.MAX_VALUE;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)<min)
            {
                min = list.get(i);
            }else
            {
                continue;
            }
        }
        return min;
    }

    //finding the standard deviation

    public static double std(ArrayList<Double> list) {

        Double meanNumb=average(list);
        double total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += Math.pow((list.get(i) - meanNumb), 2);
        }
        double sq = total / list.size();
        double result = Math.sqrt(sq);
        return result;

    }

    //printing the output

    public static void printList(ArrayList<Double> list)
    {
        double averageNumb = average(list);
        double maxNumb = max(list);
        double minNumb = min(list);
        double standardDeviation = std(list);

        System.out.print("Numbers: ");
        for (int i = 0; i < list.size();i++)
        {
            if(i==list.size()-1)
            {
                System.out.print(list.get(i));
            }else
            {
                System.out.print(list.get(i)+", ");
            }
        }

        System.out.printf(String.format("\nThe average is %.2f\nThe minimum is %.2f\n" +
                "The maximum is %.2f\nThe standard deviation is %.2f\n",averageNumb,minNumb,maxNumb,standardDeviation));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> numbers = new ArrayList<>();
        while (true) {
            System.out.print("Enter a number: ");
            String input = sc.nextLine();
            if (input.matches("[0-9].+")) {
                Double webnum = Double.parseDouble(input);
                numbers.add(webnum);
            } else if (input.equals("done")) {
                break;
            } else {
                continue;
            }

        }

        printList(numbers);


    }
}
