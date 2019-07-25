import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {

    private Card card1;

    @Before
    public void before() {
        card1 = new Card(SuitType.SPADES, RankType.ACE);
    }

    @Test
    public void cardHasSuit() {
        assertEquals(SuitType.SPADES, card1.getSuit());
    }

    @Test
    public void cardHasRank() {
        assertEquals(RankType.ACE, card1.getRank());
    }


}
