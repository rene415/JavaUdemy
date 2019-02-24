package com.rene;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getEvenDigitSum(0));
    }
    public static int getEvenDigitSum(int number){
        int sum = 0;
        if(number < 0)return -1;

        while(number >0) {
            if (number % 2 == 0 ? true : false) {
                sum = (number % 10) + sum;
            }
            number = number / 10;
        }
        return sum;
    }
}
