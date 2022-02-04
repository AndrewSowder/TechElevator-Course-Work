package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTest {

    StringBits testCode = new StringBits();

    @Test
    public void test_returns_an_empty_string(){
        Assert.assertEquals("Was supposed to return an empty string","", testCode.getBits(""));
    }
    @Test
    public void test_returns_correct_string(){
        Assert.assertEquals("Incorrect String returned","Hello", testCode.getBits("Heeololeo"));
        Assert.assertEquals("Incorrect String returned","H", testCode.getBits("Hi"));
        Assert.assertEquals("Incorrect String returned","HELLO", testCode.getBits("HEEOLOLEO"));
    }
    @Test
    public void test_returns_a_String_of_one(){
        Assert.assertEquals("Incorrect String returned","H", testCode.getBits("H"));
    }
}
