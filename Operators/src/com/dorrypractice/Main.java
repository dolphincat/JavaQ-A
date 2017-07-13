package com.dorrypractice;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(result);

        int previousresult = result + 2;

        result = result - 1;
        System.out.println(previousresult);

        boolean isAlien = false;
        if (isAlien == true)
            System.out.println("It is not an Alien");

        int topScore = 80;
        if (topScore == 100)
            System.out.println("You got the highest score!");

        int secondScore = 60;
        if (topScore > secondScore && topScore < 100)
            System.out.println("Greater than second and less than 100");
        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is an error");

        boolean isCar = false;
        if (isCar == true)
            System.out.println("This is not supposed to happen");

        isCar = true;
        boolean wasCar = isCar ? true : false; //assign isCar to wasCar
        if (wasCar)
            System.out.println("wasCar is true");

        System.out.println("PRACTICE");
        double d1 = 20;
        double d2 = 80.6;
        double total = (d1 + d2);
        int remain = (int) (total % 40);
        double remain2 = total%40;
        System.out.println("Integer Remainder is "+remain);
        System.out.println("Double Remainder is "+remain2);

        if (remain <= 20)
            System.out.println("Total was over the limit");
    }
}
