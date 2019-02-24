package com.rene;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
	// write your code here
        printYearsAndDays(-525600);
    }
    public static void printYearsAndDays(long min){
        long days = min/1440;
        long years = days/365;
        if(min >=0)
            System.out.println(min+" min = "+years+" y and "+days%365+" d");
        else
            System.out.println(INVALID_VALUE_MESSAGE);
    }
}
