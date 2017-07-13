package com.dorrypractice;

import java.util.ArrayList;

/**
 * Created by dolphincat_yue on 3/22/17.
 * The Customer class should have an arraylist of Doubles (transactions)
 * Customer:
 * Name, and the ArrayList of doubles.
 *
 */

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double iniAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransactions(iniAmount);
    }

    public void addTransactions(double amount){
        this.transactions.add(amount);
    }
    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    /*
    public static Customer createCustomer(String name, ArrayList<Double> transactions){
        return new Customer(name, transactions);
    }
*/

}
