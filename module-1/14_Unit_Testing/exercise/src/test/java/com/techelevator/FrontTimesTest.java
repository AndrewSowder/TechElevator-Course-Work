package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTest {

    FrontTimes testCode = new FrontTimes();

    @Test
    public void test_method_with_negative_int(){
        Assert.assertEquals("Only enter non-negative integers","",testCode.generateString("Chocolate", -1));
    }
    @Test
    public void test_method_with_zero_int(){
        Assert.assertEquals("Only enter non-negative integers","",testCode.generateString("Chocolate", 0));
    }
    @Test
    public void test_method_with_one_letter_one_time(){
        Assert.assertEquals("Didn't return expected String","C",testCode.generateString("C", 1));
    }
    @Test
    public void test_method_with_one_letter_two_times(){
        Assert.assertEquals("Didn't return expected String","CC",testCode.generateString("C", 2));
    }
    @Test
    public void test_method_with_one_letter_three_times(){
        Assert.assertEquals("Didn't return expected String","CCC",testCode.generateString("C", 3));
    }
    @Test
    public void test_method_with_two_letters_one_time(){
        Assert.assertEquals("Didn't return expected String","Ch",testCode.generateString("Ch", 1));
    }
    @Test
    public void test_method_with_two_letters_two_times(){
        Assert.assertEquals("Didn't return expected String","ChCh",testCode.generateString("Ch", 2));
    }
    @Test
    public void test_method_with_two_letters_three_times(){
        Assert.assertEquals("Didn't return expected String","ChChCh",testCode.generateString("Ch", 3));
    }
    @Test
    public void test_method_with_three_letters_one_time(){
        Assert.assertEquals("Didn't return expected String","Cho",testCode.generateString("Cho", 1));
    }
    @Test
    public void test_method_with_three_letters_two_times(){
        Assert.assertEquals("Didn't return expected String","ChoCho",testCode.generateString("Cho", 2));
    }
    @Test
    public void test_method_with_three_letters_three_times(){
        Assert.assertEquals("Didn't return expected String","ChoChoCho",testCode.generateString("Cho", 3));
    }
    @Test
    public void test_method_with_word_more_than_three_letters_one_time(){
        Assert.assertEquals("Didn't return expected String","Cho",testCode.generateString("Chocolate", 1));
    }
    @Test
    public void test_method_with_word_more_than_three_letters_two_times(){
        Assert.assertEquals("Didn't return expected String","ChoCho",testCode.generateString("Chocolate", 2));
    }
    @Test
    public void test_method_with_word_more_than_three_letters_three_time(){
        Assert.assertEquals("Didn't return expected String","ChoChoCho",testCode.generateString("Chocolate", 3));
    }


}
