import java.util.Scanner;
import java.lang.Math;

public class NumberGame {

    public static void main(String[] args) {
        /**
         * Math.random() generates a number between 0 and 1(greater than or equal to 0 and less than 1)
         * and by multiplying the generated number by 100, results in a number between 0 and 99.
         * A number generated by the random() method is double and as we are only interested in int numbers
         * So we type cast(converted from one data type to another) it into an int.
         * By adding 1 to the answer, we get number between 1 and 100
        */
        int actualNumber = (int) ( Math.random()*100) + 1;
        Scanner scn = new Scanner(System.in);
        System.out.println("A number is chosen between 1 to 100. Guess the number");
        // The number of attempts the user has to guess the number is 10
        int attempts = 10 ;
        while( attempts > 0 ) {
            System.out.print("Enter your guess : ");
            int guess = scn.nextInt();
            if (guess < 1) {
                System.out.println("The chosen number is not between 1 to 100. Please choose a number between 1 to 100");
                attempts-- ;
            }
            else {
                if ( guess == actualNumber ) {
                    System.out.println("Congratulations! You guessed the number.");
                    return;
                }
                else if (guess > actualNumber) {
                    System.out.println("Your guess is too high.");
                }
                else if (guess < actualNumber) {
                    System.out.println("Your guess is too low.");
                }
                attempts--;
            }
        }
        System.out.println();
        System.out.print("No attempts left.You lose!");
    }
}
