package com.dorrypractice;

/**
 * Created by dolphincat_yue on 3/13/17.
 */
public class hamburger {
    private String rolltype;
    private String meat;
    private double basePrice;
    private String name;

    private String additionalName1;
    private double additionalPrice1;

    private String additionalName2;
    private double additionalPrice2;

    private String additionalName3;
    private double additionalPrice3;

    private String additionalName4;
    private double additionalPrice4;

    public hamburger(String rolltype, String meat, double basePrice, String name) {
        this.rolltype = rolltype;
        this.meat = meat;
        this.basePrice = basePrice;
        this.name = name;
    }

    public void addHumburgerAddition1(String name, double price){
        this.additionalName1 = name;
        this.additionalPrice1 = price;
    }

    public void addHumburgerAddition2(String name, double price){
        this.additionalName2 = name;
        this.additionalPrice2 = price;
    }

    public void addHumburgerAddition3(String name, double price){
        this.additionalName3 = name;
        this.additionalPrice3= price;
    }

    public void addHumburgerAddition4(String name, double price){
        this.additionalName4 = name;
        this.additionalPrice4 = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.basePrice;
        System.out.println(this.name+ " hamburger on a "+this.rolltype+
                " roll price is " +this.basePrice);

        if(this.additionalName1 != null){
            hamburgerPrice += additionalPrice1;
            System.out.println("Additional "+this.additionalName1+" was added and "
                    +"the extra price is "+ this.additionalPrice1);
        }
        if(this.additionalName2 != null){
            hamburgerPrice += additionalPrice2;
            System.out.println("Additional "+this.additionalName2+" was added and "
                    +"the extra price is "+ this.additionalPrice2);
        }
        if(this.additionalName3 != null){
            hamburgerPrice += additionalPrice1;
            System.out.println("Additional "+this.additionalName3+" was added and "
                    +"the extra price is "+ this.additionalPrice3);
        }
        if(this.additionalName1 != null){
            hamburgerPrice += additionalPrice4;
            System.out.println("Additional "+this.additionalName4+" was added and "
                    +"the extra price is "+ this.additionalPrice4);
        }

        return hamburgerPrice;

    }

}




