public class Unit8Activity1ATest {
    public static void main(String[] args) {
        Unit8Activity1A cat1 = new Unit8Activity1A();
        Unit8Activity1A cat2 = new Unit8Activity1A();

        //set and display attributes
        cat1.setAge(3);
        cat1.setBreed("persian");
        cat1.setName("Bouncer");
        cat1.setSex('f');
        cat1.setWeight(30.5);
        System.out.printf("%nCat 1: \tName- %s\tAge- %d\tSex- %c\tBreed- %s\tWeight- %.2f", 
            cat1.getName(), cat1.getAge(), cat1.getSex(), cat1.getBreed(), cat1.getWeight());

        cat2.setAge(5);
        cat2.setBreed("siamese");
        cat2.setName("Pouncer");
        cat2.setSex('m');
        cat2.setWeight(15.8);
        System.out.printf("%nCat 2: \tName- %s\tAge- %d\tSex- %c\tBreed- %s\tWeight- %.2f", 
            cat2.getName(), cat2.getAge(), cat2.getSex(), cat2.getBreed(), cat2.getWeight());

        //change and display attributes
        cat1.setName("NotBouncer");
        cat1.setAge(4);
        System.out.printf("%nCat 1 After Changes: \tName- %s\tAge- %d\tSex- %c\tBreed- %s\tWeight- %.2f", 
            cat1.getName(), cat1.getAge(), cat1.getSex(), cat1.getBreed(), cat1.getWeight());

        cat2.setAge(6);
        cat2.setWeight(18.3);
        System.out.printf("%nCat 2 After Changes: \tName- %s\tAge- %d\tSex- %c\tBreed- %s\tWeight- %.2f", 
            cat2.getName(), cat2.getAge(), cat2.getSex(), cat2.getBreed(), cat2.getWeight());
        System.out.println("\nCat 2 says " + cat2.meow());
    }
}
