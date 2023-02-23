package cat.udl.hyperion.appmobils.thegame.Models;

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
    public Card(int up, int down, int left, int right, int value, int positionRow, int positionColumn){
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
        this.value = value;
        this.positionRow = positionRow;
        this.positionColumn = positionColumn;
        this.selected = false; //TODO: ¿? Is that thing correct?
    }
    /**
     * Este método se llama cuando la carta es capturada por el jugador enemigo.
     * */
    public void capture(){
        // Set the selected status of the card to false
        selected = false;

        // Set the position of the card to (-1, -1) to indicate that it's no longer on the board
        positionRow = -1;
        positionColumn = -1;

        // TODO: Update the card pool to reflect that the card is no longer available
        // TODO: Subtract the value of the card from the enemy player's score
        // TODO: Add the value of the card to the capturing player's score
    }


    /**
     * Este método se llama cuando el jugador selecciona la carta.
     * */
    public void select(){
        // Set the selected status of the card to true
        selected = true;
        // TODO: Add code to handle the selection of the card by the player
    }

    // Getters and setters
    //TODO: See if all of them are necessary during the coding.
    public int getUp() {
        return up;
    }

    public void setUp(int up) {
        this.up = up;
    }

    public int getDown() {
        return down;
    }

    public void setDown(int down) {
        this.down = down;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getPositionRow() {
        return positionRow;
    }

    public void setPositionRow(int positionRow) {
        this.positionRow = positionRow;
    }

    public int getPositionColumn() {
        return positionColumn;
    }

    public void setPositionColumn(int positionColumn) {
        this.positionColumn = positionColumn;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
