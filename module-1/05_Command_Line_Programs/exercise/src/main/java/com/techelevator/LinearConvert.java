package com.techelevator;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);


		System.out.println("Linear Conversion");


		System.out.print("Please enter the length:");
		String lengthStr = scanner.nextLine();
		double length = Double.parseDouble(lengthStr);


		System.out.print("Is the measurement in (m)eter, or (f)eet?:");
		String meterOrFeet = scanner.next();

		double convertedlength;


		if (meterOrFeet.equals("m")) {
			convertedlength = (length * 3.2808399);
			System.out.printf("%2.1fm is %2.1ff", length, convertedlength) ;
		}
		if (meterOrFeet.equals("f")) {
			convertedlength = (length * 0.3048);
			System.out.printf("%2.1ff is %2.1fm", length, convertedlength) ;


		}
	}
}
