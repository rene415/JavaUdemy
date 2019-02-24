package com.rene;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getGreatestCommonDivisor(12, 30));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        int div = 0;
        if(first<10 || second<10)
            return -1;
        int small = (first<second)?first:second;
        for (int i=1;i<=small;i++){
            if((first%i==0) && (second%i==0))
                div = i;
        }
        return div;
    }
}
