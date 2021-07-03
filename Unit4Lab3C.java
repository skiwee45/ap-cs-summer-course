import java.util.Scanner;

public class Unit4Lab3C {
    public static void main(String[] args) {
        //input
        Scanner input = new Scanner(System.in);
        
        //setup
        System.out.println("");
        int counter = 0;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        do {
            System.out.print("Input number: ");
            int number = input.nextInt();
            if (number < smallest) {
                smallest = number;
            } else if (number > largest) {
                largest = number;
            }
            counter++;
        } while (counter < 10);
        input.close();
        System.out.printf("%nThe largest number was %d, the smallest number was %d", largest, smallest);
    }
}
