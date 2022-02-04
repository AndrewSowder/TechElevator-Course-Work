package com.techelevator;

public class ArrayUtils {
    /**
     *Returns the maximum value from the given Array.
     * Returns Integer.MIN_VALUE when array is empty or null.
     *
     *  @param array The array to scan.
     * @return the maximum in array or Integer.MIN_VALUE.
     */



    public static int max(int[] array) {
        //int maxFound = array [0];
        int maxFound = Integer.MIN_VALUE;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxFound) {
                maxFound = array[i];
            }
        }

        return maxFound;
    }

    public static int average(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length - 1; i++) {
            sum += array[0];
        }

        return sum / array.length;
    }

}
