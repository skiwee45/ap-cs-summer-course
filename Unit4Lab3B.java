import java.util.Scanner;

public class Unit4Lab3B {
    public static void main(String[] args) {
        //input
        Scanner input = new Scanner(System.in);
        
        //setup
        System.out.print("\nInput number: ");
        int number = input.nextInt();
        int smallest = number;
        int largest = number;
        for (int counter = 1; counter < 10; counter++) {
            System.out.print("Input number: ");
            number = input.nextInt();
            if (number < smallest) {
                smallest = number;
            } else if (number > largest) {
                largest = number;
            }
        }
        input.close();
        System.out.printf("%nThe largest number was %d, the smallest number was %d", largest, smallest);
    }
}
