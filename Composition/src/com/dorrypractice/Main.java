package com.dorrypractice;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 50);
        Case thecase = new Case("220B", "Dell", "240", dimensions);

        Monitor themonitor = new Monitor("27inch Beast", "Acers", 27, new Resolution(20, 15));
        Motherboard themotherboard = new Motherboard("BJ-200", "ASUS", 4, 6, "v2.44");

        PC thePC = new PC(thecase, themonitor, themotherboard);
        thePC.getMonitor().drawPixelAt(1500, 1200,"red");
        thePC.getMotherboard().loadProgram("Windoes 1.0");
        thePC.getThecase().pressPowerButton();

    }
}
