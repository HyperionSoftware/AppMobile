package cat.udl.hyperion.appmobils.thegame.Models;

//import android.sax.Element;


/**
 * La clase Carta representaría una carta del juego, con sus atributos y métodos y valores numéricos de elemento.
 * */

public class Card {
    private int up;
    private int down;
    private int left;
    private int right;
    private int value;
    private int positionRow;
    private int positionColumn;
    private boolean isSelected;

    /**
     * Constructor for the Card class.
     *
     * @param up             The number on the top side of the card.
     * @param down           The number on the bottom side of the card.
     * @param left           The number on the left side of the card.
     * @param right          The number on the right side of the card.
     * @param fire
     * @param value          The value of the card.
     * @param positionRow    The row position of the card on the game board.
     * @param positionColumn The column position of the card on the game board.
     */
    public Card(int up, int down, int left, int right, Element fire, int value, int positionRow, int positionColumn) {
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
        this.value = value;
        this.positionRow = positionRow;
        this.positionColumn = positionColumn;
        this.isSelected = false;
    }


    /**
     * Returns the value of the card.
     * @return The value of the card.
     */
    public int getValue() {
        return value;
    }

    /**
     * Returns whether or not the card is selected.
     * @return True if the card is selected, false otherwise.
     */
    public boolean isSelected() {
        return isSelected;
    }

    /**
     * Sets whether or not the card is selected.
     * @param isSelected True if the card should be selected, false otherwise.
     */
    public void setSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }

    /**
     * Captures the card.
     */
    public void capture() {
        //TODO
    }

    /**
     * Returns the row position of the card on the game board.
     * @return The row position of the card on the game board.
     */
    public int getPositionRow() {
        return positionRow;
    }

    /**
     * Returns the column position of the card on the game board.
     * @return The column position of the card on the game board.
     */
    public int getPositionColumn() {
        return positionColumn;
    }

    /**
     * Sets the position of the card on the game board.
     * @param positionRow The row position of the card on the game board.
     * @param positionColumn The column position of the card on the game board.
     */
    public void setPosition(int positionRow, int positionColumn) {
        this.positionRow = positionRow;
        this.positionColumn = positionColumn;
    }
}
