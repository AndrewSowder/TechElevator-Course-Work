package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {


	public static void main (String[] args) {


		int fizzBuzzLimit;

        do {
            System.out.println("Please choose a number for FizzBuzz between 1 - 300 (inclusive)");
            Scanner userInput = new Scanner(System.in);
            fizzBuzzLimit = Integer.parseInt(userInput.nextLine());


        } while (fizzBuzzLimit <= 0 || fizzBuzzLimit > 300);

		System.out.println("Please choose a destination file: ");
		Scanner outputScanner = new Scanner(System.in);
		String output = outputScanner.nextLine();
		File outputFile = new File(output);


        try {
            outputFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create new file");
        }

        fizzBuzz(fizzBuzzLimit, outputFile);
    }

    private static void fizzBuzz(int inputNumber, File outputFile) {
        try (PrintWriter writer = new PrintWriter(outputFile)) {
            for(int i = 1; i <= inputNumber; i++) {
                String number;
                String inputAsString = Integer.toString(i);
                if ((i % 3 == 0 && i % 5 == 0) || (inputAsString.contains("3") && inputAsString.contains("5"))) {
                    number = "FizzBuzz";
                    writer.println(number);
                } else if ((i % 3 == 0) || inputAsString.contains("3")) {
                    number = "Fizz";
                    writer.println(number);
                } else if ((i % 5 == 0) || inputAsString.contains("5")) {
                    number = "Buzz";
                    writer.println(number);
                } else {
                    number = Integer.toString(i);
                    writer.println(number);
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("Unable to write to file");
        }
        System.out.println("Please check your desktop for the file");
    }

}
