package com.dorrypractice;

/**
 * Created by dolphincat_yue on 3/7/17.
 */
public class bankaccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public void setAccountNumber(int accountNumber1){
        this.accountNumber = accountNumber1;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    //private String customerName;
    public void setName(String name){
        this.customerName = name;
    }
    public String getName(){
        return this.customerName;
    }
    //private String email;
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
   // private int phoneNumber;
    public void setPhoneNumber(int cell){
        this.phoneNumber = cell;
    }
    public int getPhoneNumber(){
        return this.phoneNumber;
    }

    /*
    create two additional method
    1. allow customer to deposit funds
    2. allow customer to withdraw funds
    do not allow withdraw to complete if they are insufficient
    */

    public double makeDeposit(double deposit){
        this.balance +=deposit;
        return this.balance;
    }


    public double makeWithdraw(double withdraw){
        if ((withdraw >=0)&&(withdraw<=this.balance)){
            this.balance = this.balance - withdraw;
            return this.balance;
        }
        else
            return -1;


    }



}
