import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cardDeck;

    public Deck() {

        this.cardDeck = new ArrayList<Card>();
        populateDeck();
        shuffleDeck();
    }

    public int getCardCount() {
        return cardDeck.size();
    }


    public void addCard(Card card) {
        this.cardDeck.add(card);
    }

    public void populateDeck(){
        SuitType[] suits = SuitType.values();
        RankType[] ranks = RankType.values();
        System.out.println(suits);
        System.out.println(ranks);

        for (SuitType suit : suits) {
            for (RankType rank : ranks) {
                Card newcard = new Card(suit, rank);
                addCard(newcard);
            }
        }
    }

    public void shuffleDeck() {
        Collections.shuffle(cardDeck);
        System.out.println(cardDeck);
    }

    public Card dealCard() {
      Card cardOffTop = cardDeck.remove(0);
      return cardOffTop;
    }
    }

