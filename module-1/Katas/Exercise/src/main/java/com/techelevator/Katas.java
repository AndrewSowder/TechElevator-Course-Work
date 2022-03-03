package com.techelevator;

public class Katas {


    /*
Exercise 1: SwapEnds
Create an integer array method called SwapEnds that takes in an integer array "nums".
Given an array of ints, swap the first and last elements in the array.
Return the modified array. The array length will be at least 1.
For example:
swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
*/

    public int[] SwapEnds(int[] nums) {

        int first = nums[0];
        int last = nums[nums.length - 1];

        nums[0] = last;
        nums[nums.length - 1] = first;
        return nums;

    }

    /*
Exercise 2: Has12
Create a boolean method called Has12 that takes in an integer array "nums". Given an array of ints,
return true if there is a 1 in the array with a 2 somewhere later in the array.
For example:
has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true
*/

    public boolean Has12(int[] nums) {
        boolean foundOne = false;
        boolean foundOneTwo = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
            foundOne = true;
            if (nums[i] == 2 && foundOne)
            foundOneTwo = true;
        }
        return foundOneTwo;
    }

    



}






