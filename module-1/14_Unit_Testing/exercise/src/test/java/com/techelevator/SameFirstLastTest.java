package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTest {

    SameFirstLast testCode = new SameFirstLast();

    @Test
    public void test_if_array_is_empty_or_null() {
        Assert.assertFalse(testCode.isItTheSame(new int[]{}));
        Assert.assertFalse(testCode.isItTheSame(null));
    }

    @Test
    public void return_true_if_first_and_last_are_the_same() {
        Assert.assertEquals("First and Last integers are NOT the same", true, testCode.isItTheSame(new int[]{1, 2, 3, 1}));
        Assert.assertEquals("First and Last integers are NOT the same", true, testCode.isItTheSame(new int[]{1, 2, 1}));
    }

    @Test
    public void return_false_if_first_and_last_are_not_the_same() {
        Assert.assertEquals("First and Last integers are the same", false, testCode.isItTheSame(new int[]{1, 2, 3}));
        Assert.assertEquals("First and Last integers are the same", false, testCode.isItTheSame(new int[]{11, 29, 32}));

    }
}
