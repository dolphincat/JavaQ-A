package com.dorrypractice;

/**
 * Created by dolphincat_yue on 3/7/17.
 */
public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    //constructor#1
    public VipCustomer(){
        this("NO NAME",0.00,"NEED EMAIL");

    }
    //constructor#2
    public VipCustomer(String name, String emailAddress){
        this(name,0.00, emailAddress);
    }

    //constructor#3
    public VipCustomer(String name, double creditLimit, String emailAddress){
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
