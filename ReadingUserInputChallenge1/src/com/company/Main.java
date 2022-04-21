package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /*
        int total =0;*/
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while(true){
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter == 10){
                    break;
                }
            }else {
                System.out.println("Invalid Number");
            }

            scanner.nextLine(); //handle end of line (enter key)
        }
        /*for (int i = 1; i <= 10; i++) {
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
        System.out.println("Sum is " + total);*/
        System.out.println("sum = " + sum);
        scanner.close();
    }
}