/**
 * Created by pberenstein on 10/9/2016.
 */
public class HighScore {
    private String name;
    private int score;

    public HighScore(String n, int s){
        name = n;
        score = s;
    }

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void setScore(int s){
        score = s;
    }
    public int getScore(){
        return score;
    }




}
