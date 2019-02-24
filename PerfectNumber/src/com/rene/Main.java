package com.rene;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isPerfectNumber(28));
    }
    public static boolean isPerfectNumber(int number){
        int x = 0;

        if(!(number < 1))
            for(int i =1;i<number;i++){
                if(number%i==0) {
                    x += i;
                }
            }else
                return false;
        return(x==number);
    }
}
