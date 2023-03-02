package cat.udl.hyperion.appmobils.thegame.Models.Player;

import cat.udl.hyperion.appmobils.thegame.Models.Deck;

/**
 * Esta clase representa un jugador humano.
 * */
public class HumanPlayer extends Player {
    String name;

    public HumanPlayer(String name, Deck deck) {
        super(name, deck);
    }
}
