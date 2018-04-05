public class Card {
    private Suit suit;
    private Rank rank;

    // Constructor Method
    public Card(Suit a_suit, Rank a_rank) {
        this.suit = a_suit;
        this.rank = a_rank;
    }


    public Suit getSuit() {
        return this.suit;
    }

    public Rank getRank() {
        return this.rank;
    }

    public int getValue() {
        return this.rank.getValue();
    }

    public String cardInfo() {
        String card_string = "";
        card_string = "The " + getRank() + " of " + getSuit();
        return card_string;
    }

} // end class Card
