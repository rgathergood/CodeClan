import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    // Constructor Method
    public Deck() {
        cards = new ArrayList<>();

        for (Suit eachSuit : Suit.values()) {
            for (Rank eachRank : Rank.values()) {
                Card new_card = new Card(eachSuit, eachRank);
                cards.add(new_card);
            }
        }

    } // end constructor Deck

    public int deckSize() {
        return cards.size();
    }

    public ArrayList<Card> all_cards() {
        return cards;
    }

    public Card getRandomCard() {
        Collections.shuffle(this.cards);
        return cards.get(0);
    }

    public ArrayList<Card> getDealtCards(int numberOfCards) {
        ArrayList<Card> dealtCards = new ArrayList<>();

        Collections.shuffle(this.cards);

        for (int i = 0 ; i < (numberOfCards); i++) {
            dealtCards.add(cards.get(i));
        }

        return dealtCards;
    }


} // end class Deck
