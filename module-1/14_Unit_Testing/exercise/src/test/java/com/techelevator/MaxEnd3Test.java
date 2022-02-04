package com.techelevator;


import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Test {

    MaxEnd3 testCode = new MaxEnd3();

    @Test
    public void correct_array_with_largest_element_is_returned(){
        Assert.assertArrayEquals("Correct array order not returned", new int[]{3,3,3},testCode.makeArray(new int[]{1,2,3}));
        Assert.assertArrayEquals("Correct array order not returned", new int[]{11,11,11},testCode.makeArray(new int[]{11,5,9}));
        Assert.assertArrayEquals("Correct array order not returned", new int[]{3,3,3},testCode.makeArray(new int[]{2,11,3}));
    }
    @Test
    public void correct_array_with_largest_negative_element_is_returned(){
        Assert.assertArrayEquals("Correct array order not returned", new int[]{-1,-1,-1},testCode.makeArray(new int[]{-1,-2,-3}));
        Assert.assertArrayEquals("Correct array order not returned", new int[]{-9,-9,-9},testCode.makeArray(new int[]{-11,-18,-9}));
        Assert.assertArrayEquals("Correct array order not returned", new int[]{-2,-2,-2},testCode.makeArray(new int[]{-2,-11,-3}));
    }
}
