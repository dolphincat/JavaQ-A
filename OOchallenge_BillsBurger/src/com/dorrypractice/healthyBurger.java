package com.dorrypractice;

/**
 * Created by dolphincat_yue on 3/13/17.
 */
public class healthyBurger extends hamburger{
    private String healthyextraname;
    private double healthyextraprice;

    private String healthyextra2name;
    private double healthyextra2price;

    public healthyBurger( String meat, double basePrice) {
        super("Healthy", meat, basePrice, "Brown rye");
    }

    public void addHealthAddition1(String name, double price){
        this.healthyextraname = name;
        this.healthyextraprice = price;
    }

    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name =
    }
}
