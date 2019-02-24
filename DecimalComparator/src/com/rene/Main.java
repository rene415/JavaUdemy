package com.rene;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(areEqualByThreeDecimalPlaces(2.5563, 2.5565));
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        num1 = num1*1_000;
        num2 = num2 *1_000;

        int n1 = (int) num1;
        int n2 = (int) num2;
        return n1==n2?true:false;
    }
}
