package com.wipro.java.collection.userlist;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head; // Initially, the linked list is empty

    // Constructor to initialize an empty list
    public LinkedList() {
        head = null;
    }

    // Add a new node at the end
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; // If list is empty, new node becomes the head
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next; // Traverse to the last node
        }
        last.next = newNode; // Link the last node to the new node
    }

    // Insert a new node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head; // Point the new node to the current head
        head = newNode; // Make new node the head of the list
    }

    // Delete a node by value
    public void delete(int data) {
        Node current = head;

        // If the node to delete is the head
        if (current != null && current.data == data) {
            head = current.next; // Move the head to the next node
            current = null; // Free the node
            return;
        }

        Node prev = null;
        // Traverse the list to find the node to delete
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }

        // If data wasn't found
        if (current == null) {
            System.out.println("Node with data " + data + " not found.");
            return;
        }

        prev.next = current.next; // Unlink the node from the list
        current = null; // Free the node
    }

    // Search for a node by value
    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false; // If the data isn't found
    }

    // Display the entire list
    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("List is empty.");
            return;
        }
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("None");
    }

    // Main method to test the LinkedList class
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Append");
            System.out.println("2. Insert at Beginning");
            System.out.println("3. Delete");
            System.out.println("4. Search");
            System.out.println("5. Display List");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to append: ");
                    int appendData = sc.nextInt();
                    ll.append(appendData);
                    break;

                case 2:
                    System.out.print("Enter data to insert at beginning: ");
                    int insertData = sc.nextInt();
                    ll.insertAtBeginning(insertData);
                    break;

                case 3:
                    System.out.print("Enter data to delete: ");
                    int deleteData = sc.nextInt();
                    ll.delete(deleteData);
                    break;

                case 4:
                    System.out.print("Enter data to search: ");
                    int searchData = sc.nextInt();
                    if (ll.search(searchData)) {
                        System.out.println("Node with data " + searchData + " found.");
                    } else {
                        System.out.println("Node with data " + searchData + " not found.");
                    }
                    break;

                case 5:
                    ll.display();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}
