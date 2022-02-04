package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTest {

    NonStart testCode = new NonStart();

    @Test
    public void return_StringA_if_B_is_null(){
        Assert.assertEquals("ello", testCode.getPartialString("Hello",null));
    }
    @Test
    public void return_StringB_if_A_is_null(){
        Assert.assertEquals("ello", testCode.getPartialString(null,"Hello"));
    }
    @Test
    public void test_returns_correct_concatenation_ofStringA_and_StringB(){
        Assert.assertEquals("Improper Concatenation of String","ellohere", testCode.getPartialString("Hello","There"));
        Assert.assertEquals("Improper Concatenation of String","eneralrievous", testCode.getPartialString("General","Grievous"));
    }

    @Test
    public void test_fails_to_return_correct_concatenation_ofStringA_and_StringB(){
        Assert.assertNotEquals("Improper Concatenation of String","HelloThere", testCode.getPartialString("Hello","There"));
        Assert.assertNotEquals("Improper Concatenation of String","GeneralGrievous", testCode.getPartialString("General","Grievous"));
        Assert.assertNotEquals("Improper Concatenation of String","JaCode", testCode.getPartialString("Java","Code"));
    }
}
