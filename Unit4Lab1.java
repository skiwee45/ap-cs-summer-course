import java.util.Scanner;

public class Unit4Lab1 {
    public static void main(String[] args) {
        //initial input
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhat would you like the maximum number to be? ");
        final int MAX_NUM = input.nextInt();
        System.out.print("How many guesses do you want? ");
        final int NUM_GUESSES = input.nextInt();
        System.out.println("");

        boolean playAgain;
        do {
            //setup
            int randomNumber = (int) (MAX_NUM * Math.random()) + 1;
            int numGuesses = 0;
            while (numGuesses < NUM_GUESSES) {
                System.out.print("What is your guess? ");
                int guess = input.nextInt();
                if (guess == randomNumber) {
                    System.out.println("Correct!");
                    break;
                } else if (guess > randomNumber) {
                    System.out.println("Too High");
                } else {
                    System.out.println("Too Low");
                }
                numGuesses++;
            }
            System.out.print("\nEnter true to play again and false to end: ");
            playAgain = input.nextBoolean();
        } while (playAgain);
        input.close();
    }
}
