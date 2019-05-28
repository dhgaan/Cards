package Cards.Test;

import Cards.Card.*;
import org.junit.Test;

public class DeckTest {

    @Test
    public void deckTest() {
        Deck deck1 = new Deck();
        deck1.addCard(new Monster(200, 1000, "Gerald", 2, "Warrior", "Wind", false));
        Monster card1 = deck1.draw();
    }

    public static void main(String[] args) {
        jh61b.junit.textui.runClasses(DeckTest.class);
    }
}
