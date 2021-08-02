public class Unit11Lab1Car {
    private String make, model;
    private int year;
    public Unit11Lab1Car (String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", getMake(), getMake(), getYear());
    }
}
