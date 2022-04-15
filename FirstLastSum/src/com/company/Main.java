package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number){
        int lastDigit = number%10;
        int i=0;
        while (number/10>0){
                number = number/10;
            }
        int firstDigit = number;
        int sum = lastDigit + firstDigit;
        if(number<0){
            return -1;
        }
        return sum;
    }
    
}
