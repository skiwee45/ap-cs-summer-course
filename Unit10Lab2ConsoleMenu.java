import java.util.Scanner;

public class Unit10Lab2ConsoleMenu {
    public static void displayChoices() {
        System.out.println("I: increment\tD: decrement\tR: reset\t|\tA: add to memory\tM: reset memory\tAny other letter: quit");
    }

    /**
     * @param message must not be null
     * @return Whatever character is inputed
     */
    public static char getUserInput(String message) {
        System.out.print(message);
        Scanner input = new Scanner(System.in);
        return input.next().charAt(0);
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
    public static void displayMemoryCount(Unit10Lab2 counter) {
        System.out.println("Memory Count: " + counter.getMemoryCount());
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

    /**
     * @param counter must not be null
     */
    public static void resetCounterMemory(Unit10Lab2 counter) {
        counter.resetMemory();
    }

    /**
     * @param counter must not be null
     */
    public static void addToCounterMemory(Unit10Lab2 counter) {
        counter.addToMemory();
    }
}
