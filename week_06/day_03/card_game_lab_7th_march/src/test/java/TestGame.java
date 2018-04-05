import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestGame {
    private Game game3players2cards;


    @Before
    public void before() {
        game3players2cards = new Game(3,2);

    }

    @Test
    public void cardsGetPicked() {
        int numCardsDealt = game3players2cards.dealhands().size();
        assertEquals(6,numCardsDealt);
    }

    @Test
    public void playersGetCards() {
        game3players2cards.dealhands();
        System.out.println(game3players2cards.dealtHandInfo());
    }

    @Test
    public void winnerIsTheWinner() {
        game3players2cards.dealhands();
        System.out.println("Winner is " + game3players2cards.getWinner().getName() + " with handvalue: " + game3players2cards.getWinner().getHandValue());
        System.out.println("From this hand: " + game3players2cards.getWinner().getHandInfo());

        System.out.println("");
        System.out.println("All cards dealt were: " + game3players2cards.dealtHandInfo());

        game3players2cards.resetHands();

    }

    @Test
    public void winnerGivesANYTHING() {
        game3players2cards.dealtHandInfo();
        System.out.println(game3players2cards.getWinner());
        game3players2cards.resetHands();
    }
} // end class TestGame
