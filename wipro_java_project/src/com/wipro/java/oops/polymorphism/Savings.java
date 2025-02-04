package com.wipro.java.oops.polymorphism;

public class Savings extends BankAccount {

    // Overriding the accountDetails method
    @Override
    public void accountDetails() {
        System.out.println("Account type: "+getAccountType() + " Holder: " + getAccountHolderName());
    }

    // Main method in the Savings class
    public static void main(String[] args) {
        // Creating an instance of Savings and setting values
        BankAccount acc1 = new Savings();
        acc1.setAccountHolderName("Dhruva");
        acc1.setAccountType("Savings");

        // Calling the overridden accountDetails method
        acc1.accountDetails();  // This will call the overridden method in Savings class
    }
}
