import java.util.Scanner;

public class Unit9Lab1ConsoleMenu {
    public static void displayChoices() {
        System.out.println("I: increment\tD: decrement\tR: reset\tAny other letter: quit");
    }

    /**
     * @param message must not be null
     * @return I, D, or R. If user does not enter any of those three, returns _
     */
    public static char getUserInput(String message) {
        System.out.print(message);
        Scanner input = new Scanner(System.in);
        char output = input.next().charAt(0);
        if (output != 'I' && output != 'D' && output != 'R') {
            return '_';
        }
        return output;
    }

    /**
     * @param counter must not be null
     */
    public static void displayCount(Unit9Lab1 counter) {
        System.out.println("Count: " + counter.getCount());
    }

    /**
     * @param counter must not be null
     */
    public static void incrementCounter(Unit9Lab1 counter) {
        counter.increment();
    }

    /**
     * @param counter must not be null
     */
    public static void decrementCounter(Unit9Lab1 counter) {
        counter.decrement();
    }

    /**
     * @param counter must not be null
     */
    public static void resetCounter(Unit9Lab1 counter) {
        counter.reset();
    }
}
