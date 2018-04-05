import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestCard {
    // Initalising Variables
    Card a_card;

    @Before
    public void before() {
        a_card = new Card(Suit.CLUBS, Rank.ACE);
    }

    @Test
    public void cardHasSuit() {
        assertEquals(Suit.CLUBS,a_card.getSuit());
        //System.out.println("a suit string?: " + a_card.getSuit());
    }

    @Test
    public void cardHasRank() {
        assertEquals(Rank.ACE,a_card.getRank());
    }

    @Test
    public void cardRankHasValue() {
        assertEquals(14,a_card.getValue());
    }

} // end class TestCard
