package com.dorrypractice;

public class Main {

    public static void main(String[] args) {
        /*bankaccount BA = new bankaccount();
        BA.setAccountNumber(10101000);
        BA.setBalance(490.56);
        BA.setEmail("dorryyue@gmail.com");
        BA.setName("Dorry Yue");
        BA.setPhoneNumber(2023943850);
        double m = BA.makeDeposit(50);
        System.out.println("After the deposit was made, the bank has a balance of "+m);

        double n = BA.makeWithdraw(600);
        if (n<0)
            System.out.println("The withdraw is invalid");
        else
            System.out.println("After the withdraw was made, the bank has a balance of "+n);

    */
/*
        Account account = new Account(10000001, 400.00, "Tim");
        System.out.println(account.getEmailAddress());
        System.out.println(account.getPhone());

        *//*account.setBalance(300.00);
        account.deposit(50.00);
        account.withdraw(400);*/

        VipCustomer practice1 = new VipCustomer();
        VipCustomer practice2 = new VipCustomer("Dorry", "dorry@gmail.com");
        VipCustomer practice3 = new VipCustomer("Qiqi", 300.00, "dyue@gwu.edu");

        System.out.println(practice1.getEmailAddress());
        System.out.println(practice2.getCreditLimit());
        System.out.println(practice3.getName());


    }
}
