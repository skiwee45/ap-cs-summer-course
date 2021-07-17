import java.util.Arrays;

public class Unit6Lab3Test {
    public static void main(String[] args) {
        //test arrays
        char[] charTest1 = {' ', '"', '/'};
        char[] charTest2 = {' ', '"', '/'};
        char[] charTest3 = {' ', '/', '"'};

        int[] intTest1 = {1, 4, 6};
        int[] intTest2 = {1, 4, 6};
        int[] intTest3 = {1, -4, 6};

        double[] doubleTest1 = {-0.11, 0.599, 100.0011};
        double[] doubleTest2 = {-0.11, 0.599, 100.0011};
        double[] doubleTest3 = {-0.11, -0.599, 100.0011};

        //display
        System.out.println("Char sets: " + Arrays.toString(charTest1) + Arrays.toString(charTest2) + Arrays.toString(charTest3));
        System.out.printf("Is set 1 and 2 equal: %b\tIs set 1 and 3 equal: %b\tWhat index is '/' in set 1: %d\t", 
            Unit6Lab3ArrayTools2.equals(charTest1, charTest2), Unit6Lab3ArrayTools2.equals(charTest1, charTest3), 
            Unit6Lab3ArrayTools2.find(charTest1, '/'));
        Unit6Lab3ArrayTools2.sort(charTest3);
        System.out.println("Set 3 sorted: " + Arrays.toString(charTest3));

        System.out.println("\nInt sets: " + Arrays.toString(intTest1) + Arrays.toString(intTest2) + Arrays.toString(intTest3));
        System.out.printf("Is set 1 and 2 equal: %b\tIs set 1 and 3 equal: %b\tWhat index is 1 in set 1: %d\t", 
            Unit6Lab3ArrayTools2.equals(intTest1, intTest2), Unit6Lab3ArrayTools2.equals(intTest1, intTest3), 
            Unit6Lab3ArrayTools2.find(intTest1, 1));
        Unit6Lab3ArrayTools2.sort(intTest3);
        System.out.println("Set 3 sorted: " + Arrays.toString(intTest3));

        System.out.println("\nDouble sets: " + Arrays.toString(doubleTest1) + Arrays.toString(doubleTest2) + Arrays.toString(doubleTest3));
        System.out.printf("Is set 1 and 2 equal: %b\tIs set 1 and 3 equal: %b\tWhat index is 100.0011 in set 1: %d\t", 
            Unit6Lab3ArrayTools2.equals(doubleTest1, doubleTest2), Unit6Lab3ArrayTools2.equals(doubleTest1, doubleTest3), 
            Unit6Lab3ArrayTools2.find(doubleTest1, 100.0011));
        Unit6Lab3ArrayTools2.sort(doubleTest3);
        System.out.println("Set 3 sorted: " + Arrays.toString(doubleTest3));
    }
}
