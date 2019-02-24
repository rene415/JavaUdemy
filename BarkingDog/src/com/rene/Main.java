package com.rene;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(shouldWakeUp(true, 8));
    }
    public static boolean shouldWakeUp(boolean barking, int hOD) {
        if (barking && (hOD >= 0 && hOD < 8) || barking && (hOD > 22 && hOD <= 23)) {
            return true;
        }
        return false;
    }
}

