public class Unit8Lab2Test {
    public static void main(String[] args) {
        Unit8Lab2 time = new Unit8Lab2(15, 2, 55);
        displayTime("Unit8Lab2(15, 2, 55)- tests all set methods through its constructor and all get methods by printing it", time);
        try {
            time.setTime(50, -1, 59);
        } catch (Exception e) {
            System.out.print("\ntime.setTime(50, -1, 59)- tests error checking\n" + e.getMessage());
        }
    }

    // displays a Time2 object in 24-hour and 12-hour formats
    private static void displayTime(String header, Unit8Lab2 t) {
        System.out.printf("%s%n  %s%n  %s%n", header, t.toUniversalString(), t.toString());
    }
}
