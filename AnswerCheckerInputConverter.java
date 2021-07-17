import java.util.*;

/**
 * Sort disarrayed strings into char array usable by AnswerChecker
 * Various public static methods
 */
public class AnswerCheckerInputConverter {
    //methods to be called by AnswerChecker

    /**
     * Find the choices in a string
     * @param value string of the full file
     * @param choices uppercase letters in order, e.g. (A, B, C, D)
     * @return array of chars, all of them are choices extracted from the value
     */
    public static char[] convertSortedChoices(String value, char[] choices) {
        //get user answers
        ArrayList<Character> userAnswers = new ArrayList<>();
        for (char userInput : value.toCharArray()) {
            if (Arrays.binarySearch(choices, userInput) >= 0) {
                userAnswers.add(userInput);
            }
        }
        return convertToArray(userAnswers);
    }

    public static char[] convertUnsortedNumberedChoices(String value, char[] choices) {
        var userAnswers = new char[500];
        Arrays.fill(userAnswers, choices[choices.length- 1]);
        var charArray = value.toCharArray();
        String currentNumberString = "";
        for (int i = 0; i < charArray.length; i++) {
            var userInput = charArray[i];
            //if its a number add it on to the number string
            int number = userInput - '0';
            if (number >= 0 && number <= 9) {
                currentNumberString += userInput;
            } else if (Arrays.binarySearch(choices, userInput) >= 0) { //once it is a choice, convert number string to number
                userAnswers[Integer.parseInt(currentNumberString) - 1] = userInput;
                //clear number string to be used again
                currentNumberString = "";
            }
        }
        return userAnswers;
    }

    //helpers
    public static char[] convertToArray(List<Character> list){
        char[] toReturn = new char[list.size()];
        int i = 0;
        for(char c : list)
            toReturn[i ++] = c;
        return toReturn;
    }

    public static List<Character> convertToList(char[] array){
        List<Character> toReturn = new ArrayList<>(array.length);
        int i = 0;
        for(char c : array)
            toReturn.add(i++, c);
        return toReturn;
    }
}
