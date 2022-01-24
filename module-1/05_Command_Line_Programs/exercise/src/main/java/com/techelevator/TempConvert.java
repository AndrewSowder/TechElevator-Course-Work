package com.techelevator;

import java.util.Scanner;

public class TempConvert {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("Temperature Converter");


        System.out.print("Please enter the temperature:");
        String temperatureStr = scanner.nextLine();
        double temperature = Double.parseDouble(temperatureStr);


        System.out.print("Is the Temperature in (C)elsius, or (F)arenheiht?:");
        String cOrF = scanner.next();

        double convertedTemps = 0;


        if (cOrF.equals("F")) {
            convertedTemps = (temperature - 32) / 1.8;
            System.out.printf("%3.0fC is% 3.0fF", temperature , convertedTemps);

        }
        if (cOrF.equals("C")) {
            convertedTemps = (temperature * 1.8) + 32;
            System.out.printf("%3.0fF is% 3.0fC", temperature , convertedTemps);

        }
    }
}


//temperatureCelcius = (temperatureFarenheit - 32) / 1.8
// temperatureFarenheit = temperatureCelcius * 1.8 + 32





