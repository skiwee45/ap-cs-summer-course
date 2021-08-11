public class Unit12Lab2ExceptionCatch {
    public static void main(String[] args) {
        try {
            Unit12Lab2ExceptionThrown.demonstrateArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
            System.err.println("Stack Trace: ");
            e.printStackTrace();
        }

        try {
            Unit12Lab2ExceptionThrown.demonstrateClassCastException();
        } catch (ClassCastException e) {
            System.err.println("\n\nDouble cast to Object then cast to String: " + e.getMessage());
            System.err.println("Stack Trace: ");
            e.printStackTrace();
        }

        try {
            Unit12Lab2ExceptionThrown.demonstrateIllegalArgumentException();
        } catch (IllegalArgumentException e) {
            System.err.println("\n\nUnicode called using negative number: " + e.getMessage());
            System.err.println("Stack Trace: ");
            e.printStackTrace();
        }

        try {
            Unit12Lab2ExceptionThrown.demonstrateNullPointerException();
        } catch (NullPointerException e) {
            System.err.println("\n\nAttempted to use an object set to null");
            System.err.println("Stack Trace: ");
            e.printStackTrace();
        }
    }
}
