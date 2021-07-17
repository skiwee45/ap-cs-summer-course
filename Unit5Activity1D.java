import java.util.Scanner;

public class Unit5Activity1D {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter X: ");
        int x = input.nextInt();
        System.out.print("Enter Y: ");
        int y = input.nextInt();
        input.close();
        double num = (double) x / y;
        
        System.out.println("\nInteger: " + round(num, 0));
        System.out.println("1 decimal point: " + round(num, 1));
        System.out.println("2 decimal point: " + round(num, 2));
        System.out.println("3 decimal point: " + round(num, 3));
    }

    public static double round (double value, int decimalPlaces){
        return (double) Math.round(value * Math.pow(10, decimalPlaces)) / Math.pow(10, decimalPlaces);
    }
}
