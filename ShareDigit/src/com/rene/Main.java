package com.rene;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasSharedDigit(9,99));
    }
    public static boolean hasSharedDigit(int num1, int num2){
        if((num1>=10&&num1<=99)&&(num2>=10&&num2<=99)){

                int i = num1%10;
                int j = num2%10;
                int y = num1/10;
                int w = num2/10;
                if(i == j || y==w || i==w || y==i){
                    return true;
                }else
                    return false;
        }else
            return false;
    }
}
