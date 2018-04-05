import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestDeck {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void deckIsComplete() {
        assertEquals(52,deck.deckSize());
    }

    @Test
    public void canGetRandomCard() {
        Deck deck_copy = deck;
        Card randomCard = deck.getRandomCard();
        System.out.println(randomCard.cardInfo());
        assertTrue(deck_copy.all_cards().contains(randomCard));
    }

    @Test
    public void canGetDealtCards() {
        ArrayList<Card> card_array = deck.getDealtCards(52);
        int size = card_array.size();

        for (int i = 0; i < size; i++){
            System.out.println(card_array.get(i).cardInfo());
        }
        assertEquals(52, size);
    }

} // end class TestDeck
