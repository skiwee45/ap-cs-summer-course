import java.util.HashMap;
import java.util.Random;

public class Unit5Activity1C {
    public static void main(String[] args) {
        //setup hashmap
        int[] arr = {6, 10, 14, 18, 22};
        HashMap<Integer, Integer> randomNumAmounts = new HashMap<Integer, Integer>();
        for (int i : arr) {
            randomNumAmounts.put(i, 0);
        }

        //random generation
        Random rand = new Random(45004500);
        for (int i = 0; i < 100; i++) {
            int randomNum = rand.nextInt(5);
            int num = arr[randomNum];
            randomNumAmounts.put(num, randomNumAmounts.get(num) + 1);
        }

        //display
        for (int i : arr) {
            System.out.println(i + ": " + randomNumAmounts.get(i));
        }
    }
}
