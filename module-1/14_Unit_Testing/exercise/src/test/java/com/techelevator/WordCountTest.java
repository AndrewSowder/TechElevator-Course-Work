package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class WordCountTest {

    WordCount testCode = new WordCount();

    @Test
    public void return_empty_map_if_given_empty_array() {

        String[] empty = {};

        Map<String, Integer> map = new HashMap<>();

        Assert.assertEquals(map, testCode.getCount(empty));
    }

    @Test
    public void return_Map_with_correct_keys_and_values() {

        String[] strArray = {"ba", "ba", "black", "sheep", "sheep", "sheep"};

        Map<String, Integer> testMap = new HashMap<>();

        testMap.put("ba", 2);
        testMap.put("black", 1);
        testMap.put("sheep", 3);

        Assert.assertEquals("Incorrect Map returned",testMap, testCode.getCount(strArray));


    }
}