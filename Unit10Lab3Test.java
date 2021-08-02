public class Unit10Lab3Test {
    public static void main(String[] args) {
        Unit10Lab3Publisher publisher = new Unit10Lab3Publisher(10);
        Unit10Lab3Subscriber sub1 = new Unit10Lab3Subscriber();
        Unit10Lab3Subscriber sub2 = new Unit10Lab3Subscriber();
        Unit10Lab3Subscriber sub3 = new Unit10Lab3Subscriber();
        publisher.register(sub1);
        publisher.register(sub2);
        publisher.register(sub3);
        publisher.notifySubscribers();
    }
}
