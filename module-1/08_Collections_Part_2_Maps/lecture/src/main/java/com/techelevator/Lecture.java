package com.techelevator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lecture {

    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
        names.add("Andrew");
        names.add("Alexis");
        names.add("Andrew");
        names.add("Sterling");
        names.add("andrew");

        if (names.contains("Andrew")) {
            System.out.println("Yes");
        }

        for (String name : names) {
            System.out.println(name);
        }


        Set<Integer> randomNums = new HashSet<>();
        while (randomNums.size() < 50) {
            for (int i = 0; i < 50; i++) {
                double randDouble = Math.random();
                int randInt = (int) ((randDouble * 100) + 1);
                if (!randomNums.add(randInt)) {
                    System.out.println("Didn't re-add" + randInt);
                }
            }
        }
        ;


        System.out.println("####################");
        System.out.println("        MAPS");
        System.out.println("####################");
        System.out.println();

        Map<String, String> stateAbrevs = new HashMap<>();

        stateAbrevs.put("OH", "Ohio");
        stateAbrevs.put("KY", "Kentucky");
        stateAbrevs.put("IN", "Indiana");
        stateAbrevs.put("HI", "Hawaii");
        stateAbrevs.put("OH", "Ohio - The Heart Of It All");

        String kentucky = stateAbrevs.get("KY");
        String hawaii = stateAbrevs.get("HI");
        String ohio = stateAbrevs.get("OH");
        System.out.println(kentucky);
        //if(hawaii.equals(null))
        if (hawaii == null) {

            System.out.println("Key not found");
        }
        System.out.println(ohio);
        System.out.println(hawaii);

        stateAbrevs.put("oh", "Ohio");

        Lecture lecture = new Lecture();
        String result = lecture.getStateName(stateAbrevs, "OH");
        System.out.println(result);

        Set<String> stateKeys = stateAbrevs.keySet();
        for (String stateKey : stateKeys) {
            System.out.println(stateKey + " : " + stateAbrevs.get(stateKey));
        }


        // A Map of Pretend Status
        Map<Integer, String> statuses = new HashMap<>();
        statuses.put(1, "Order Received");
        statuses.put(2, "Label Printed");
        statuses.put(3, "In Transit");
        statuses.put(4, "Delivered");

    }


    public String getStateName(Map<String, String> states, String stateAbrev) {
    /*    String statename = states.get(stateAbrev);
        if (statename == null) {
            statename = "Unknown";
        }*/
        if (states.containsKey(stateAbrev)) {
            return states.get(stateAbrev);
        } else {
            return "Unknown";


        }

    }
}

