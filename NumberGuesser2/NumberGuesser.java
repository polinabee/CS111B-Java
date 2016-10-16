/**
 * Created by pberenstein on 10/2/2016.
 */
public class NumberGuesser {

    private int high;
    private int low;

    public NumberGuesser(int lowerBound, int upperBound){
        low = lowerBound;
        high = upperBound;
    }

    public int getHigh(){
        return high;
    }

    public int getLow(){
        return low;
    }

    public int getCurrentGuess(){
        return((int)Math.floor((getLow()+getHigh())/2));
    }

    public void higher(){
        low = getCurrentGuess();
    }

    public void lower(){
        high = getCurrentGuess();
    }

    public void reset(int hlim, int llim){
        high = hlim;
        low = llim;
    }



}
