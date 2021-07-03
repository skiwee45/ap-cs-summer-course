import java.util.Scanner;

public class Unit4Activity1 {
    public static void main(String[] args) {
        //input
        Scanner input = new Scanner(System.in);
        System.out.print("\nHow many questions would you like? ");
        int numQuestions = input.nextInt();

        //setup
        int questionsAsked = 0;
        int answeredCorrectly = 0;
        long initialTime = System.currentTimeMillis();

        while (questionsAsked < numQuestions) {
            //random numbers
            int num1 = (int) (Math.random() * 10);
            int num2 = (int) (Math.random() * 10);
            int correctAnswer = num1 * num2;

            //input
            System.out.print("\nWhat is " + num1 + " * " + num2 + ": ");
            int answer = input.nextInt();

            //check answer
            if (answer == correctAnswer) {
                System.out.println("Congratulations...you are correct!");
                answeredCorrectly++;
            } else {
                System.out.println("Incorrect, the correct answer is " + correctAnswer);
            }
            questionsAsked++;
        }
        input.close();

        //ending
        int score = Math.round((float) answeredCorrectly / numQuestions * 100);
        long millisecondsPassed = System.currentTimeMillis() - initialTime;
        double secondsPassed = (double) millisecondsPassed / 1000;
        System.out.printf("%nYour score was %2d%s%nYour time was %.1f seconds", score, "%", secondsPassed);
    }
}