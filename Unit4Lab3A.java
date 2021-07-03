import java.util.Scanner;

public class Unit4Lab3A {
    public static void main(String[] args) {
        //input
        Scanner input = new Scanner(System.in);
        
        //setup
        int counter = 1;
        System.out.print("\nInput number: ");
        int number = input.nextInt();
        int smallest = number;
        int largest = number;
        while (counter < 10) {
            System.out.print("Input number: ");
            number = input.nextInt();
            if (number < smallest) {
                smallest = number;
            } else if (number > largest) {
                largest = number;
            }
            counter++;
        }
        input.close();
        System.out.printf("%nThe largest number was %d, the smallest number was %d", largest, smallest);
    }
}
