package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.util.*;

public class Module1CodingCheckpoint {


    public static void main(String[] args) {

        List<HotelReservation> reservationList = new ArrayList<>();


        String path = "C:\\Users\\Student\\workspace\\andrew-sowder-student-code\\module-1\\checkpoint\\data-files\\HotelInput.csv";

        File file = new File(path);

        try (Scanner scanner = new Scanner(file)) {


            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] splitLine = line.split(",");
                String name = splitLine[0];
                String temp = splitLine[1].trim();
                Integer numNights = Integer.parseInt(temp);
                HotelReservation hotelReservation = new HotelReservation(name, numNights);
                reservationList.add(hotelReservation);

            }
            System.out.println(reservationList.toString());

            double reservationListTotalSum = 0.0;
            for (HotelReservation reservation : reservationList) {
                reservationListTotalSum += reservation.getEstimatedTotal();

            }
            System.out.println(reservationListTotalSum);

            HotelReservation hotelReservation = new HotelReservation("Mickey Mouse", 10);
            System.out.println(hotelReservation.calculateActualTotal(true,true));
            System.out.println(hotelReservation.calculateActualTotal(true,true));



        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }
}

