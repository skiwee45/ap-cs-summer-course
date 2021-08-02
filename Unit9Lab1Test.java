public class Unit9Lab1Test {
    public static void main(String[] args) {
        Unit9Lab1 counter = new Unit9Lab1();
        boolean breakLoop = false;

        System.out.println();
        Unit9Lab1ConsoleMenu.displayChoices();
        while (!breakLoop) {
            char input = Unit9Lab1ConsoleMenu.getUserInput("\nPress a button: ");
            switch (input) {
                case 'I':
                    Unit9Lab1ConsoleMenu.incrementCounter(counter);
                    break;
                case 'D':
                    Unit9Lab1ConsoleMenu.decrementCounter(counter);
                    break;
                case 'R':
                    Unit9Lab1ConsoleMenu.resetCounter(counter);
                    break;
                default:
                    breakLoop = true;
                    break;
            }
            Unit9Lab1ConsoleMenu.displayCount(counter);
        }

    }
}
