public class Unit9Lab2Card {
    private Unit9Lab2Suit suit;
    private int faceValue;

    public static final String[] faceCards = {"Jack", "Queen", "King"};

    public Unit9Lab2Card(Unit9Lab2Suit suit, int faceValue) {
        if (faceValue < 1 || faceValue > 13) {
            throw new IllegalArgumentException("Face value must be between 1 and 13\n\n");
        }

        this.suit = suit;
        this.faceValue = faceValue;
    }

    public Unit9Lab2Suit getSuit() {
        return suit;
    }
    public int getFaceValue() {
        return faceValue;
    }

    @Override
    public String toString() {
        String faceValueStr = getFaceValue() <= 10 ? Integer.toString(getFaceValue()) : faceCards[getFaceValue() - 11];
        return String.format("%s of %s", faceValueStr, suit);
    }
}


