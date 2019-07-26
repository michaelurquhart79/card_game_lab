import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Card> hand;

    public Player(String name) {
        this.hand = new ArrayList<Card>();
        this.name = name;
    }

    public int cardCount() {
        return this.hand.size();
    }

    public void addCard(Card card) {
        this.hand.add(card);
    }

    public String getName() {
        return name;
    }

    public String showCard(int index) {
        String output = this.hand.get(index).getRank() + " of " + this.hand.get(index).getSuit();
        return output;
    }

    public int handTotal() {
        int total = 0;
        for (Card card: this.hand) {
            total += card.getFieldFromEnum();
        }
        return total;
    }
}
