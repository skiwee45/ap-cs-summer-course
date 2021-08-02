public class Unit9Activity1 {
    int month, day, year;

    public Unit9Activity1() {
        this(1, 1, 0);
    }

    public Unit9Activity1(int month, int day, int year) {
        setDate(month, day, year);
    }

    public void setDate(int month, int day, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
        return day;
    }
    public void setDay(int newDay) {
        int daysInMonth = getDaysInMonth(month, year);
        if (newDay < 1 || newDay > daysInMonth) {
            throw new IllegalArgumentException("Day must be between 1 and " + daysInMonth + "\n\n");
        }
        day = newDay;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int newMonth) {
        if (newMonth < 1 || newMonth > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12\n\n");
        }
        month = newMonth;
    }

    public int getYear() {
        return year;
    }
    public void setYear(int newYear) {
        if (newYear < 0) {
            throw new IllegalArgumentException("Year must be larger than 0\n\n");
        }
        year = newYear;
    }

    private static int getDaysInMonth(int m, int y) {
        int leapYear = isLeapYear(y) ? 1 : 0;
        return (m == 2) ? (28 + leapYear) : 31 - (m - 1) % 7 % 2;
    }

    private static boolean isLeapYear(int y) {
        return y % 4 == 0 && (y % 100 != 0 || y % 400 == 0);
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", getMonth(), getDay(), getYear());
    }
}
