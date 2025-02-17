package com.wipro.java.collection.usecase2;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class MapCollection {

    public static void main(String[] args) {
        // Step 1: Create a TreeMap and add some data
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Apple");
        treeMap.put(3, "Banana");
        treeMap.put(2, "Cherry");
        treeMap.put(4, "Date");

        // Step 2: Fetch data from TreeMap and store it in a HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        
        // Loop through the TreeMap and transfer data to HashMap
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }

        // Step 3: Display data from both collections
        System.out.println("Data in TreeMap (sorted by key):");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " | Value: " + entry.getValue());
        }

        System.out.println("\nData in HashMap (unordered):");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " | Value: " + entry.getValue());
        }
    }
}

