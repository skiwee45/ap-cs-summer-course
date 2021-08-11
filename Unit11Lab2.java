import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Unit11Lab2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 1, 2, 2, 3, 4, 5, 5, 5));
        System.out.println("Untouched list: " + list);
        removeDuplicates(list);
        System.out.println("Modified list: " + list);
    }

    public static void removeDuplicates(ArrayList<Integer> list)
    {
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(hashSet);
    }
}
