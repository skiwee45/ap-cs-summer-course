import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Unit7Lab1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            printArgsError();
        }
        if (args[0].indexOf("-") != 0 || args[0].length() > 3) {
            printArgsError();
        }

        int operationsDone = 0;
        if (args[0].indexOf("c") > -1) {
            System.out.println("The character count is " + characterCount(args[1]));
            operationsDone++;
        }
        if (args[0].indexOf("w") > -1) {
            System.out.println("The word count is " + wordCount(args[1]));
            operationsDone++;
        }
        if (operationsDone == 0) {
            printArgsError();
        }
    }

    public static int characterCount(String str) {
        return str.length();
    }

    public static int wordCount(String str) {
        List<String> words = new LinkedList<>(Arrays.asList(str.split(" "))); 
        int i = words.indexOf("");
        while (i >= 0) {
            words.remove(i);
            i = words.indexOf("");
        }
        return words.size();
    }

    private static void printArgsError() {
        System.out.println("\nRun the program like this: Unit7Lab1 –cw user_string" + 
            "\nc means count characters, w means count words, and if the user_string is longer than one word, put double quotes around it");
        System.exit(0);
    }
}
