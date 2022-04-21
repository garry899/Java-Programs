package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int total =0;
        Scanner str = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter number " + i);
            boolean hasNextInt = str.hasNextInt();
            if (hasNextInt) {
                int num = str.nextInt();
               total =total + num;
               if (num<0){
                   System.out.println("Invalid Number");
                   System.exit(0);
               }
            } else {
                System.out.println("Unable to parse");
                System.exit(0);
            }
        }
        System.out.println("Sum is " + total);
        str.close();
        }
    }
