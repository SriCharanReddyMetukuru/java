package com.wipro.java.oops.polymorphism;

public class BankAccount {
    private String accountHolderName;
    private String accountType;

    // Getter and Setter methods
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    // Method to display account details
    public void accountDetails() {
        System.out.println(getAccountType() + " Holder: " + getAccountHolderName());
    }
}
