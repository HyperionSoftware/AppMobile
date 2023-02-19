package udl.cat.hyperion.appmobils.thegame.Models;


/**
 * La clase tablero representa el tablero del juego, con sus cartas y posiciones en el mismo.
 * @author joanbonellruiz
 * @author carlosmg
 * @author claudiasarlle
 * @author ricardbp
 * */
public class Board {
    private Card[][] board;
    private int numRows;
    private int numColumns;
    private Card selectedCard;

    /**
     * Este método se llama para inicializar el tablero al comienzo del juego.
     * */
    public void initializeBoard(){
        //todo
    }

    /**
     * Este método se llama cuando el jugador coloca una carta en el tablero.
     * @attributes Card, int, int
     * */
    public void placeCard(Card card, int posX, int posY){
        //Todo
    }

    /**
     * Este método se llama cuando el jugador deselecciona la carta actual.
     * */
    public void unselectCard(Card card){
        //TODO
    }

}
