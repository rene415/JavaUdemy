package com.rene;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //create a scanner to take input, scanner is an open section in memory so we need to close it
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your year of birth:");

        //returns true or false verify that input is a number
        boolean hasNextInt = scan.hasNextInt();
        //if hasNextInt is true it will run the next if statement
        if (hasNextInt){
            //get users YOB
            int yearOfBirth = scan.nextInt();
            scan.nextLine();

            //Gets users Name
            System.out.println("Enter your name: ");
            String userName = scan.nextLine();

            //convert year to age in number
            int age = 2019 - yearOfBirth;
            if (age>0 && age <=100)
                System.out.println("Your name is "+userName+", and you are "+age+" years old");
            else
                System.out.println("Unable to parse year of birth.");
            }
        scan.close();
    }
}
