import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    private Player player1;
    private Card card1;

    @Before
    public void before() {
        player1 = new Player("Dave");
        card1 = new Card (SuitType.SPADES, RankType.ACE);
    }

    @Test
    public void playerHasNoCardsInitially() {
        assertEquals(0, player1.cardCount());
    }

    @Test
    public void playerCanAddCard() {
        player1.addCard(card1);
        assertEquals(1, player1.cardCount());
    }


}
