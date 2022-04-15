package com.company;

public class Main {

    public static void main(String[] args) {
        numberToWords(900);
    }

    public static int getDigitCount(int num2){
        if (num2<0){
            return -1;
        }else if (num2 == 0){
            return 1;
        }
        int i = 0;
        while (num2>0){
            num2 = num2/10;
            i +=1;
        }
        return i;
    }

    public static int reverse(int num1){
        int reversed = 0;
        while(num1!=0){
            int i=num1%10;
            reversed = reversed * 10 + i;
            num1=num1/10;
        }
        return reversed;
    }

    public static void numberToWords(int num1){
        int number = reverse(num1);
        if (number<0){
            System.out.println("Invalid Value");
        }else if (number ==0){
            System.out.println("Zero");
        }
        int k = getDigitCount(number);
        while(number!=0){
            int i = number%10;
                if (i == 0) {
                    System.out.print("Zero ");
                } else if (i == 1) {
                    System.out.print("One ");
                } else if (i == 2) {
                    System.out.print("Two ");
                } else if (i == 3) {
                    System.out.print("Three ");
                } else if (i == 4) {
                    System.out.print("Four ");
                } else if (i == 5) {
                    System.out.print("Five ");
                } else if (i == 6) {
                    System.out.print("Six ");
                } else if (i == 7) {
                    System.out.print("Seven ");
                } else if (i == 8) {
                    System.out.print("Eight ");
                } else if (i == 9) {
                    System.out.print("Nine ");
                }
                number = number/10;
            }
        for (int j = getDigitCount(num1);j>k;j--){
            System.out.print("Zero ");
        }
        }
    }