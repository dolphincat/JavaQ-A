package com.dorrypractice;

public class Main {

    public static void main(String[] args) {

    /*    for (int i = 0; i < 7; i++) {
            System.out.println("10,000 at " + (i + 2) + "% interest " + calculateInterest(10000.0, (i + 2)));
        }

        System.out.println("NEXT");
        for (int i = 8; i > 0; i--) {
            System.out.println("10,000 at " + i + "% interest " + String.format("%.2f", calculateInterest(10000.0, i)));

        }

    }*/

        int checkNumber = 10;
        int j = 0;

        for (int num = checkNumber; num <= checkNumber + 10; num++) {
            if (isPrime(num)){
                System.out.println(num);
                j++;
                if (j == 3){
                    System.out.println("The prime number in the range has reached 3!");
                    break;}
            }
        }

    }

    public static boolean isPrime(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i <= n / 2; i++) {
            //i<=(long)Math.sqrt(n) <--this saves more time on finding the
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }*/
}
