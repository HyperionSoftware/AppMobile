package cat.udl.hyperion.appmobils.thegame.Models.Player;

import java.util.ArrayList;

import cat.udl.hyperion.appmobils.thegame.Models.Card;
import cat.udl.hyperion.appmobils.thegame.Models.Deck;

/**
 * La clase jugador representa el jugador del juego, con sus cartas, puntos y jugadas.
 * */
public class Player{
    private String name;
    private Deck deck;
    private int score;

    public Player(String name, Deck deck) {
        this.name = name;
        this.deck = deck;
        this.score = 0;
    }

    public Deck getDeck() {
        return this.deck;
    }

    public int getScore() {
        return this.score;
    }

    public void incrementScore() {
        this.score++;
    }

    public void playCard() {
    }
}

