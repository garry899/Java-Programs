package com.company;

import javax.swing.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);

        for (int i=1;i<=10;i++){
            System.out.println("Enter number "+i);

            boolean hasNextInt = str.hasNextInt();
            if (hasNextInt){
                System.out.println("Invalid Number");
            }
        }
    }
}
