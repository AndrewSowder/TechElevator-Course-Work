package com.techelevator;

public class HotelReservation {

   boolean requiresCleaning;

   boolean usedMiniBar;

   private String name;

   private int numberOfNights;

   private static final double DAILY_RATE = 59.99;

   private static final double MINI_BAR_FEE = 12.99;

   private static final double ROOM_CLEAN_FEE = 34.99;


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

   public double getNumberOfNights() {
      return numberOfNights;
   }

   public void setNumberOfNights(int numberOfNights) {
      this.numberOfNights = numberOfNights;
   }

   public double getEstimatedTotal() {
       return (DAILY_RATE * numberOfNights);

   }


   public double getDailyRate() {
      return DAILY_RATE;
   }



   public double calculateActualTotal(boolean requiresCleaning, boolean usedMiniBar) {

      double actualTotal = getEstimatedTotal();

      if (usedMiniBar && requiresCleaning) {
          actualTotal = getEstimatedTotal()+ MINI_BAR_FEE + (ROOM_CLEAN_FEE * 2);
      } else if (requiresCleaning) {
         actualTotal = getEstimatedTotal() + ROOM_CLEAN_FEE;
      } else if (usedMiniBar) {
          actualTotal = getEstimatedTotal() + MINI_BAR_FEE;
      }
      return actualTotal;

   }
   @Override
    public String toString() {
        return "RESERVATION - " + getName() + " - " + getEstimatedTotal();
    }
}



