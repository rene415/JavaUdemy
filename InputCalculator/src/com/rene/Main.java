package com.rene;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int count = 0;

        while(true) {
            System.out.println("enter num ");
            boolean isAnInt = scan.hasNextInt();
            if (isAnInt) {
                int number = scan.nextInt();
                sum += number;
                count++;
            }else
                break;
        }
        System.out.println("SUM = "+sum+" AVG = "+(sum/count));
        scan.close();
    }
}
