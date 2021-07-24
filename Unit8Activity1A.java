public class Unit8Activity1A {
    private String breed;
    private int age;
    private double weight;
    private char sex;
    private String name;

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age must be a positive number\n\n");
        }
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        if (weight < 0) {
            throw new IllegalArgumentException("Weight must be a positive number\n\n");
        }
        this.weight = weight;
    }

    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        if (sex != 'm' && sex != 'f') {
            throw new IllegalArgumentException("Sex must be m for male or f for femalen\n\n");
        }
        this.sex = sex;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String eat() {
        return "Munch, Munch, Munch";
    }

    public String meow() {
        return "Meeeeooowww";
    }
}
