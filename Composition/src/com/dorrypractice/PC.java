package com.dorrypractice;

/**
 * Created by dolphincat_yue on 3/8/17.
 */
public class PC {
    //use as object instead of parent;
    //not if you inherientent you can only inheritent from one of the class, but with this
    //it can inheritent from different objects;

    private Case thecase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case thecase, Monitor monitor, Motherboard motherboard) {
        this.thecase = thecase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
        thecase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //Fancy graphics
        monitor.drawPixelAt(1200,50,"yellow");
    }

}
