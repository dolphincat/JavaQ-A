package com.dorrypractice;

public class Main {

    public static void main(String[] args) {
        // encapsulation provides more control over class
        // such as not allow someone to access it....

        /*Player player = new Player();

        player.name = "Dorry";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);

        System.out.println("Remaining health = " +player.healthRemaining());

         damage = 11;
        player.loseHealth(damage);

        System.out.println("Remaining health = " +player.healthRemaining());*/

        //EnhancedPlayer player = new EnhancedPlayer("Dorry", 200, "Sword");
        //System.out.println("Initial health is = "+player.getHealth());

        Printer computerPrinter = new Printer(50, true);
        computerPrinter.fillToner(40);
        computerPrinter.fillToner(60);
        computerPrinter.simulatePrinting(50);
    }
}
