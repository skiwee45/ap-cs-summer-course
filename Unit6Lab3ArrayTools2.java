import java.util.Arrays;

public class Unit6Lab3ArrayTools2 {
    public static boolean equals(char[] a1, char[] a2) {
        return Arrays.equals(a1, a2);
    }
    public static boolean equals(int[] a1, int[] a2) {
        return Arrays.equals(a1, a2);
    }
    public static boolean equals(double[] a1, double[] a2) {
        return Arrays.equals(a1, a2);
    }

    //the find methods sorts and then use binary search on the array
    public static int find(char[] array, char key) {
        Arrays.sort(array);
        return Arrays.binarySearch(array, key);
    }
    public static int find(int[] array, int key) {
        Arrays.sort(array);
        return Arrays.binarySearch(array, key);
    }
    public static int find(double[] array, double key) {
        Arrays.sort(array);
        return Arrays.binarySearch(array, key);
    }

    public static void sort(char[] array) {
        Arrays.sort(array);
    }
    public static void sort(int[] array) {
        Arrays.sort(array);
    }
    public static void sort(double[] array) {
        Arrays.sort(array);
    }
}
