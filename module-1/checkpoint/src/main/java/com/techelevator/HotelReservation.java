package com.techelevator;

import java.lang.reflect.Constructor;

public class HotelReservation {

   boolean requiresCleaning;

   boolean usedMiniBar;

   private String name;

   private int numberOfNights;

   private double estimatedTotal;

   private double dailyRate;

// Constructor
   public HotelReservation(String name, int numberOfNights) {
      this.name = name;
      this.numberOfNights = numberOfNights;


   }

   public double calculateActualTotal(boolean requiresCleaning, boolean usedMiniBar) {
      this.requiresCleaning = requiresCleaning;
      this.usedMiniBar = requiresCleaning;
      double miniBarFee = 12.99;
      double roomCleanFee = 34.99;

      if (usedMiniBar && !requiresCleaning) {
         estimatedTotal = estimatedTotal + miniBarFee;
      } else if (!usedMiniBar && requiresCleaning) {
         estimatedTotal = estimatedTotal + roomCleanFee;
      } else if (usedMiniBar && requiresCleaning) {
         estimatedTotal = estimatedTotal + miniBarFee + (roomCleanFee * 2);
      }
      return estimatedTotal;


   }
}



