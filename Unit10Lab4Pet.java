public class Unit10Lab4Pet {
    private String name;
    private double weight;
    private int age;

    public Unit10Lab4Pet (String name, double weight, int age) {
        setName(name);
        setWeight(weight);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }
    public int getAge() {
        return age;
    }

    public void makeNoises() {
    }

    @Override
    public String toString() {
        return String.format("%s %s %d years old %.1flbs", getClass().getName(), getName(), getAge(), getWeight());
    }
}
