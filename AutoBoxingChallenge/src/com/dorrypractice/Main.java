package com.dorrypractice;

// You job is to create a simple banking application.
// There should be a Bank class
// It should have an arraylist of Branches
// Each Branch should have an arraylist of Customers
// The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// Name, and the ArrayList of doubles.
// Branch:
// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch
// Bank:
// Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions

import java.util.Scanner;

public class Main {

    private static Scanner scan;

    public static void main(String[] args) {

        Bank bank = new Bank("National Austtalia Bank");
        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide","Tim", 50.05);
        bank.addCustomer("Adelaide", "Dorry", 56);
        bank.addCustomer("Adelaide", "Bob", 20);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney","Bob",150.34);

        bank.addCustomerTransaction("Adelaide","Tim",50);
        bank.addCustomerTransaction("Adelaide","Tim",12.44);
        bank.addCustomerTransaction("Adelaide","Mike", 1.65);

        bank.listCustomers("Adelaide",true);
    }
}
