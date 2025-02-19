package com.wipro.java.collection.FibonacciTreeMap;

import java.util.*;

public class FibonacciSeries {

    // Function to generate Fibonacci series and store it in a TreeMap
    public static Map<Integer, Long> generateFibonacci(int n) {
        // TreeMap to store Fibonacci series where key is the position in the series (1, 2, 3...) and value is the Fibonacci number
        Map<Integer, Long> fibonacciMap = new TreeMap<>();

        long first = 0, second = 1;
        fibonacciMap.put(1, first);  // Fibonacci position 1 is 0
        fibonacciMap.put(2, second); // Fibonacci position 2 is 1

        // Generate the Fibonacci series and store in the map
        for (int i = 3; i <= n; i++) {
            long next = first + second;
            fibonacciMap.put(i, next); // Store Fibonacci number at position i
            first = second;
            second = next;
        }

        return fibonacciMap;
    }

    public static void main(String[] args) {
        // Define the number of terms in the Fibonacci series
        int n = 10; // You can change this number to generate more terms

        // Generate the Fibonacci series and store in TreeMap
        Map<Integer, Long> fibonacciMap = generateFibonacci(n);

        // Print the Fibonacci series
        System.out.println("Fibonacci Series (position -> value):");
        for (Map.Entry<Integer, Long> entry : fibonacciMap.entrySet()) {
            System.out.println("Position " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}

