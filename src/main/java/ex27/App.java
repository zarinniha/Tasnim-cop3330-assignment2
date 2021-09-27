/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zarin Tasnim
 */

package ex27;
import java.util.Scanner;
import java.util.regex.Pattern;

class valdiatingInputs {
    static String data="";

    //checks if the first name is empty or less than 2 characters

    public static boolean fnameValidation(String fName) {
        boolean result = true;
        if (fName.length() < 2) {
            data = data + "The first name must be at least 2 characters long.\n";
            result = false;
        }
        if (fName == "") {
            data = data + "The first name must be filled in.\n";
            result = false;
        }
        return result;
    }

    //checks if the first name is empty or less than 2 characters

    public static boolean lnameValidation(String lName) {
        boolean result = true;
        if (lName.length() < 2) {
            data = data + "The last name must be at least 2 characters long.\n";
            result = false;
        }
        if (lName == "") {
            data = data + "The last name must be filled in.\n";
            result = false;
        }
        return result;
    }

    //checks if the employee ID is in the format AA-1234

    public static boolean validateId(String id) {
        boolean result=true;

        String idStyle = "[a-zA-Z]{2}[-]{1}[0-9]{4}";
        if(!Pattern.matches(idStyle, id))
        {
            result=false;
            data=data+"The employee ID must be in the format of AA-1234.\n";
        }
        
        return result;


    }

    //checks if the zip code is only numbers

    public static boolean validateZip(String zip) {
        boolean result=true;
        for (int i = 0; i < zip.length(); i++) {
            if (!Character.isDigit(zip.charAt(i))) {

                result=false;
            }
        }
        if(result==false)
        {
            data=data+"The zipcode must be a 5 digit number.\n";
        }
        return result;


    }

    public static void validateInput(String fName,String lName,String id,String zip)
    {
        boolean base1= fnameValidation(fName);
        boolean base2=lnameValidation(lName);
        boolean base3= validateId(id);
        boolean base4=validateZip(zip);
        if(base1&&base2&&base3&&base4)
        {
            data="There were no errors found.\n";
        }
        System.out.println(data);

    }

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first name: ");
        String fname = sc.nextLine();

        System.out.print("Enter the last name: ");
        String lname = sc.nextLine();

        System.out.print("Enter the zip code: ");
        String zip = sc.nextLine();

        System.out.print("Enter the employee id: ");
        String id = sc.nextLine();
        validateInput(fname,lname,id,zip);






    }


}
