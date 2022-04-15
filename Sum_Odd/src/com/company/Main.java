package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start:");
        int start = sc.nextInt();
        System.out.print("Enter end value:");
        int end = sc.nextInt();
        int i1 = sumOdd(start,end);
        boolean j = isOdd(i1);
        System.out.println(i1);
        System.out.println(j);
    }

    public static boolean isOdd(int number){
        if (number<=0 || number%2==0){
            return false;
        }
        return true;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if (end < start) {
            return -1;
        } else if (end == start && start % 2 != 0) {
            return start;
        } else if (end == start && start % 2 == 0) {
            return 0;
        }else if (end < 0 || start < 0){
            return -1;
        }
        for (int i=start;i<=end;i++) {
            if (i%2!=0){
                sum = sum + i;
        }
        }
        return sum;
    }
}
