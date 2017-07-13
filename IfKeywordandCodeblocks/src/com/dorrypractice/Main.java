package com.dorrypractice;

public class Main {

    public static void main(String[] args) {

        calculatescore(true, 100, 5, 5);
        calculatescore(true, 10000, 8, 200);
    }

    public static int calculatescore(boolean gameover, int score, int levelcompleted, int bonus) {

        if (gameover) {
            int finalscore = score + (levelcompleted * bonus);
            System.out.println("Your final score was " + finalscore);
            return finalscore;
        }
        else{
            return -1;
        }
    }

}
