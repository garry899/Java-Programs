package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int lastDigit;
        int originalNum = number;
        while (number!=0 || number>0) {
            lastDigit = number % 10;
            reverse = reverse * 10 +lastDigit;
            number = number / 10;
        }
        if (reverse == originalNum) {
            return true;
        } else {
            return false;
        }
    }
}
