package com.techelevator;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Fibonacci Sequence");

        System.out.print("Please enter a number:");
        String numberStr = scanner.nextLine();
        int n = Integer.parseInt(numberStr);


        int f = 0;
        int s = 1;

        while (f <= n) {
            System.out.print(f + ", ");

            int next = f + s;
            f = s;
            s = next;


            if (n == 0) {
                System.out.println("0" + ", " + "1");

            }
        }
    }
}