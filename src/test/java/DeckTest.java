import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;
    Card card1;

    @Before
    public void before(){
        deck = new Deck();
        card1 = new Card(SuitType.HEARTS, RankType.ACE);
    }
    @Test
    public void startsAtZero(){
        assertEquals(0, deck.getCardCount());
    }

    @Test
    public void canAddCardToDeck(){
        deck.addCard(card1);
        assertEquals(1, deck.getCardCount());
    }
    @Test
    public void canPopulateDeck(){
        deck.populateDeck();
        assertEquals(52, deck.getCardCount());
    }
    @Test
    public void canDealCard(){
        deck.populateDeck();
        deck.dealCard();
        assertEquals(51, deck.getCardCount());
    }

}
