package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(12));
    }

    public static int getLargestPrime(int number){
        if (number<=1){
            return -1;
        }
        for (int i=number-1;i>=2;i--){
            if (number%i==0){        //i=6
                for (int j=i-1;j>=2;j--){ // j=5
                    if (i%j==0){
                        if (j%2==0){
                            return 2;
                        }return j;
                    }
                }
                return i;
            }
        }
        return number;
    }
}
