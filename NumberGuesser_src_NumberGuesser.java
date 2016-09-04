/**
 * Created by pberenstein on 9/3/2016.
 * CCSF Fall 2016
 */

import java.util.Scanner;

public class NumberGuesser {


    public static void main(String[] args) {


        do{

            playOneGame();
        } while (shouldPlayAgain());
    }

    static void playOneGame(){
        int myGuess;
        int upLimit = 100;
        int lowLimit = 1;
        char response;

        do{
            myGuess = getMidpoint(lowLimit, upLimit);
            response = getUserResponseToGuess(myGuess);

            if (response == 'h'){
                upLimit = myGuess;
            }
            else{
                lowLimit = myGuess;
            }
        }while(response != 'c');

    }
    public static char getUserResponseToGuess(int guess){
        Scanner user_input = new Scanner(System.in);
        System.out.print("is it "+guess+"? (h/l/c): ");
        return user_input.next().charAt(0);

    }

    public static int getMidpoint(int low, int high){
        return((int)Math.floor((low+high)/2));

    }

    static boolean shouldPlayAgain(){
        Scanner user_input = new Scanner(System.in);
        boolean flag = false;
        System.out.print("Great! Do you want to play again? (y/n): ");

        if (user_input.next().charAt(0) == 'y'){
            flag = true;
        }
        return flag;
    }
}
