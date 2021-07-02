/**
 * The purpose of this program is to print characters and their corresponding ASCII values
 * @author Raymond Lin
 */
public class Unit2Lab1 {
    public static void main(String[] args) {
        //print uppercase letters
        printCharAndASCII('A', 26);

        //print lowercase letters
        printCharAndASCII('a', 26);

        //print numbers
        printCharAndASCII('0', 10);

        //print symbols
        printCharAndASCII('+', 1);
        printCharAndASCII('-', 1);
        printCharAndASCII('_', 1);
        printCharAndASCII('=', 1);
        printCharAndASCII('&', 1);
        printCharAndASCII('@', 1);
        printCharAndASCII('#', 1);
        printCharAndASCII('$', 1);
        printCharAndASCII('?', 1);
        printCharAndASCII('>', 1);
        printCharAndASCII('<', 1);
        printCharAndASCII('|', 1);
        printCharAndASCII('!', 1);
        printCharAndASCII('~', 1);
        printCharAndASCII(' ', 1);
    }

    /**
     * prints count characters after startingChar
     * @param startingChar the character from which the printing starts
     * @param count how many characters are printed
     */
    private static void printCharAndASCII(char startingChar, int count){
        for (int charNum = startingChar; charNum < startingChar + count; charNum++) {
            System.out.printf("The character %c has the ASCII value %d%n", charNum, charNum);
        }
    }
}
