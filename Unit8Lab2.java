public class Unit8Lab2 {
    private int secondsSinceMidnight = 0;

    private static final int HOUR_TO_SECOND = 3600;
    private static final int MINUTE_TO_SECOND = 60;

    // Time2 no-argument constructor:
    // initializes each instance variable to zero
    public Unit8Lab2() {
        this(0, 0, 0); // invoke constructor with three arguments
    }

    // Time2 constructor: hour supplied, minute and second defaulted to 0
    public Unit8Lab2(int hour) {
        this(hour, 0, 0); // invoke constructor with three arguments
    }

    // Time2 constructor: hour and minute supplied, second defaulted to 0
    public Unit8Lab2(int hour, int minute) {
        this(hour, minute, 0); // invoke constructor with three arguments
    }

    // Time2 constructor: hour, minute and second supplied
    public Unit8Lab2(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    // Time2 constructor: another Time2 object supplied
    public Unit8Lab2(Unit8Lab2 time) {
        // invoke constructor with three arguments
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    // Set Methods
    // set a new time value using universal time
    // validate the data
    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    // validate and set hour
    public void setHour(int hour) {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        
        int currentHour = secondsSinceMidnight / HOUR_TO_SECOND;
        int difference = currentHour - hour;
        secondsSinceMidnight -= difference * HOUR_TO_SECOND;
    }

    // validate and set minute
    public void setMinute(int minute) {
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");

        int currentMinute = (secondsSinceMidnight % HOUR_TO_SECOND) / MINUTE_TO_SECOND;
        int difference = currentMinute - minute;
        secondsSinceMidnight -= difference * MINUTE_TO_SECOND;
    }

    // validate and set second
    public void setSecond(int second) {
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");

        int currentSecond = secondsSinceMidnight % MINUTE_TO_SECOND;
        int difference = currentSecond - second;
        secondsSinceMidnight -= difference;
    }

    // Get Methods
    // get hour value
    public int getHour() {
        return secondsSinceMidnight / HOUR_TO_SECOND;
    }

    // get minute value
    public int getMinute() {
        return (secondsSinceMidnight % HOUR_TO_SECOND) / MINUTE_TO_SECOND;
    }

    // get second value
    public int getSecond() {
        return secondsSinceMidnight % MINUTE_TO_SECOND;
    }

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}
