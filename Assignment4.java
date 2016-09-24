
/**
 * Polina Berenstein
 * pberenstein 9/5/16 - CCSF
 */

package Assignment4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class Assignment4 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int c1, c2, c3, c4, c5;

        System.out.print("Enter five numeric cards, no face cards. Use 2 - 9.\n" +
                "Card 1: ");
        c1 = reader.nextInt();

        System.out.print("Card 2: ");
        c2 = reader.nextInt();

        System.out.print("Card 3: ");
        c3 = reader.nextInt();

        System.out.print("Card 4: ");
        c4 = reader.nextInt();

        System.out.print("Card 5: ");
        c5 = reader.nextInt();


        int[] myhand = {c1, c2, c3, c4, c5};

        if (containsFourOfaKind(myhand)){
            System.out.println("Four of a kind!");
        }
        else if (containsFullHouse(myhand)){
            System.out.println("Full house!");
        }
        else if (containsStraight(myhand)){
            System.out.println("Straight!");
        }
        else if (containsThreeOfaKind(myhand)){
            System.out.println("Three of a kind!");
        }
        else if (containsTwoPair(myhand)){
            System.out.println("Two pair!");
        }
        else if (containsPair(myhand)){
            System.out.println("One pair!");
        }
            System.out.println("High card!");
        }
//
//        TESTS
//        if (containsPair(myhand)) {
//            System.out.println("Pair!");
//        } else {
//            System.out.println("Not a pair!");
//        }
//
//        if (containsTwoPair(myhand)) {
//            System.out.println("Two Pair!");
//        } else {
//            System.out.println("Not a two pair!");
//        }
//
//        if (containsThreeOfaKind(myhand)) {
//            System.out.println("Three of a kind!");
//        } else {
//            System.out.println("Not three of a kind!");
//        }
//
//        if (containsStraight(myhand)) {
//            System.out.println("Flush!");
//        } else {
//            System.out.println("Not flush!");
//        }
//
//        if (containsFullHouse(myhand)) {
//            System.out.println("Full house!");
//        } else {
//            System.out.println("Not full house!");
//        }
//
//        if (containsFourOfaKind(myhand)) {
//            System.out.println("Four of a kind!");
//        } else {
//            System.out.println("Not four of a kind!");
//        }

//    }

    public static boolean containsPair(int hand[]) {
        List counts = new ArrayList();
        for (int i = 0; i < hand.length; i++){
            counts.add(counter(hand, hand[i]));
        }
        if (counts.contains(2)) {
            return true;
        }
        return false;
    }

    public static boolean containsTwoPair(int hand[]) {
        int value = 0;
        boolean pair = false;
        for (int i = 0; i < hand.length; i++) {
            for (int j = 1; j < hand.length; j++) {
                if (hand[j] == hand[i] && i != j) {
                    value = hand[i];
                    pair = true;
                }
            }
        }
        for (int i = 0; i < hand.length; i++) {
            for (int j = 1; j < hand.length; j++) {
                if (pair && hand[j] == hand[i] && i != j && hand[i] != value) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsThreeOfaKind(int hand[]){
        List counts = new ArrayList();
        for (int i = 0; i < hand.length; i++){
            counts.add(counter(hand, hand[i]));
        }
        if (counts.contains(3)) {
            return true;
        }
        return false;
    }

    public static boolean containsStraight(int hand[]){
        Arrays.sort(hand);
        for (int i = 1; i < hand.length; i++){
            if (hand[i] <= hand[i - 1]){
                return false;
            }
        }
        return true;
    }

    public static boolean containsFullHouse(int hand[]){
        List counts = new ArrayList();
        for (int i = 0; i < hand.length; i++){
            counts.add(counter(hand, hand[i]));
        }
        if (counts.contains(2) && counts.contains(3)) {
            return true;
        }
        return false;

    }

    public static boolean containsFourOfaKind(int hand[]){
        List counts = new ArrayList();
        for (int i = 0; i < hand.length; i++){
            counts.add(counter(hand, hand[i]));
        }
        if (counts.contains(4)) {
            return true;
        }
        return false;
    }

    public static int counter(int a[], int t){
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if (a[i] == t){
                count += 1;
            }
        }
        return count;
    }
}
