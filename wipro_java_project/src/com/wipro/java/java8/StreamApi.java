package com.wipro.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

	public class StreamApi {
		
		public StreamApi () {
			// TODO Auto-generated constructor stub
		}
		public static void main(String[] args) {
			List<String> list= Arrays.asList("Charan","Meghana","Jay");
			List<String> stream = list.stream().
				filter (name->name. startsWith("M")).
				collect(Collectors. toList());
				System.out.println(stream);
			List<String> stream1 = list.stream().
				map(String::toUpperCase).collect(Collectors.toList());
				System.out.println(stream1);
			List<Integer> number = Arrays.asList(6,4,7,8);
			List<Integer> Number = number.stream()
				   .sorted()
				   .collect(Collectors.toList());
			System.out.println(Number);
			List<Integer> newnumbers = Arrays.asList(10, 20, 5, 25, 30);// Creating another list of integers
			int min = newnumbers.stream().min(Integer::compare).get();// Finding the minimum value in the list
			int max = newnumbers.stream().max(Integer::compare).get();// Finding the maximum value in the list
			System.out.println("Min: " + min);
			System.out.println("Max: " + max);
		}
}