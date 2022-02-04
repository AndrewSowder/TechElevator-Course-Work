package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class AnimalGroupNameTest {

    AnimalGroupName testCode = new AnimalGroupName();

    @Test
    public void correct_animal_group_returned_from_animal_name(){

        Assert.assertEquals( "Incorrect animal group returned", "Crash",testCode.getHerd("rhino"));
        Assert.assertEquals( "Incorrect animal group returned", "Crash",testCode.getHerd("RHINO"));
        Assert.assertEquals( "Incorrect animal group returned", "Crash",testCode.getHerd("Rhino"));
        Assert.assertEquals( "Incorrect animal group returned", "Crash",testCode.getHerd("RhINo"));

    }
    @Test
    public void returns_unknown_if_null_empty_or_not_found(){
        Assert.assertEquals("Incorrect animal group returned", "unknown", testCode.getHerd(null));
        Assert.assertEquals("Incorrect animal group returned", "unknown", testCode.getHerd("Honey Badger"));
        Assert.assertEquals("Incorrect animal group returned", "unknown", testCode.getHerd(""));
    }








}
