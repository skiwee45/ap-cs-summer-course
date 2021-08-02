import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Unit11Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Unit11Lab1Car> cars = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            System.out.print("Input make, model, year for car " + i + ": ");
            cars.add(new Unit11Lab1Car(input.next(), input.next(), input.nextInt()));
        }
        input.close();

        List<Unit11Lab1Car> oldCars = new ArrayList<>();
        List<Unit11Lab1Car> newCars = new ArrayList<>();
        for (Unit11Lab1Car car : cars) {
            if (car.getYear() < 2010) {
                oldCars.add(car);
            } else {
                newCars.add(car);
            }
        }

        System.out.println("\n\nCars: "  + cars + "\nOld Cars: " + oldCars + "\nNew Cars: " + newCars);
    }
}
