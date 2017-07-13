package com.dorrypractice;

import java.util.ArrayList;

/**
 * Created by dolphincat_yue on 3/22/17.
 * Branch:
 * Need to be able to add a new customer and initial transaction amount.
 * Also needs to add additional transactions for that customer/branch
 */
public class Branch {
    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customername, double initialAmount) {
        if (findCustomer(customername) == null) {
            this.customers.add(new Customer(customername, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        //if customer exist, add transaction

        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            return true;

        }
        //if not exist, error message display
        return false;
    }

    private Customer findCustomer(String name) {
        for (int i = 0; i < customers.size(); i++) {
            Customer checkCustomer = this.customers.get(i);
            if (checkCustomer.getName().equals(name)) {
                return checkCustomer;
            }
        }
        return null;

    }



    //add additional transaction for customer in certain branch


}
