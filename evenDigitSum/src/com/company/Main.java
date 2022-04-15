package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number){
        int sum = 0;
        while (number>0){
            if (number%2==0){
                sum = sum + number%10;
            }
            number = number/10;
        }
        if (number<0){
            return -1;
        }
        return sum;
    }
}
