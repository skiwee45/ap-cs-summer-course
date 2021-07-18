import java.util.Arrays;
import java.util.Scanner;

public class Unit7Lab3 {
    public static void main(String[] args) {
        // prompt user to enter 3 words
        Scanner input = new Scanner(System.in);
        System.out.println("\nEnter three words: ");
        String a = input.nextLine();
        String b = input.nextLine();
        String c = input.nextLine();
        input.close();

        // call method that returns words in alphabetical order
        String [] words = sortWords(a, b, c);

        // display sorted words
        System.out.println("Sorted in alphabetical order: " + Arrays.toString(words));
    }

    public static String[] sortWords(String a, String b, String c) {
        String[] output = new String[3];
        String largestAB;
        String smaller1;
        String smaller2;
        if (a.compareTo(b) < 0) {
            largestAB = a;
            smaller1 = b;
        } else {
            largestAB = b;
            smaller1 = a;
        }
        String largest;
        if (largestAB.compareTo(c) < 0) {
            largest = largestAB;
            smaller2 = c;
        } else {
            largest = c;
            smaller2 = largestAB;
        }
        output[0] = largest;
        if (smaller1.compareTo(smaller2) < 0) {
            output[1] = smaller1;
            output[2] = smaller2;
        } else {
            output[1] = smaller2;
            output[2] = smaller1;
        }
        return output;
    }
}
