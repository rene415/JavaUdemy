package com.rene;

public class Main {

    public static void main(String[] args){
        printMegaBytesAndKiloBytes(50000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes >= 0){
            int mBytes = kiloBytes/1024;
            int rKB = kiloBytes%1024;
            System.out.println(kiloBytes+" KB = "+mBytes+" MB and "+rKB+" KB");
        }else
            System.out.println("Invalid Value");
    }
}
