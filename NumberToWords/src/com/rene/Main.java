package com.rene;

public class Main {

    public static void main(String[] args) {
        // write your code here
        numberToWords(101000);
    }

    public static int getDigitCount(int number) {
        if (number < 0)
            return -1;
        int len = String.valueOf(number).length();
        return len;
    }

    public static int reverse(int number) {
        int flag = 0;
        int reverse = 0;

        if (number < 0) {
            number = Math.abs(number);
            flag = 1;
        }
        int len = getDigitCount(number);

        for (int i = 0; i < len; i++) {
            int lastDig = number % 10;
            reverse = (reverse * 10) + lastDig;
            number = number / 10;
        }

        if (flag == 1)
            return (reverse * -1);
        return reverse;

    }

    public static void numberToWords(int number) {
        int rev = reverse(number);
        int len = getDigitCount(number);
        int revLen = getDigitCount(rev);

        if (number < 0)
            System.out.println("Invalid Value");;

        int i = 0;
        while (i < revLen) {
            int newNumber = rev % 10;
            String[] wordNumber = {"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
            switch (newNumber) {
                case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
                    System.out.println(wordNumber[newNumber]);
                    break;
            }
            rev = rev / 10;
            i++;
        }
        if (revLen < len) {
            len = len - revLen;
            int x = 0;
            while (x < len) {
                System.out.println("ZERO");
                x++;
            }
        }
    }
}
