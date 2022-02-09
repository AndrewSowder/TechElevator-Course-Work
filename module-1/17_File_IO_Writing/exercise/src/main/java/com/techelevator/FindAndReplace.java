package com.techelevator;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

    public static void main(String[] args) {

        Scanner dataInput = new Scanner(System.in);

        PrintWriter dataOutput = new PrintWriter(System.out);

        System.out.println("What is the name of the file you wish to search?");
        File fileToSearch = new File(userInput.nextLine());
        System.out.println("What is the word you wish to search?");
        String searchWord = userInput.nextLine();
        System.out.println("Should the search be case sensitive? (Y)es/(N)o");
        String caseSensitive = userInput.nextLine();
        userInput.close();
        Scanner fileScanner = new Scanner(fileToSearch);



    }

}
