package com.rene;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumFirstAndLastDigit(0));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number >=0){
            int fDigit = number;
            int lDigit = number%10;
            while(fDigit>9)
                fDigit/=10;
            int sum =fDigit+lDigit;
            return sum;
        }else
            return -1;
    }
}
