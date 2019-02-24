package com.rene;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(isLeapYear(1924));
        System.out.println(getDaysInMonth(2,2020));
    }

    public static boolean isLeapYear(int year) {

        boolean yearDivFour = (year % 4) == 0 ? true : false;
        boolean yearDivHun = (year % 100) == 0 ? true : false;
        boolean yearDivFourHun = (year % 400) == 0 ? true : false;

        if (year < 1 || year > 9999) return false;

        if (yearDivFour) {
            if (yearDivHun) {
                return yearDivFourHun;
            } else {
                return true;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (year > 1 && year < 9999) {
            switch (month) {
                case 2:
                    if (isLeapYear(year)) {
                        return 29;
                    } else {
                        return 28;
                    }
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                case 4: case 6: case 9: case 11:
                    return 30;
                default:
                    return -1;
            }
        }else
            return -1;
    }
}