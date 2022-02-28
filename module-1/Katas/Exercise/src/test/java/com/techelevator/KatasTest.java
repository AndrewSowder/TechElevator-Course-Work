package com.techelevator;

import org.junit.*;

import static org.junit.Assert.*;


public class KatasTest{

    Katas katas = new Katas();



    /* swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
        swapEnds([1, 2, 3]) → [3, 2, 1]
        swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]*/
    @Test
public void SwapEnds() {

        int [] test = new int[]{1, 2, 3, 4};

        Assert.assertArrayEquals(new int []{4, 2, 3, 1},katas.SwapEnds(test));


    }





}
