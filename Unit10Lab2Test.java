public class Unit10Lab2Test {
    public static void main(String[] args) {
        Unit10Lab2 counter = new Unit10Lab2();
        boolean breakLoop = false;

        System.out.println();
        Unit10Lab2ConsoleMenu.displayChoices();
        while (!breakLoop) {
            char input = Unit10Lab2ConsoleMenu.getUserInput("\nPress a button: ");
            switch (input) {
                case 'I':
                    Unit10Lab2ConsoleMenu.incrementCounter(counter);
                    break;
                case 'D':
                    Unit10Lab2ConsoleMenu.decrementCounter(counter);
                    break;
                case 'R':
                    Unit10Lab2ConsoleMenu.resetCounter(counter);
                    break;
                case 'A':
                    Unit10Lab2ConsoleMenu.addToCounterMemory(counter);
                    break;
                case 'M':
                    Unit10Lab2ConsoleMenu.resetCounterMemory(counter);
                    break;
                default:
                    breakLoop = true;
                    break;
            }
            Unit10Lab2ConsoleMenu.displayCount(counter);
            Unit10Lab2ConsoleMenu.displayMemoryCount(counter);
        }

    }
}
