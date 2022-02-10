package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {


    public static void main(String[] args) throws IOException {


        Scanner userInput = new Scanner(System.in);

        File destinationFile;
        System.out.println("What is the destination file?");
        String path = userInput.nextLine();
        destinationFile = new File(path);
        destinationFile.createNewFile();



            try (PrintWriter writer = new PrintWriter(destinationFile.getAbsoluteFile())) {


                    for (int i = 1; i <= 300; i++) {

                    if (i % 3 == 0 && i % 5 == 0) {
                        writer.println("FizzBuzz");

                    } else if (i % 3 == 0) {
                        writer.println("Fizz");

                    } else if (i % 5 == 0) {
                        writer.println("Buzz");

                    } else {
                        writer.println(i);
                    }
                }
                System.out.println("File created in destination");
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            }

        }
    }




