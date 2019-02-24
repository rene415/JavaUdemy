package com.rene;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isPalindrome(-707));
    }
    public static  boolean isPalindrome(int number){
        int reverse = 0;
        number = Math.abs(number);
        int len = String.valueOf(number).length();
        int num = number;

        for(int i=0;i<len;i++) {
            int lastDig = number % 10;
            reverse = (reverse*10) + lastDig;
            number=number/10;
        }
        return reverse==num?true:false;
    }
}
