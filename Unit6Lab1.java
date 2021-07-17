import java.util.Arrays;
import java.util.Scanner;

public class Unit6Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many integers are you going to enter: ");
        final int numInts = input.nextInt();

        System.out.println("Enter integers from 1-50: ");
        int[] inputs = new int[numInts];
        for (int i = 0; i < numInts; i++) {
            int temp = input.nextInt();
            if (temp < 1 || temp > 50) {
                i--;
                System.out.println("Please enter an integer from 1-50: ");
                continue;
            }
            inputs[i] = temp;
        }
        input.close();

        //output
        int[] uniqueElements = findUniqueElements(inputs);
        for (int i : uniqueElements) {
            int occurances = calculateOccurances(i, inputs);
            System.out.println(i + " occurs " + occurances + " times");
        }
    }

    private static int calculateOccurances (int key, int[] arr) {
        int occurances = 0;
        for (int i : arr) {
            if (key == i) {
                occurances++;
            }
        }
        return occurances;
    }

    private static int[] findUniqueElements (int[] arr) {
        int[] uniqueElements = new int[arr.length];
        int numUniqueElements = 0;
        for (int i : arr) {
            if (Arrays.binarySearch(uniqueElements, i) < 0) {
                uniqueElements[numUniqueElements] = i;
                numUniqueElements++;
            }
        }
        return Arrays.copyOf(uniqueElements, numUniqueElements);
    }
}
