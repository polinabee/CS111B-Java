/** Polina Berenstein
 * Created by pberenstein on 9/18/2016.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class HighScores {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        initialize(names,scores);
        sort(names,scores);
        display(names,scores);
    }
    public static void initialize (ArrayList<String> names, ArrayList<Integer> scores){
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the name for score #1: ");
        names.add(reader.next());

        System.out.print("Enter the score for score #1: ");
        scores.add(reader.nextInt());

        System.out.print("Enter the name for score #2: ");
        names.add(reader.next());

        System.out.print("Enter the score for score #2: ");
        scores.add(reader.nextInt());

        System.out.print("Enter the name for score #3: ");
        names.add(reader.next());

        System.out.print("Enter the score for score #3: ");
        scores.add(reader.nextInt());

        System.out.print("Enter the name for score #4: ");
        names.add(reader.next());

        System.out.print("Enter the score for score #4: ");
        scores.add(reader.nextInt());

        System.out.print("Enter the name for score #5: ");
        names.add(reader.next());

        System.out.print("Enter the score for score #5: ");
        scores.add(reader.nextInt());



    }
    public static void sort (ArrayList<String> names, ArrayList<Integer> scores){
        int s, i, minInd, minScore;
        String minName;

        for (s = 0; s < scores.size()-1; s++){
            minInd = s;
            minName = names.get(s);
            minScore = scores.get(s);
            for (i = s+1; i < scores.size(); i++){
                if (scores.get(i) < minScore){
                    minScore = scores.get(i);
                    minInd = i;
                    minName = names.get(i);
                }
            }

            scores.set(minInd, scores.get(s));
            names.set(minInd, names.get(s));
            scores.set(s,minScore);
            names.set(s, minName);


        }

    }
    public static void display (ArrayList<String> names, ArrayList<Integer> scores){

        System.out.println("Top Scorers:");
        System.out.println(names.get(4)+": "+scores.get(4));
        System.out.println(names.get(3)+": "+scores.get(3));
        System.out.println(names.get(2)+": "+scores.get(2));
        System.out.println(names.get(1)+": "+scores.get(1));
        System.out.println(names.get(0)+": "+scores.get(0));
    }
}
