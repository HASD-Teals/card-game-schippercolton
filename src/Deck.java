import java.util.*;

public class Deck {
    // PROPERTIES
    private Card[] cards;

    // CONSTRUCTORS
    public Deck() {
        int counter = 0;
        boolean colar = false;
        this.cards = new Card[52];
        for (int j = 1; j <= 4; j++) {
            if (j <= 2) {
                colar = true;
            } else {
                colar = false;
            }
            for (int i = 1; i <= 13; i++) {
                Card temp = new Card(colar, i, j);
                cards[counter] = temp;
                counter++;
            }
        }

    }

    // ACCESSORS
    public Card[] getCards() {
        return this.cards;
    }

    // MUTATORS
    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    // METHODS
    public void shuffleCards() {
        List<Card> shuff = Arrays.asList(this.cards);
        Collections.shuffle(shuff);
        shuff.toArray(this.cards);
    }

    public String toString() {
        String temp = "";
        for (Card c : this.cards) {
            temp += c.toString();
        }
        return temp;
    }
}
