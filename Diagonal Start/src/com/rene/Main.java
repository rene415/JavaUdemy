package com.rene;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printSquareStar(2);
    }
    public static void printSquareStar(int number) {
        if (number < 5)
            System.out.println("Invalid Value");
        else
            for (int i = 1; i <= number; i++){
                System.out.println();
                for (int x= 1; x <= number;x++){
                    if(x == 1 || x == number||i == 1 || i == number|| i==x || i == (number - x)+1)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
    }
}
