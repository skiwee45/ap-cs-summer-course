public class Unit10Lab4Dog extends Unit10Lab4Pet{

    public Unit10Lab4Dog(String name, double weight, int age) {
        super(name, weight, age);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public void makeNoises() {
        System.out.println("Bow wow");
    }
}