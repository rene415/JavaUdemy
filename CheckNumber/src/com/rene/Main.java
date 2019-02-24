package com.rene;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printConversion(95.75);
    }
    public static long toMilesPerHour(double kmh){
        if(kmh <0)
            return -1;

        return (Math.round(kmh*0.0d));
    }
    public static void printConversion(double kmh){
        if(kmh <0){
            System.out.println("Invalid Value");
        }else{
            System.out.println(kmh + " km/h = "+
                    toMilesPerHour(kmh)+" mi/h");
        }
    }
}
