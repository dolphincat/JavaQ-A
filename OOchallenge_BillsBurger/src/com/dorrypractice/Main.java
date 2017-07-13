package com.dorrypractice;



public class Main {

    public static void main(String[] args) {
        hamburger ham = new hamburger("Basic", "Sausage", 3.56,"White");
        double price = ham.itemizeHamburger();
        ham.addHumburgerAddition1("Tomato", 0.27);
        ham.addHumburgerAddition2("Lettuce", 0.75);
        ham.addHumburgerAddition3("Cheese", 1.12);
        System.out.println("Total burger price is "+ham.itemizeHamburger());
    }
}
