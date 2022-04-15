package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int first,int second){
        if (first<10){
            return -1;
        }else if (second<10){
            return -1;
        }
        while (first>0){
            for (int i=first;i>=1;i--){
                for (int j=second;j>=1;j--){
                    if (first%i==0 && second%j==0 && i==j){
                        return j;
                    }
                }
            }
        }


        return -1;
    }
}
