package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,13));
    }

    public static boolean hasSharedDigit(int num1, int num2){
        if (num1<10 || num1>99){
            return false;
        }else if (num2<10 || num2>99){
            return false;
        }
        while (num1>0){    //12
            int k = num1%10;  //   2
            int z = num2;     //   13
            while (z%10>0){  //  1
                int y = z%10;  //   3
                if (k==y){
                    return true;
                }
                    z = z / 10;   //  1
            }
            num1 = num1/10; // 1
        }
        return false;
    }
}
