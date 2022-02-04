package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTest {

    DateFashion testCode = new DateFashion();

    @Test
    public void test_no_table_zero_not_stylish_enough() {
        Assert.assertEquals("Too stylish to be denied", 0, testCode.getATable(2, 2));
        Assert.assertEquals("Too stylish to be denied", 0, testCode.getATable(1, 3));
        Assert.assertEquals("Too stylish to be denied", 0, testCode.getATable(3, 1));
        Assert.assertEquals("Too stylish to be denied", 0, testCode.getATable(1, 1));

    }

    @Test
    public void test_maybe_one_get_a_table_one_just_stylish_enough() {
        Assert.assertEquals("Too much or not stylish enough", 1, testCode.getATable(3, 5));
        Assert.assertEquals("Too much or not stylish enough", 1, testCode.getATable(4, 4));
        Assert.assertEquals("Too much or not stylish enough", 1, testCode.getATable(5, 3));
    }

    @Test
    public void test_yes_two_get_a_table_very_stylish() {
        Assert.assertEquals("Not stylish enough", 2, testCode.getATable(3, 8));
        Assert.assertEquals("Not stylish enough", 2, testCode.getATable(10, 10));
        Assert.assertEquals("Not stylish enough", 2, testCode.getATable(8, 3));
    }


}
