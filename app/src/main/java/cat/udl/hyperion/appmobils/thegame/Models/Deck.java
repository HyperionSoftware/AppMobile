package cat.udl.hyperion.appmobils.thegame.Models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Esta clase representa las cartas que quedan para poder escoger.
 * */
import java.util.ArrayList;
import java.util.Collections;

public class Deck{
    private ArrayList<Card> cards;

    /**
     * Constructor for the Deck class that initializes the card pool.
     */
    public Deck() {
        cards = new ArrayList<>();
    }

    /**
     * This method shuffles the cards in the deck.
     */
    public void shuffle(){
        Collections.shuffle(cards);
    }

    /**
     * This method removes a card from the deck.
     * @param card The card to be removed.
     */
    public void remove(Card card){
        cards.remove(card);
    }

    public Card getCard(){
        shuffle();
        Card card = cards.get(0);
        remove(card);
        return card;
    }


}


