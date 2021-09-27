/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zarin Tasnim
 */
package ex34;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;


 class listRemoval {
     static int count=5;

     //using arraylist to store a list

    public static ArrayList<String> createList() {
        ArrayList<String> employee = new ArrayList<>();
        employee.add("John Smith");
        employee.add("Jackie Jackson");
        employee.add("Chris Jones");
        employee.add("Amanda Cullen");
        employee.add("Jeremy Goodwin");

        return (employee);

    }

    //removing the desired name

    public static void removal(ArrayList<String> employee,String name)
    {
        for(int i=0;i<employee.size();i++)
        {
            if(employee.get(i).equals(name))
            {
                employee.remove(i);
                count--;

            }
        }
    }

    public static void printList(ArrayList<String> employee,int count)
    {
        System.out.print("There are "+count+" employees:\n");
        for (int i = 0; i < employee.size();i++)
        {
            System.out.println(employee.get(i));
        }
    }
    public static void main(String[] args)
    {

        ArrayList<String> employee= createList();
        printList(employee,count);
        System.out.print("Enter an employee name to remove: ");
        Scanner sc = new Scanner(System.in);
        String removeName=sc.nextLine();
        removal(employee,removeName);
        System.out.print("\n\n");
        printList(employee,count);




    }


}
