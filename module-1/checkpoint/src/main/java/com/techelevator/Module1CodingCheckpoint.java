package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.util.*;

public class Module1CodingCheckpoint {

    boolean requiresCleaning;

    boolean usedMiniBar;

    private String name;

    private int numberOfNights;

    private double estimatedTotal;

    private double dailyRate;

    public static void main(String[] args) {

        Map<String, Integer> guest = new HashMap<>();
        HotelReservation hotelReservation = new HotelReservation("guest",9);
        List<HotelReservation> reservationList = new ArrayList<>();

        String path = "C:\\Users\\Student\\workspace\\andrew-sowder-student-code\\module-1\\checkpoint\\data-files\\HotelInput.csv";

        File file = new File(path);

        try (Scanner scanner = new Scanner(file)) {


            // Trying to read csv file and seperate the guest name from the number of night and store that into a map.

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] sortArry = line.split(",");
                String guestName = sortArry[0];
                Integer numNights = Integer.parseInt(sortArry[1].trim());
                hotelReservation.setName(guestName);
                hotelReservation.setNumberOfNights(numNights);
            }
            System.out.println(hotelReservation);











        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}

