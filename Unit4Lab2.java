import java.util.Scanner;

public class Unit4Lab2 {
    public static void main(String[] args) {
        //input
        Scanner input = new Scanner(System.in);
        System.out.print("\nHow many max Asterisks would you like? ");
        final int MAX_ASTERISKS = input.nextInt();
        input.close();

        //loop
        for (int i = MAX_ASTERISKS; i > 0; i--){
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
