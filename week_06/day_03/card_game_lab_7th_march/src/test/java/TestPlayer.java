import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPlayer {

    private Player player1;
    private Player player2;
    private Card a_card1;
    private Card a_card2;
    private Card a_card3;
    private Card a_card4;

    @Before
    public void before() {
        player1 = new Player("Ant");
        player2 = new Player("Dec");
        a_card1 = new Card(Suit.CLUBS, Rank.TWO);
        a_card2 = new Card(Suit.HEARTS, Rank.THREE);
        a_card3 = new Card(Suit.SPADES, Rank.FOUR);
        a_card4 = new Card(Suit.DIAMONDS, Rank.FIVE);
    }

    @Test
    public void playerHasName() {
        assertEquals("Ant",player1.getName());
    }


    @Test
    public void playerHasTwoCards() {
        player1.addCard(a_card1);
        player1.addCard(a_card2);
        player2.addCard(a_card3);
        player2.addCard(a_card4);
        String hand = ("Player Ant has cards: " + a_card1.cardInfo() + ", " + a_card2.cardInfo() + ", ");
        String hand2 = ("Player Dec has cards: " + a_card3.cardInfo() + ", " + a_card4.cardInfo() + ", ");
        assertEquals(hand, player1.getHandInfo());
        assertEquals(hand2, player2.getHandInfo());

//        System.out.println(hand);
    }

    @Test
    public void playerCalcsHandValue() {
        player1.addCard(a_card1);
        player1.addCard(a_card2);
        assertEquals(5,player1.getHandValue());
    }

    @Test
    public void getNumberOfCards() {
        player1.addCard(a_card1);
        player1.addCard(a_card2);
        assertEquals(2,player1.numberOfCards());
        System.out.println(player1.getHandInfo());
    }

} // end class TestPlayer
