import java.util.InputMismatchException;
import java.util.Scanner;

public class Unit12Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean succeeded = false;

        do {
            try {
                System.out.print("\nInput two numbers, the first number will be divided by the second number: ");
                int temp = divide(input.nextInt(), input.nextInt());
                input.close();
                System.out.println("The output is: " + temp);
                succeeded = true;
            } catch (DivideByZeroException e) 
            {
                System.err.printf("%nYou tried to divide by the illegal argument %d, do not divide by 0%n%n", e.getDenominator());
            } catch (InputMismatchException e) 
            {
                input.nextLine();
                System.err.println("\nPlease input two integers\n");
            }
        } while (!succeeded);
        
    }

    public static int divide(int x, int y) throws DivideByZeroException {
        int result = 0;
        try {
            result = x / y;
        }
        catch (ArithmeticException e) {
            throw new DivideByZeroException(y);
        }
        return result;
    }
}
