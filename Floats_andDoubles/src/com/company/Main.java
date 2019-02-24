package com.company;

public class Main {

    public static void main(String[] args) {
	    int myInt = 5/3;
	    float myFloat= 5f/3f;
	    double myDouble = 5d/3d;
        System.out.println("myInt= "+myInt);
        System.out.println("myFloat= "+myFloat);
        System.out.println("myDouble= "+myDouble);

        //Convert number of Punds to kilos
        //1. Create a var to store num of lbs
        double myLbs = 200;
        //2. Calculate the num of kilos for the number above and store in var
        double myKg = myLbs*0.45359237d;
        //3. print the result
        System.out.println(myKg);
    }
}
