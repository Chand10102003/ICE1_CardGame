package card;

public class Card {
    private int value;
    private String suit;

    public static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
