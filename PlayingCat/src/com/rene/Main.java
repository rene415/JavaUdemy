package com.rene;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isCatPlaying(false, 45));
    }
    public static boolean isCatPlaying(boolean summer, int temp){
        if (summer)
            return((temp>=25&&temp<=45)?true:false);
        else
            return((temp>=25&&temp<=35)?true:false);
    }
}
