import java.util.*;
import java.io.IOException;
import java.nio.file.*;

/**
 * Find differences between two char arrays
 * java AnswerChecker D:\\Downloads\\SATMyAnswers.txt sorted D:\\Downloads\\SATAnswerKey.txt unsorted 4
 */
public class AnswerChecker {
    public static void main(final String[] args) throws IOException {
        //check args
        if (args.length != 5) {
            printArgsError();
        }

        //file reading
        String userAnswersString = readFileAsString(args[0]);
        String answerKeyString = readFileAsString(args[2]);
        char[] choices = createCharArray('A', Integer.parseInt(args[4]));
        choices = Arrays.copyOf(choices, choices.length + 1);
        choices[choices.length - 1] = '_'; //this is the skip char
        char[] userAnswers = convertFile(userAnswersString, choices, args[1]);
        char[] answerKey = convertFile(answerKeyString, choices, args[3]);

        //compare answers
        LinkedHashMap<Integer, Character> correctedAnswers = new LinkedHashMap<>();
        LinkedHashMap<Integer, Character> answerKeyMissing = new LinkedHashMap<>();
        for (int i = 0; i < userAnswers.length; i++) {
            if (answerKey[i] == '_') {
                answerKeyMissing.put(i + 1, answerKey[i]);
            } else if (userAnswers[i] != answerKey[i]) {
                correctedAnswers.put(i + 1, answerKey[i]);
            }
        }

        //display
        System.out.println("\nThe corrected answers are: ");
        for (var i : correctedAnswers.entrySet()) {
            System.out.println(
                i.getKey() +
                "  Your Answer: " + userAnswers[i.getKey() - 1] +
                "\tCorrect Answer: " + i.getValue());
        }
        System.out.println("\nThe missing answer key questions are: ");
        for (var i : answerKeyMissing.entrySet()) {
            System.out.println(
                i.getKey() +
                "  Your Answer: " + userAnswers[i.getKey() - 1]);
        }
    }

    public static char findCharFromString(final String value, final char[] charsToFind, final boolean convertUpperCase) {
        for (char c : charsToFind) {
            if (value.indexOf(convertUpperCase ? Character.toUpperCase(c) : c) >= 0) {
                return c;
            }
        }
        return '0';
    }

    public static char[] createCharArray(final char startingChar, final int count) {
        char[] output = new char[count];
        for (int charNum = startingChar; charNum < startingChar + count; charNum++) {
            output[charNum - startingChar] = (char) charNum;
        }
        return output;
    }

    public static String readFileAsString(String fileName)throws IOException{
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

    private static void printArgsError()
    {
        System.out.println("\nError, please call this class with five inputs: " + 
        "\nfile name of your answers (use double backslashes between folders)" + 
        "\nformat of the answers (sorted, unsorted)" + 
        "\nfile name of answer key (use double backslashes between folders)" + 
        "\nformat of the answer key (sorted, unsorted)" + 
        "\nhow many letter choices each question had" + 
        "\nif there are some answers that are missing just replace it with '_'");
        System.exit(0);
    }

    private static char[] convertFile(String fullFile, char[] choices, String type){
        char[] output = new char[1];
        switch (type) {
            case "sorted":
                output = AnswerCheckerInputConverter.convertSortedChoices(fullFile, choices);
                break;
            case "unsorted":
                output = AnswerCheckerInputConverter.convertUnsortedNumberedChoices(fullFile, choices);
                break;
            default:
                printArgsError();
                break;
        }
        return output;
    }
}
