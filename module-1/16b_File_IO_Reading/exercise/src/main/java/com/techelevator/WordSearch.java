package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

public class WordSearch {

    public static void main(String[] args) throws FileNotFoundException {
        File fileToSearch = new File("./alices_adventures_in_wonderland.txt");

        Scanner fileScanner = new Scanner(fileToSearch);

        Scanner userInput = new Scanner(System.in);

        System.out.println("What is the name of the file you wish to search?");
        String path = userInput.nextLine();
        System.out.println("What is the word you wish to search?");
        String searchWord = userInput.nextLine();
        System.out.println("Should the search be case sensitive? (Y)es/(N)o");
        String caseSensitive = userInput.nextLine();
        userInput.close();


        int matchCounter = 1;


        if (caseSensitive.contains("Y") || caseSensitive.contains("y")) {

            while (fileScanner.hasNext()) {
                String text = fileScanner.nextLine();
                if (text.contains(searchWord)) {
                    System.out.println(matchCounter + ": " + text);
                }
                matchCounter++;
            }
        } else {

            while (fileScanner.hasNext()) {
                String text = fileScanner.nextLine();
                if (text.toLowerCase().contains(searchWord.toLowerCase())) {
                    System.out.println(matchCounter + ": " + text);
                }
                matchCounter++;
            }
        }

    }
}