package com.techelevator;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Decimal to Binary");

        System.out.print("Please enter in a series of decimal values (separated by spaces):");
        String decimalValues = scanner.nextLine();
        String[] decimalNumbers = decimalValues.split(" ");

        int remainder = 0;
        int decimalVal = 0;

        for (int c = 0; c < decimalNumbers.length; c++) {
            decimalVal = Integer.parseInt(decimalNumbers[c]);
            String binaryNumber = "";

            while (decimalVal > 0) {
                remainder = decimalVal % 2;
                binaryNumber = remainder + "" + binaryNumber;
                decimalVal = decimalVal / 2;

                //String[] binary = binaryNumber.split("/");
                //for (int i = 0; i < binary.length; i++) {
            }
            System.out.println(decimalNumbers[c] + " in Binary is " + binaryNumber);


        }
    }
}













