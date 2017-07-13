/**
 * Created by dolphincat_yue on 3/6/17.
 */
public class Practice1 {
    public static void main(String [] args){
        int positionA = calculateHighScorePosition(1500);
        int positionB = calculateHighScorePosition(900);
        int positionC = calculateHighScorePosition(400);
        int positionD = calculateHighScorePosition(50);

        System.out.println("positionA");

        System.out.println(displayhighscoreposition("Aaron", positionA));
        System.out.println(displayhighscoreposition("Brain", positionB));
        System.out.println(displayhighscoreposition("Corey", positionC));
        System.out.println(displayhighscoreposition("Debby", positionD));


    }

    public static String displayhighscoreposition(String name, int position){
        return name+" managed to get into position "+position +" on the high score table";
    }

    public static int calculateHighScorePosition(int score){
        if (score>1000)
            return 1;
        else if((score>500) && (score<1000))
            return 2;
        else if ((score>100) && (score<500))
            return 3;
        else
            return 4;
    }

}
