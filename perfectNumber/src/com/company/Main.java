package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number){
        if (number<1){
            return false;
        }
        int j = 0;
        for (int i=number-1;i>=1;i--){
            if (number%i == 0){
                j = j+i;
                if (j==number){
                    return true;
                }
            }
        }
        return false;
    }
}
