package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Module1CodingCheckpoint {

    boolean requiresCleaning;

    boolean usedMiniBar;

    private String name;

    private int numberOfNights;

    private double estimatedTotal;

    private double dailyRate;

    public static void main(String[] args) {

        Map<String, Integer> guest = new HashMap<>();


        String path = "C:\\Users\\Student\\workspace\\andrew-sowder-student-code\\module-1\\checkpoint\\data-files\\HotelInput.csv";

        File file = new File(path);

        try (Scanner scanner = new Scanner(file)) {

			// Trying to read csv file and seperate the guest name from the number of night and store that into a map.


            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] temp = line.split(",");
                String name = temp[0];
                String nightStr = temp[1];
                int night = Integer.parseInt(nightStr);
            }

        } catch (FileNotFoundException e) {

        }
    }

}

