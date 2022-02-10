package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {

        try (Scanner userInput = new Scanner(System.in)) {

            System.out.println("What is the search word?");
            String searchWord = userInput.nextLine();
            if ((searchWord == null) || (searchWord.length() <= 0)) {
                System.out.println("The word to replace is empty");
                System.exit(1);
            }

            System.out.println("What is the replacement word?");
            String replacementWord = userInput.nextLine();
            if ((replacementWord == null) || (replacementWord.length() <= 0)) {
                System.out.println("The replacement word is empty");
                System.exit(1);
            }


            System.out.println("What is the source file?");
            String path = userInput.nextLine();

            File inputFile = new File(path);
            if (!inputFile.exists() || (!inputFile.isFile())){
                System.out.println("Unable to verify source file");
                System.exit(2);
            }

            File destinationFile;
            System.out.println("What is the destination file?");
            path = userInput.nextLine();
            destinationFile = new File(path);
            if (!destinationFile.exists() || (!destinationFile.isFile())) {
                System.out.println("Unable to verify destination file");
                System.exit(2);
            }

            try (Scanner lineScanner = new Scanner(inputFile.getAbsoluteFile());
                 PrintWriter destinationWriter = new PrintWriter(destinationFile.getAbsoluteFile())) {
                while (lineScanner.hasNextLine()) {
                    String line = lineScanner.nextLine();
                    destinationWriter.println(line.replaceAll(searchWord, replacementWord));
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }

    }

}