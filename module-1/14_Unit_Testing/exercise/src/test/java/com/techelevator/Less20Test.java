package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Test {

    Less20 testCode = new Less20();

    @Test
    public void test_method_with_multiples_of_Twenty(){
        Assert.assertEquals("Value is not one or two less than a multiple of twenty",false, testCode.isLessThanMultipleOf20(20));
        Assert.assertEquals("Value is not one or two less than a multiple of twenty",false, testCode.isLessThanMultipleOf20(40));
        Assert.assertEquals("Value is not one or two less than a multiple of twenty",false, testCode.isLessThanMultipleOf20(60));
    }

    @Test
    public void test_method_with_numbers_out_of_range(){
        Assert.assertEquals("Value is not one or two less than a multiple of twenty",false, testCode.isLessThanMultipleOf20(5));
        Assert.assertEquals("Value is not one or two less than a multiple of twenty",false, testCode.isLessThanMultipleOf20(15));
        Assert.assertEquals("Value is not one or two less than a multiple of twenty",false, testCode.isLessThanMultipleOf20(55));
        Assert.assertEquals("Value is not one or two less than a multiple of twenty",false, testCode.isLessThanMultipleOf20(75));
    }
    @Test
    public void test_passes_with_oneLessThanMultipleOf20(){
        Assert.assertEquals("Value is not one or two less than a multiple of twenty",true, testCode.isLessThanMultipleOf20(19));
        Assert.assertEquals("Value is not one ot two less than a multiple of twenty",true, testCode.isLessThanMultipleOf20(39));
        Assert.assertEquals("Value is not one or two less than a multiple of twenty",true, testCode.isLessThanMultipleOf20(59));
    }
    @Test
    public void test_passes_with_twoLessThanMultipleOf20(){
        Assert.assertEquals("Value is not one or two less than a multiple of twenty",true, testCode.isLessThanMultipleOf20(18));
        Assert.assertEquals("Value is not one or two less than a multiple of twenty",true, testCode.isLessThanMultipleOf20(38));
        Assert.assertEquals("Value is not one or two less than a multiple of twenty",true, testCode.isLessThanMultipleOf20(58));
    }


}
