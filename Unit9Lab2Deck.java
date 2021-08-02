import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Unit9Lab2Deck {
    private Unit9Lab2Card[] cards = new Unit9Lab2Card[52];
    private HashMap<Integer, Unit9Lab2Suit> suitAndNumber = new HashMap<>();

    public Unit9Lab2Deck() {
        suitAndNumber.put(0, Unit9Lab2Suit.CLUBS);
        suitAndNumber.put(1, Unit9Lab2Suit.DIAMONDS);
        suitAndNumber.put(2, Unit9Lab2Suit.HEARTS);
        suitAndNumber.put(3, Unit9Lab2Suit.SPADES);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cards[(i * 13) + j] = new Unit9Lab2Card(suitAndNumber.get(i), j + 1);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(Arrays.asList(cards));
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (Unit9Lab2Card card : cards) {
            output.append(card + "\t");
        }
        return output.toString();
    }
}
