import java.util.Scanner;

/**
 * Created by pberenstein on 10/9/2016.
 */
import java.util.Arrays;
public class HighScoresProgram {
    public static void main(String[] args) {
        HighScore a = new HighScore("",0);
        HighScore b = new HighScore("",0);
        HighScore c = new HighScore("",0);
        HighScore d = new HighScore("",0);
        HighScore e = new HighScore("",0);

        HighScore[] scores = {a,b,c,d,e};

        initialize(scores);
        sort(scores);
        display(scores);

    }
    public static void initialize(HighScore[] scores){
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the name for score #1: ");
        scores[0].setName(reader.next());

        System.out.print("Enter the score for score #1: ");
        scores[0].setScore(reader.nextInt());

        System.out.print("Enter the name for score #2: ");
        scores[1].setName(reader.next());

        System.out.print("Enter the score for score #2: ");
        scores[1].setScore(reader.nextInt());

        System.out.print("Enter the name for score #3: ");
        scores[2].setName(reader.next());

        System.out.print("Enter the score for score #3: ");
        scores[2].setScore(reader.nextInt());

        System.out.print("Enter the name for score #4: ");
        scores[3].setName(reader.next());

        System.out.print("Enter the score for score #4: ");
        scores[3].setScore(reader.nextInt());

        System.out.print("Enter the name for score #5: ");
        scores[4].setName(reader.next());

        System.out.print("Enter the score for score #5: ");
        scores[4].setScore(reader.nextInt());

    }
    public static  void sort(HighScore[] scores){
        int j = 0;
        HighScore tmp;
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            j++;
            for (int i = 0; i< scores.length - j; i++){
                if (scores[i].getScore() > scores[i+1].getScore()){
                    tmp = scores[i];
                    scores[i] = scores[i+1];
                    scores[i+1] = tmp;
                    sorted = false;
                }
            }
        }
    }
    public static void display(HighScore[] scores){
        for(int i = scores.length-1; i>=0; i--){
            System.out.println(scores[i].getName()+": "+scores[i].getScore());
        }

    }
}
