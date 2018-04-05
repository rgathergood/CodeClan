import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;
    private int score;

    public Player(String a_name) {
        this.name = a_name;
        this.hand = new ArrayList<>();
    }


    public String getName() {
        return this.name;
    }

    public int numberOfCards() {
        return hand.size();
    }


    public void addCard(Card a_card) {
        this.hand.add(a_card);
    }



    public int getHandValue() {
        int handValue = 0;
        for ( int i = 0; i < numberOfCards(); i++) {
            handValue += hand.get(i).getValue();
        }
        return handValue;
    }

    public String getHandInfo() {
        String handInfo = "";
        for ( int i = 0; i < numberOfCards(); i++) {
            handInfo = handInfo + hand.get(i).cardInfo() + ", ";
        }
        return ("Player " + this.name + " has cards: " + handInfo);
    }


    public void returnCards() {
        this.hand = new ArrayList<>();
    }



} // end class Player
