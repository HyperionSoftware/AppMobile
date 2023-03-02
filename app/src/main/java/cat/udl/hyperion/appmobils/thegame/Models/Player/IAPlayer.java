package cat.udl.hyperion.appmobils.thegame.Models.Player;


import cat.udl.hyperion.appmobils.thegame.Models.Deck;

/**
 * Esta clase representa un jugador robot.
 * */
public class IAPlayer extends Player {
    int algorytmType;

    public IAPlayer(String name, Deck deck) {
        super(name, deck);
    }
}
