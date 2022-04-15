package com.company;


public class Main {

    public static void main(String[] args) {
        //isEvenNumber(101);
        int x = 4;
        int finishNumber = 20;
        int count = 0;
        while(x <= finishNumber){
            x++;
            if (!isEvenNumber(x)){
                continue;
            }
            if (count == 5){
                break;
            }
            count++;
            System.out.println("Even number " + x);
        }
        System.out.println("Total number of even numbers found " + count);
        /*int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        for (int i = 6; i!=6; i++){
            System.out.println("Count value is " + count);
        }

        count = 1;
        do {
            System.out.println("Count value was" + count);
            count++;
            if (count > 100){
                break;
            }
        }while (count!=6);
        *//*for (count = 1; count !=6; count++){
            System.out.println("Count value is " + count);
        }*/
        /*count = 1;
        while (true){
            if (count == 6){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }*/
    }

    public static boolean isEvenNumber(int x){
        if (x%2 == 0){
            return true;
        }else {
            return false;
        }
    }
}
