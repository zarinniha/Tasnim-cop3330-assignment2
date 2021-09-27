/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Zarin Tasnim
 */
package ex25;

import java.util.Scanner;
import java.util.regex.*;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
class passwordStrength {

   static int passwordValidator(String pass) {
        int n= pass.length();
       Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
       Matcher hasSpecial = special.matcher(pass);

       /* returns 1 = only number and length is less than 8;
          returns 2 = only alphabets and length is less than 8;
          returns 3 = contains letters and at least one number and is at least eight characters;
          returns 4 = contains letters, numbers, and special characters and is at least eight characters;
          returns 5 = empty input;
        */

        for (int i = 0; i < pass.length(); i++) {
            if (pass.matches("[0-9]+")&&n<8&& !hasSpecial.find()) {
                return 1;
            } else if  (pass.matches("[a-zA-Z]+")&&n<8&& !hasSpecial.find()) {
                return 2;
            }else if(pass.matches("[a-zA-Z0-9]+")&&n>=8 && !hasSpecial.find())
            {
                return 3;
            }else if(pass.matches("[a-zA-Z0-9]+") && n>=8 && hasSpecial.find());
            {
                return 4;
            }

        }
        return 5;

    }


    public static String printMethod(String password) {
        int result = (passwordValidator(password));

        String answer = (result == 1) ? ("The password '" + password + "' is a very weak password.") :
                       (result == 2) ? ("the password '" + password + "' is a weak password.") :
                        (result == 3) ? ("The password '" + password + "' is a strong password.") :
                        (result == 4) ? ("The password '" + password + "' is a very strong password.") :
                         ("Please enetr a valid password!");
        return answer;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type your password: ");
        String password = sc.nextLine();
        String print= printMethod(password);

        System.out.print(print);

    }
}

