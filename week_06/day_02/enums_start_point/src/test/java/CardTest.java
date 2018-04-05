 import org.junit.*;

import static junit.framework.TestCase.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(Suit.HEARTS, Rank.ACE);
    }

    @Test
    public void canGetSuit(){
        assertEquals(Suit.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank() {
        assertEquals(Rank.ACE, card.getRank());
    }

    @Test
    public void aceHasValue11() {
        assertEquals(11, card.getValueFromEnum());
    }

//    @Test
//    public void suitCanBeMispelled() {
//    new Card("Heeaarts");
//    assertEquals("Heeaarts", card.getSuit());
//    }
}