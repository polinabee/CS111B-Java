import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by pberenstein on 9/4/2016.
 */
public class ArrayMethods {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] b = {1,2,3,5,-6,4};
        char[] c = {'a','b','e','e','r'};

        System.out.println("The array is "+ Arrays.toString(b));
        if (noNegatives(b)){
            System.out.println("There are no negs");
        }
        else{
            System.out.println("There were negs");
        }

        absoluteValues(b);

        System.out.println("The new string is "+Arrays.toString(b));

        System.out.println("My char array is "+Arrays.toString(c));

        System.out.println("This char array has "+eCount(c)+" Es");

        System.out.print("Pick char to count: ");

        char n = reader.next().charAt(0);

        System.out.println("This char array has "+charCount(c,n)+" "+n+"s");


        if (isSorted(b)){
            System.out.println("The int array is sorted");
        }
        else{
            System.out.println("The int array is not sorted");
        }

        if (equalNeighbors(c)){
            System.out.println("The char array has equal neighbors");
        }
        else{
            System.out.println("The char array has no equal neighbors");
        }


    }

//  1.  Write a method named noNegatives. It should accept an array of integers.
//      It should return true if none of the values are negative. If any of the
//      values are negative it should return false
    public static boolean noNegatives(int a[]){
        for (int i = 0; i < a.length; i++){
            if (a[i] < 0){
                return false;
            }
        }
        return true;
    }


//  2.  Write a method named absoluteValues. It should accept an array of integers.
//      It should replace any negative values with the corresponding positive value.

    public static void absoluteValues(int a[]){
        for (int i = 0; i < a.length; i++){
            a[i] = Math.abs(a[i]);
        }
    }


//  3.  Write a method named eCount. It should accept an array of chars.
//      It should return the number of times that the character ‘e’ shows
//      up in the array.

    public static int eCount(char a[]){
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if (Character.toLowerCase(a[i]) == 'e'){
                count += 1;
            }
        }
        return count;
    }

//   4. Write a method named charCount. It should be similar to eCount, but
//      instead of counting ‘e’s it should accept a second argument, a target
//      char. The method should return the number of times the target char shows
//      in the array

    public static int charCount(char a[], char targetChar){
        int count = 0;
        for (int i = 0; i < a.length; i++){
            if (Character.toLowerCase(a[i]) == Character.toLowerCase(targetChar)){
                count += 1;
            }
        }
        return count;
    }


//  5.  Write a method named isSorted. It should accept an array of integers and
//      return true if the values are sorted in ascending order. False if they
//      are not.

    public static boolean isSorted(int a[]){
        for (int i = 1; i < a.length; i++){
            if (a[i] < a[i - 1]){
                return false;
            }
        }
        return true;
    }


//  6.  Write a method named equalNeighbors. It should accept an array of chars.
//      It should return true if there are two adjacent elements in the array
//      with equal values. If there are not, it should return false.
    
    public static boolean equalNeighbors(char a[]){
        for (int i = 1; i < a.length; i++){
            if (a[i] == a[i-1]){
                return true;
            }
        }
        return false;
    }

}
