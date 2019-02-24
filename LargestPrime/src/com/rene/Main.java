package com.rene;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getLargestPrime(217));
    }
    public static int getLargestPrime(int number){
        if (number <=1)
            return -1;
        int primeNum = 1;
        while(primeNum<number){
            primeNum++;
            if(number%primeNum == 0){
                number /= primeNum;
            }
        }
        return primeNum;
    }
}
