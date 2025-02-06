package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(0,10);
		l1.add(1,12);
		l1.add(2,13);
		System.out.println(l1);
		
		List<Integer> l2=new ArrayList<Integer>();
		l2.add(11);
		l2.add(22);
		l2.add(33);
		System.out.println(l2);
		
		l1.addAll(1,l2);
		System.out.println(l1);
		
		l1.remove(1);     // Based on index position
		System.out.println(l1);
		
		l1.set(0, 99);    // Replacing
		System.out.println(l1);

	}

}
