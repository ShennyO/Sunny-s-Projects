
package dice.roll.frequency;

import java.util.Random;
public class DiceRollFrequency {

  
    public static void main(String[] args) {
       Random Sofie = new Random(); //created the randomizer
       int[] freq = new int[7]; //created the array
       for(int counter= 0; counter < 1000; counter++){/*lets you "roll the die"
           about a 1000 times(creates a loop where you can repeat something 1000x
           */
           ++freq[1+Sofie.nextInt(6)]; /* The randomizer will spit out numbers 
           from 1-6, and the frequency of that number will increase everytime 
           the randomizer lands on that number
           
           */
       }
       System.out.println("Face" + " " + "Frequency"); /* sets up the table 
       for the face values and is frequencies
       */
       for(int j=1; j<freq.length; j++){
           System.out.println(j+ "\t" + freq[j]); /* you can't print out an array
           by itself, so you have to run through each index of an array with a 
           for loop 
           */
       }
    }
    
}
