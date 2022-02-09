package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WordCounter {

    public static void main(String[] args) {
        WordCounter wordCount = new WordCounter();
        wordCount.run();
    }

    public void run() {
        File inputFile = getFileFromUser();

        int numLines = 0;
        int numWords = 0;

        /*Scanner inputFileScanner = null;
        PrintWriter log = null;
        try {
            inputFileScanner = new Scanner(inputFile);
            log = new PrintWriter("log.txt")

            while (inputFileScanner.hasNextLine()){
                numLines ++;
            }
        }catch (FileNotFoundException e) {
            System.out.println("Shouldn't Happen!");
        }finally {
            inputFileScanner.close();
            if (log != null) {
                log.close();
            }
        }*/
        try (Scanner inputFileScanner = new Scanner(inputFile);
             PrintWriter log = new PrintWriter("log.txt")) {

            while (inputFileScanner.hasNextLine()) {
                numLines++;
                String lines = inputFileScanner.nextLine();
                String[] words = lines.split(" ");
                numWords += words.length;

                //TODO - Remove Once Were Done
                System.out.format("%3d : %s%n", words.length, lines);
            }

        } catch (
                FileNotFoundException e) {
            System.out.println("Error opening files. Msg: " + e.getMessage());

        }
        System.out.println("The file contains " + numLines +" lines" + " and " +  numWords +" words");
    }
    private File getFileFromUser() {
        File inputFile;
        Scanner inputReader = new Scanner(System.in);
        boolean recievedValidInput = false;
        do {
            System.out.print("Please enter file name");
            String inputFileName = inputReader.nextLine();

            inputFile = new File(inputFileName);

            if (!inputFile.exists()) {
                System.out.format("%S doesn't exist%n", inputFileName);
            } else if (!inputFile.isFile()) {
                System.out.format("%S is not a file%n");
            } else recievedValidInput = true;
        } while (!recievedValidInput);
        return inputFile;
    }
}


