public class Unit9Lab2Test {
    public static void main(String[] args) {
        Unit9Lab2Deck deck = new Unit9Lab2Deck();
        System.out.println("Unshuffled deck: \n" + deck);

        deck.shuffle();
        System.out.println("\n\nShuffled deck: \n" + deck);
    }
}
