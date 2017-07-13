package com.dorrypractice;

import java.util.ArrayList;

/**
 * Created by dolphincat_yue on 3/22/17.
 * There should be a Bank class
 * It should have an arraylist of Branches
 * Banks:
 * // Add a new branch
 * // Add a customer to that branch with initial transaction
 * // Add a transaction for an existing customer for that branch
 * // Show a list of customers for a particular branch and optionally a list
 * // of their transaction
 */

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();

    }

    public boolean addBranch(String branchName) {
        if (findbranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        //if the name alrady exist
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initial){
        Branch branch = findbranch(branchName);
        if(branch != null){
            return branch.newCustomer(customerName, initial);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customer, double amount){
        Branch branch = findbranch(branchName);
        if(branch != null){
            return branch.addCustomerTransaction(customer, amount);
        }
        return false;
    }

    private Branch findbranch(String branchName){
        for(int i=0;i<this.branches.size();i++){

            Branch checkBranch = this.branches.get(i);
            if(checkBranch.getBranchName().equals(branchName)){
                return checkBranch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findbranch(branchName);
        if(branch != null){
            System.out.println("Customer details for branch "+branch.getBranchName());
            ArrayList<Customer> customerList = branch.getCustomers();
            for(int i=0;i<customerList.size();i++){
                Customer customer = customerList.get(i);
                System.out.println("Customer: "+customer.getName()+"["+(i+1)+"]");
                if(showTransactions){
                    System.out.println("Transactions: ");
                    ArrayList<Double> transactionDetail = customer.getTransactions();
                    for(int j=0;j<transactionDetail.size();j++){
                        System.out.println("["+(j+1)+"]  Amount "+transactionDetail.get(j));
                    }
                }
            }
            return true;
        } else{
            return false;
        }


    }

}
