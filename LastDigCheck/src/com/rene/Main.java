package com.rene;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasSameLastDigit(9, 99,999));
    }
    public static boolean hasSameLastDigit(int n1, int n2, int n3){
        if(!isValid(n1) || !isValid(n2) || !isValid(n3))
            return false;
        n1%=10;
        n2%=10;
        n3%=10;
            return (n1 == n2||n1==n3||n3 ==n2);
    }
    public static boolean isValid(int range) {
        return range > 9 && range < 1_001 ? true : false;
    }
}
