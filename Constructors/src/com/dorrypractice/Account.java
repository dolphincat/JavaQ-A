package com.dorrypractice;

/**
 * Created by dolphincat_yue on 3/7/17.
 */
public class Account {
    private int number;
    private double Balance;
    private String Name;
    private String emailAddress;
    private int phone;

    //create a constructor;
    public Account(){
        System.out.println("Empty constructor called");
    }

    public Account(int number, double balance, String name) {
        this(number, balance, name, "emaildefault",0);
    }

    public Account(int number, double balance, String name, String emailAddress, int phone) {
        this.number = number;
        Balance = balance;
        Name = name;
        this.emailAddress = emailAddress;
        this.phone = phone;
    }

    public void deposit(double depositAmount){
        this.Balance += depositAmount;
        System.out.println("Deposit of "+depositAmount+" has made"+
        " the New balance is "+this.getBalance());
    }
    public void withdraw(double withdrawAmount){
        if (Balance - withdrawAmount <= 0){
            System.out.println("Only "+Balance+" available. Withdraw not processed. :(");

        }else{
        this.Balance -= withdrawAmount;
        System.out.println("Withdraw of "+withdrawAmount+" has made"+
                " the New balance is "+this.getBalance());}
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }







}
