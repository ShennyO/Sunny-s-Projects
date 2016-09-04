
package inversearray;

import java.util.Scanner;
import java.util.Random;
public class InverseArray {

  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("How many indexes do you want in your array: ");
       int T = in.nextInt(); //initialize T as 4
        int[] array=new int[T];/*created the 4 index array, next step, use a 
for loop to target each index of an array, and a scanner to input the value
of each */
        System.out.println("Normal Order:");
            for(int counter =0; counter<T; counter++){
            array[counter]=rand.nextInt(9);
            System.out.print(array[counter]+ " ");
            }//next step is to print everything out in backwards order
            System.out.println();
            System.out.println("Reverse Order:");
            for(int x=T-1;x>=0;x--){
                System.out.print(array[x]+ " ");
            }
                
    }
    
}
