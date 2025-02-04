package com.wipro.java.oops.polymorphism;

public class CurrentAccount extends BankAccount {

    // Overriding the accountDetails method for Current Account
    @Override
    public void accountDetails() {
        System.out.println("Account Type: "+getAccountType() + " Holder: " + getAccountHolderName());
    }

    // Main method in the CurrentAccount class
    public static void main(String[] args) {
        // Creating an instance of CurrentAccount and setting values
        BankAccount acc2 = new CurrentAccount();
        acc2.setAccountHolderName("John");
        acc2.setAccountType("Current");

        // Calling the overridden accountDetails method
        acc2.accountDetails();  // This will call the overridden method in CurrentAccount class
    }
}
