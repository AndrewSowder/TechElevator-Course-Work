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

    @Test
    public void Has12() {

        int [] test = new int[]{1, 7, 3, 4, 2};

        Assert.assertTrue(katas.Has12(test));


    }
    @Test
    public void GreenTicket(){

        Assert.assertEquals(0, katas.GreenTicket(1,2,3));
        Assert.assertEquals(10, katas.GreenTicket(1,3,3));
        Assert.assertEquals(20, katas.GreenTicket(3,3,3));
    }

    @Test
    public void Start1(){
        int [] a = {1, 7, 3, 4, 2};
        int [] b = {1, 3, 5, 8, 2};

        int [] c = {3, 7, 3, 4, 2};
        int [] d = {1, 3, 5, 8, 2};

        assertEquals(2, katas.Start1(a,b));
        assertEquals(1,katas.Start1(c,d));
    }





}
