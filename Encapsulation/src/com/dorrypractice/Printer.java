package com.dorrypractice;

/**
 * Created by dolphincat_yue on 3/9/17.
 */
public class Printer {

    private int tonerlevel;
    private int pages;
    private boolean isDuplexPrinter; //capable of printing on both sides

    public Printer(int tonerlevel,  boolean isDuplexPrinter) {
        if(tonerlevel>-1 && tonerlevel<=100) {
            this.tonerlevel = tonerlevel;
        }
        else {
            this.tonerlevel = -1;
        }
        //this.pages = pages; <--think rational, printed pages won't know untill you have a work to print
        this.isDuplexPrinter = isDuplexPrinter;
        this.pages = 0; //set default for pages
    }

    public void fillToner(int add){
        if((tonerlevel +add)<=100) {
            this.tonerlevel = tonerlevel + add;
            System.out.println("After fill toner, new toner level is " + tonerlevel + "%.");
        }
        else{
            this.tonerlevel = tonerlevel + add;
            System.out.println("After fill toner, new toner level is 100%. ");

        }
    }

    public void simulatePrinting(int newpages){
        int pagestoPrint = pages +newpages;
        if(this.isDuplexPrinter){
            pagestoPrint /=2;
            System.out.println("Printing in duplex mode");
        }
        this.pages +=pagestoPrint;
        System.out.println("After simulating printing, total pages printed is: "+pages);
    }
}
