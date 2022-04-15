package com.company;

import java.net.SocketOption;
import java.security.spec.RSAOtherPrimeInfo;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(4));
    }

    public static int sumDigits(int number){
        if(number<10){
            return -1;
        }
        int sum = 0;
        while(number>0) {
            sum = sum + number % 10;
            number = number / 10;
        }
                return sum;
    }
}
