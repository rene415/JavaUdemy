package com.rene;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasTeen(22, 29, 29));
        System.out.println(isTeen(19));
    }
    public static boolean hasTeen(int n1, int n2, int n3){
        for(int i=13;i<20;i++)
            if(n1 == i|| n2 == i||n3 == i)
                return true;
            return false;

    }
    public static boolean isTeen(int n1){
        return(n1>12&&n1<20?true:false);
    }
}
