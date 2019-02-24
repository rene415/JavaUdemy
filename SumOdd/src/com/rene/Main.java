package com.rene;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isOdd(5));
        System.out.println(sumOdd(10,5));
    }
    public static boolean isOdd(int oddNum){
        if (oddNum>0)
            return(oddNum%2==0?false:true);
        return
                false;
    }
    public static int sumOdd(int start, int end){
        int sum = 0;
        if(start<0 || end <0||start>end)
            return -1;
        for(int i=start; i<=end;i++){
            if(isOdd(i))
                sum = i + sum;
        }
        return sum;
    }
}
