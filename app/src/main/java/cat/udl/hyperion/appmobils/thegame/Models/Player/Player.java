package cat.udl.hyperion.appmobils.thegame.Models.Player;

import java.util.ArrayList;

import cat.udl.hyperion.appmobils.thegame.Models.Card;

/**
 * La clase jugador representa el jugador del juego, con sus cartas, puntos y jugadas.
 * */
public class Player {
    private int points;
    private ArrayList<Card> cards;
    private boolean isComputer;


    /**
     * Este método se llama cuando el jugador coloca una carta en el tablero.
     * */
    public void playCard(Card card){
        //TODO
    }


    /**
     * Este método se llama cuando el jugador captura una carta de su oponente.
     * */
    public Card captureCard(){
        //TODO
        return new Card();
    }


    /**
     * Este método se llama para calcular la puntuación del jugador.
     * */
    public int calculatePuntuation(){
        //TODO
        return 0;
    }




}
