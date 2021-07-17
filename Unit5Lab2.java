import java.util.Scanner;

public class Unit5Lab2 {
    private static final String[] monthNames = { "January", "February", "March", "April", "May", "June", "July",
        "August", "September", "October", "November", "December" };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nInput month (1-12) and year separated by a space: ");
        int month = input.nextInt();
        int year = input.nextInt();
        input.close();

        System.out.println();
        printMonthHeader(month, year);
        printMonthBody(month, year);
    }

    private static void printMonthHeader(int m, int y) {
        System.out.println(centerString(getMonthName(m) + "  " + y, 28));
        System.out.println(repeatString("-", 28));
        System.out.print(" Sun Mon Tue Wed Thu Fri Sat");
    }

    private static void printMonthBody(int m, int y) {
        int emptyGrids = (getStartDay(m, 1, y) + 1) % 7 - 1; //sunday is 0, saturday is 6
        int numGrids = getNumDaysInMonth(m, y) + emptyGrids; //if startDay is sunday no extra grid is needed
        for (int i = 1; i <= numGrids; i++) {
            if (i % 7 == 1){
                System.out.println("");
            }
            String value = "";
            if (i > emptyGrids) {
                value = String.valueOf(i - emptyGrids);
            }
            System.out.printf("%4s", value);
        }

    }

    private static String getMonthName(int m) {
        return monthNames[m - 1];
    }

    /*
     * The method getStartDay() implements Zeller's Algorithm for determining the
     * day of the week the first day of a month is. The method adjusts Zeller's
     * numbering scheme for day of week ( 0=Saturday, ..., 6=Friday ) to conform to
     * a day of week number that corresponds to ISO conventions (i.e., 1=Monday,
     * ..., 7=Sunday)
     * 
     * Pre-Conditions: The month value, m, is 1-12 The day value, d, is 1-31, or
     * 1-28, 1-29 for February The year value, y, is the full year (e.g., 2012)
     * 
     * Post-Conditions: A value of 1-7 is returned, representing the first day of
     * the month 1 = Monday, ..., 7 = Sunday
     */
    public static int getStartDay(int m, int d, int y) {
        // Adjust month number & year to fit Zeller's numbering system
        if (m < 3) {
            m = m + 12;
            y = y - 1;
        }

        int k = y % 100; // Calculate year within century
        int j = y / 100; // Calculate century term
        int h = 0; // Day number of first day in month 'm'

        h = (d + (13 * (m + 1) / 5) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        // Convert Zeller's value to ISO value (1 = Mon, ... , 7 = Sun )
        int dayNum = ((h + 5) % 7) + 1;

        return dayNum;
    }

    private static int getNumDaysInMonth(int m, int y) {
        int leapYear = isLeapYear(y) ? 1 : 0;
        return (m == 2) ? (28 + leapYear) : 31 - (m - 1) % 7 % 2;
    }

    private static boolean isLeapYear(int y) {
        return y % 4 == 0 && (y % 100 != 0 || y % 400 == 0);
    }

    /**
     * adapted from https://www.leveluplunch.com/java/examples/center-justify-string/
     * @param width
     * @param s
     * @return centered string
     */
    public static String centerString (String s, int width) {
        String str = String.format("%" + (s.length() + (width - s.length()) / 2) + "s", s); //back padding to string
        return String.format("%-" + width  + "s", str); //add front padding
    }

    public static String repeatString (String value, int amount){
        String output = "";
        for (int i = 0; i < amount; i++) {
            output += value;
        }
        return output;
    }
}
