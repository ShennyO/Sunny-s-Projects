package greatest.common.denominator;

import java.util.Scanner;

public class GreatestCommonDenominator {

    public static void main(String[] args) {
        //I want to create the least common denominator program
        int number1, number2, divisor, dividend, remainder;
        Scanner Sofie = new Scanner(System.in);
        System.out.print("Please enter first character:");
        while (true) { //this just creates an infinite loop
            while (!Sofie.hasNextInt()) {/*while the next user input is not an 
                int, the code will loop to make the user enter again
                until it's an integer.
            if the input is an integer, the code will just skip this part
                 */
                System.out.print("Please enter an integer:");
                Sofie.next();
            }

            number1 = Sofie.nextInt();

            if (number1 > 0) {/*if the input is valid, will break out of this infinite 
           loop, if not, the code runs all the way back up
                 */
                break;
            }
            System.out.print("Please enter a positive integer:");

        }
        System.out.print("Please enter again:");//repeat
        while (true) {
            while (!Sofie.hasNextInt()) {
                System.out.print("Please enter an integer");
                Sofie.next();
            }

            number2 = Sofie.nextInt();
            if (number2 > 0) {
                break;
            }
            System.out.println("Please enter in a positive integer");
        }

        if (number1 > number2) {
            dividend = number1; //in this case, divisor is smaller than dividend
            divisor = number2;
        } else {
            dividend = number1;
            divisor = number2;
        }
        remainder = dividend % divisor;

        while (remainder > 0) {
            /*Euclidian algorithm, will keep looping the algorithm,
           to find the greatest common denominator, which in this case is the 
           divisor
             */

            dividend = divisor;
            divisor = remainder;
            remainder = dividend % divisor;
        }
        System.out.println("Your least common denominator is: " + divisor);

    }

}
