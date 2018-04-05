import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Game {
    private Deck deck;
    private ArrayList<Player> players;
    private ArrayList<String> names;
    private ArrayList<Card> cardsToDeal;
    private int handSize;
    private int numPlayers;

    public Game(int numPlayers, int hand_size){
        this.handSize = hand_size;
        this.numPlayers = numPlayers;
        this.deck = new Deck();
        this.cardsToDeal = new ArrayList<>();
        this.names = new ArrayList<>();
        this.names.add("Simon");
        this.names.add("Alvin");
        this.names.add("Theodore");
        this.names.add("Dave");

        this.players = new ArrayList<>();

        for (int i = 0; i < this.numPlayers; i++) {
            Player new_player = new Player(this.names.get(i));
            this.players.add(new_player);
        }
    }


    public ArrayList<Card> dealhands() {
        int cards_needed = handSize * numPlayers;
        cardsToDeal = deck.getDealtCards(cards_needed);

        for (int j= 0; j < handSize; j++) {
            for (int i = 0; i < numPlayers; i++) {
                players.get(i).addCard(cardsToDeal.get((j*numPlayers)+i));
            }
        }
        return cardsToDeal;
    }

    public String dealtHandInfo() {
        String info = "";

        for (int i = 0; i < numPlayers; i++) {
            info += "  " + players.get(i).getHandInfo();
        }

        return info;
    }

    public void playRound() {
        // leave till last
    }

    public Player getWinner() {
        HashMap<Player, Integer> handScores = new HashMap<>();
        Player winner = players.get(0);
        Boolean draw = false;

        for (int i = 1; i < numPlayers; i++) {
            if (players.get(i).getHandValue() == winner.getHandValue()) {
                draw = true;
            }
            else if (players.get(i).getHandValue() > winner.getHandValue()) {
                winner = players.get(i);
            }
        }


        if (draw == false) {
            return winner;
        }
        else {
            return null;
        }
    }

    public void resetHands(){
        for (int i = 0; i < numPlayers; i++) {
            players.get(i).returnCards();
        }
    }




} // end class Game
