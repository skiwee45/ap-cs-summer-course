import java.util.Arrays;

public class Unit6Lab2Test {
    public static void main(String[] args) {
        //create test sets
        char[] charTestSet = new char[5];
        for (int i = 0; i < 5; i++) {
            charTestSet[i] = (char) Unit5Activity1B.generateRandomNum(0, 1000);
        }

        int[] intTestSet = new int[5];
        for (int i = 0; i < 5; i++) {
            intTestSet[i] = Unit5Activity1B.generateRandomNum(-1000, 1000);
        }

        double[] doubleTestSet = new double[5];
        for (int i = 0; i < 5; i++) {
            doubleTestSet[i] = Math.random() * Unit5Activity1B.generateRandomNum(-1000, 1000);
        }

        System.out.printf("%nChar array: " + Arrays.toString(charTestSet) + "\tMin: %c at %d\tMax: %c at %d", 
            Unit6Lab2ArrayTools.minimum(charTestSet), Unit6Lab2ArrayTools.minimumAt(charTestSet), 
            Unit6Lab2ArrayTools.maximum(charTestSet), Unit6Lab2ArrayTools.maximumAt(charTestSet));

        System.out.printf("%nInt array: " + Arrays.toString(intTestSet) + "\tMin: %d at %d\tMax: %d at %d\tAverage: %f", 
            Unit6Lab2ArrayTools.minimum(intTestSet), Unit6Lab2ArrayTools.minimumAt(intTestSet), 
            Unit6Lab2ArrayTools.maximum(intTestSet), Unit6Lab2ArrayTools.maximumAt(intTestSet), 
            Unit6Lab2ArrayTools.average(intTestSet));

        System.out.printf("%nDouble array: " + Arrays.toString(doubleTestSet) + "\tMin: %f at %d\tMax: %f at %d\tAverage: %f", 
            Unit6Lab2ArrayTools.minimum(doubleTestSet), Unit6Lab2ArrayTools.minimumAt(doubleTestSet), 
            Unit6Lab2ArrayTools.maximum(doubleTestSet), Unit6Lab2ArrayTools.maximumAt(doubleTestSet), 
            Unit6Lab2ArrayTools.average(doubleTestSet));
    }
}
