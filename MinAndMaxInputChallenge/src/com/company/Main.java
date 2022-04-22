package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
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
        scanner.close();*/

        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        boolean first = true;  // to stop printing 0 as min or max

        while (true){

            System.out.println("Enter number:");
            boolean isAnInt = scanner.hasNextInt();


            if (isAnInt){
                int number = scanner.nextInt();


                if (first){  // to stop printing 0 as min or max
                    first = false;
                    min = number;
                    max = number;
                }

                if (number>max){
                    max = number;
                }

                if (number<min){
                    min = number;
                }

            }else {
                break;   // enter any alphabet to stop the loop
            }

            scanner.nextLine();  // handle input
        }

        System.out.println("min= "+ min +", max= "+ max);
        scanner.close();
    }
}
