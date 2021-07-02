import java.util.Scanner;

public class Unit2Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nInput a monetary amount: $");
        double money = input.nextDouble();

        //calculation
        int dollars = (int) (money / 1);
        double moneyLeft = money % 1;
        
        int quarters = (int) (moneyLeft / 0.25);
        moneyLeft = moneyLeft % 0.25;

        int dimes = (int) (moneyLeft / 0.1);
        moneyLeft = moneyLeft % 0.1;

        int nickels = (int) (moneyLeft / 0.05);
        moneyLeft = moneyLeft % 0.05;

        int pennies = (int) (moneyLeft / 0.01);

        //display
        System.out.printf("%n$%.2f consists of %d dollars, %d quarters, %d dimes, %d nickels, and %d pennies", 
            money, dollars, quarters, dimes, nickels, pennies);
    }
}
