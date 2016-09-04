package odds.and.evens;

import java.util.Scanner;

public class OddsAndEvens {

    public static void main(String[] args) {
        int T;
        Scanner Sophie = new Scanner(System.in);
        System.out.print("Enter how many words/phrases you want to separate: ");
        T = Sophie.nextInt();
        /*created a user input for how many lines of odds
        and evens you want to create*/
        Sophie.nextLine();/* you need this line to get past the empty space 
        after your nextInt function*/
        for (int i = 0; i < T; i++) {
            /*This for loop is to run through the 
            String so you can separate the odd indexes from the even
             */
            String words = Sophie.nextLine();
            /*declaring the string you're 
            targeting*/
            char[] charArray = words.toCharArray();
            /* the function that allows 
            you to categorize the String into indexes
             */
            for (int j = 0; j < words.length(); j++) {
                /* Running through the 
                string
                 */

                if (j % 2 == 0) {
                    /*determining which letters lie on the even 
                    indexes*/
                    System.out.print(charArray[j]); //printing out the letters
                }
            }
            System.out.print(" "); //making space between the odds and evens

            for (int j = 0; j < words.length(); j++) {
                if (j % 2 == 1) {
                    /*determining the odd indexes */
                    System.out.print(charArray[j]);
                }
            }
            System.out.println();
        }
    }

}
