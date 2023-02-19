package udl.cat.hyperion.appmobils.thegame.Models;

//import android.sax.Element;


import org.w3c.dom.Element;

/**
 * La clase Carta representaría una carta del juego, con sus atributos y métodos y valores numéricos de elemento.
 * */
public class Card {

    private int up;
    private int down;
    private int left;
    private int right;
    private Element element;
    private int value;

    private int positionRow;
    private int positionColumn;

    private boolean selected;

    /**
     * Método constructor de una carta.
     * */
    public Card(){
        //TODO
    }
    /**
     * Este método se llama cuando la carta es capturada por el jugador enemigo.
     * */
    public void capture(){
        //TODO
    }

    /**
     * Este método se llama cuando el jugador selecciona la carta.
     * */
    public void select(){
        //TODO
    }
}
