import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Unit11Lab3 {
    public static void main(String[] args) {
        List<Unit10Lab4Pet> pets = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String quitString = "quit";
        System.out.print("Input dog or cat, a name, a number for weight, and an integer for age: ");
        String userInput = input.nextLine();
        while (!userInput.equals(quitString)) {
            String[] temp = userInput.split(" ");
            Unit10Lab4Pet newPet;
            if (temp[0].equals("cat"))
                newPet = new Unit10Lab4Cat(temp[1], Double.parseDouble(temp[2]), Integer.parseInt(temp[3]));
            else if (temp[0].equals("dog"))
                newPet = new Unit10Lab4Dog(temp[1], Double.parseDouble(temp[2]), Integer.parseInt(temp[3]));
            else {
                System.out.print("Please input dog or cat, a name, a number for weight, and an integer for age: ");
                userInput = input.nextLine();
                continue;
            }
            pets.add(newPet);
            System.out.print("Input dog or cat, a name, a number for weight, and an integer for age: ");
            userInput = input.nextLine();
        }
        input.close();
        System.out.printf("List of pets: " + pets + "\nAverage age: %.1f", calculateAverage(pets));
    }

    public static double calculateAverage(List<Unit10Lab4Pet> list) {
        int total = 0;
        for (Unit10Lab4Pet pet : list) {
            total += pet.getAge();
        }
        return total / (double) list.size();
    }
}
