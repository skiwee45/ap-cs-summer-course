import java.util.Arrays;

public class Unit15Lab2 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3, -10};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Sorted Array: " + Arrays.toString(bubbleSort(arr)));
    }

    //input is any integer array
    //outputs integer array sorted smallest to largest
    public static int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
