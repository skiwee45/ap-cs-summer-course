import java.util.ArrayList;

public class Unit12Lab2ExceptionThrown {
    public static void demonstrateNullPointerException() throws NullPointerException {
        ArrayList list = null;
        list.isEmpty();
    }

    public static void demonstrateArrayIndexOutOfBoundsException() throws ArrayIndexOutOfBoundsException {
        int[] arr = new int[5];
        arr[arr.length] = 10;
    }

    public static void demonstrateClassCastException() throws ClassCastException {
       double d = 5.55;
       Object obj = d;
       String str = (String) obj;
    }

    public static void demonstrateIllegalArgumentException() { 
        Character.toChars(-1);
    }
}
