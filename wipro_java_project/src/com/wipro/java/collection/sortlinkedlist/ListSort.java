package com.wipro.java.collection.sortlinkedlist;

import java.util.*;

//Person class representing an object to be sorted
class Person {
 String name;
 int age;

 // Constructor
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Getter methods
 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 @Override
 public String toString() {
     return name + " (" + age + " years old)";
 }
}

//Comparator to sort people by age
class AgeComparator implements Comparator<Person> {
 @Override
 public int compare(Person p1, Person p2) {
     return Integer.compare(p1.getAge(), p2.getAge());
 }
}

//Main class for ListSort
public class ListSort {
 public static void main(String[] args) {
     // Create a LinkedList of Person objects
     LinkedList<Person> people = new LinkedList<>();
     people.add(new Person("Alice", 30));
     people.add(new Person("Bob", 25));
     people.add(new Person("Charlie", 35));
     people.add(new Person("David", 28));

     // Print the list before sorting
     System.out.println("Before sorting:");
     for (Person person : people) {
         System.out.println(person);
     }

     // Sort the LinkedList by age using the AgeComparator
     Collections.sort(people, new AgeComparator());

     // Print the list after sorting
     System.out.println("\nAfter sorting by age:");
     for (Person person : people) {
         System.out.println(person);
     }
 }
}
