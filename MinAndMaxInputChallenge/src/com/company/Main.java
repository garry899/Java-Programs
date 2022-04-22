package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int min = 0; // 20
        int max = 0; // 20
        while (true){
            System.out.println("Enter number #" + counter);
            int num = scanner.nextInt();
            if (min > num || min == 0){
                min = num;
            }if (max < num || max == 0){
                max = num;
            }
            counter++;
            if (counter == 10){
                break;
            }
        }
        System.out.println("Min number is " + min);
        System.out.println("Max number is " + max);
        scanner.close();
    }
}
