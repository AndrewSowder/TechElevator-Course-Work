package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Test {

    Lucky13 testCode = new Lucky13();

    @Test
    public void test_fails_if_there_are_ones_or_threes(){
        Assert.assertEquals("Array contains 1's or 3's", false, testCode.getLucky(new int []{1,3,13,}));
        Assert.assertEquals("Array contains 1's or 3's", false, testCode.getLucky(new int []{2,6,3,}));
    }
    @Test
    public void test_passes_if_there_are_no_ones_or_threes(){
        Assert.assertEquals("Array contains no 1's or 3's", true,testCode.getLucky(new int []{2,4,6,}));
        Assert.assertEquals("Array contains no 1's or 3's", true, testCode.getLucky(new int []{6,8,0,}));
    }
}
