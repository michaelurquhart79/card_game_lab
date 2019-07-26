import java.util.ArrayList;

public class Game {
    private Deck deck;
    private ArrayList<Player> players;

    public Game(Deck deck) {
        this.deck = deck;
        this.players = new ArrayList<Player>();
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void start(int noOfCards) {

        for(int i = 0; i < noOfCards; i ++){
            for (Player player: players) {
                player.addCard(this.deck.dealCard());

            }
        }
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }
}
