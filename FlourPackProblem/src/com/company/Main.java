package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(canPack(5,3,24));
    }

    public static boolean canPack(int bigCount,int smallCount, int goal){
        if (bigCount<0 ||smallCount<0 || goal<0){
            return false;
        }else if (goal < 5*bigCount && smallCount ==0){
            return false;
        }else if (goal < 5*bigCount && goal%5>smallCount){
            return false;
        }else if (goal<= 5*bigCount + smallCount){
           return true;
       }
           return false;
    }
}