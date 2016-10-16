/**
 * Created by pberenstein 10/4/16.
 * CCSF Fall 2016
 */

import java.util.Scanner;

public class GuessingProgram {
    public static void main(String[] args) {
        char response;
        NumberGuesser guesser = new NumberGuesser(1,100);
        Scanner user_input = new Scanner(System.in);
        int lowLim;
        int highLim;

        do{
            System.out.println("Pick a lower limit: ");
            lowLim = user_input.nextInt();
            System.out.println("Pick a high limit: ");
            highLim = user_input.nextInt();
            guesser.reset(highLim, lowLim);
            System.out.println("Pick a number between "+lowLim+" and "+highLim);
            do{
                response = getUserResponseToGuess(guesser.getCurrentGuess());
                if (response == 'h'){
                    guesser.higher();
                }
                else{
                    guesser.lower();
                }
            }while(response != 'c');
            System.out.print("Great! Do you want to play again? (y/n): ");
        } while (shouldPlayAgain(user_input));
    }


    public static char getUserResponseToGuess(int guess){
        Scanner user_input = new Scanner(System.in);
        System.out.print("is it "+guess+"? (h/l/c): ");
        return user_input.next().charAt(0);

    }

    static boolean shouldPlayAgain(Scanner x){

        boolean flag = false;

        if (x.next().charAt(0) == 'y'){
            flag = true;
        }
        return flag;
    }
}
