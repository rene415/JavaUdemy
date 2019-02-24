package com.rene;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(canPack(2, 7, 18));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        System.out.println(bigCount);
        System.out.println(smallCount);
        if(bigCount<0 || smallCount<0||goal<0)
            return false;
        for(int i=0;i<=bigCount;i++){
            for (int x = 0; x<=smallCount;x++)
                if(i*5 + x ==goal)
                    return true;
        }
        return false;
    }
}
