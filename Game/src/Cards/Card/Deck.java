package Cards.Card;

import java.util.*;

public class Deck<card> {

    private ArrayDeque<card> deck;

    public Deck() {
        deck = new ArrayDeque<>() {
        };
    }

    public void addCard(card o) {
        deck.addFirst(o);
    }

    public card draw() {
        return deck.removeLast();
    }
}
