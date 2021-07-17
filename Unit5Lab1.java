import java.util.Scanner;

public class Unit5Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input type of calculation wanted (Future Sum, Present Value, Future Annuity): ");
        String userChoice = input.nextLine();
        double calculation;
        switch (userChoice) {
            case "Future Sum":
                System.out.print("Input principle amount, years, and annual interest rate separated by spaces: ");
                calculation  = calculateFutureSum(input.nextDouble(), input.nextInt(), input.nextDouble());
                break;
            case "Present Value":
                System.out.print("Input target amount, years, and annual interest rate separated by spaces: ");
                calculation = calculatePresentValue(input.nextDouble(), input.nextInt(), input.nextDouble());
                break;
            case "Future Annuity":
                System.out.print("Input monthly deposit, years, and annual interest rate separated by spaces: ");
                calculation = calculateAnnuityValue(input.nextDouble(), input.nextInt(), input.nextDouble());
                break;
            default:
                System.out.print("Please input a valid choice");
                return;
        }
        System.out.println("Calculation: $" + calculation);
    }

    private static double calculateFutureSum(double principle, int years, double annualInterestRate){
        double i = annualInterestRate / 12;
        int n = years * 12;
        double output = principle * Math.pow((i + 1), n);
        return Unit5Activity1D.round(output, 2);
    }

    private static double calculatePresentValue(double sum, int years, double annualInterestRate){
        double i = annualInterestRate / 12;
        int n = years * 12;
        double output = sum / Math.pow((i + 1), n);
        return Unit5Activity1D.round(output, 2);
    }

    private static double calculateAnnuityValue(double monthlyDeposit, int years, double annualInterestRate){
        double i = annualInterestRate / 12;
        int n = years * 12;
        double output = monthlyDeposit * (Math.pow((i + 1), n) - 1) / i;
        return Unit5Activity1D.round(output, 2);
    }
}
