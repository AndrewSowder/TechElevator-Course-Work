package com.techelevator;

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

   public boolean isRequiresCleaning() {
      return requiresCleaning;
   }

   public void setRequiresCleaning(boolean requiresCleaning) {
      this.requiresCleaning = requiresCleaning;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getNumberOfNights() {
      return numberOfNights;
   }

   public void setNumberOfNights(int numberOfNights) {
      this.numberOfNights = numberOfNights;
   }

   public double getEstimatedTotal() {
      estimatedTotal = estimatedTotal;
      return estimatedTotal;
   }

   public void setEstimatedTotal(double estimatedTotal) {
      this.estimatedTotal = estimatedTotal;
   }

   public double getDailyRate() {
      return dailyRate;
   }

   public void setDailyRate(double dailyRate) {
      this.dailyRate = dailyRate;
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



