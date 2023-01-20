package day9_guessnumbergame;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {
        
        // initialize scanner class to read user input
        // initialize object guessNumber from Random class to generate a random number <=100 once
        // create Integer variable myGuess
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Integer guessNumber = random.nextInt(100);
        Integer myGuess = 0;

        // compares user input to the random number generator and exits loop until user can get a match with guessNumber
        while (myGuess != guessNumber) {

            System.out.print("Enter your number: ");
            String x = scanner.next();
            myGuess = Integer.parseUnsignedInt(x);

            if (myGuess > guessNumber) {
                System.out.println("Your guess should be lower");
                
            } else if (myGuess < guessNumber) {
                System.out.println("Your guess should be higher");
                
            } else {
                System.out.println("You got it right!");
                scanner.close();
                System.exit(0);
            }
        }

    }
}
