package com.techelevator;

import com.techelevator.math.Fibonacci;

import java.util.List;

public class FibonacciApp {

    public static void main(String[] args) {

        List<Integer>fibUpTo20 = Fibonacci.getFibonacciNumbers(20);
        System.out.println(fibUpTo20);

        List<Integer>fibUpToMillion = Fibonacci.getFibonacciNumbers(1_000_000);
        System.out.println(fibUpToMillion);
    }

}
