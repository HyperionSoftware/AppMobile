package cat.udl.hyperion.appmobils.thegame.Models;


import java.util.ArrayList;

import cat.udl.hyperion.appmobils.thegame.Models.Player.Player;

/**
 * La clase tablero representa el tablero del juego, con sus cartas y posiciones en el mismo.
 * @author joanbonellruiz
 * @author carlosmg
 * @author claudiasarlle
 * @author ricardbp
 * */
public class Board{
    private Card[][] cards;
    private Card selectedCard;
    private int[] selectedPosition;

    /**
     * Constructor for the Board class that initializes the board with empty cards.
     */
    public Board() {
        cards = new Card[3][3];
        selectedCard = null;
        selectedPosition = null;
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards[i].length; j++) {
                cards[i][j] = new Card(0, 0, 0, 0, Element.FIRE, 0, i, j);
            }
        }
    }

    /**
     * This method gets the cards on the board.
     * @return The cards on the board.
     */
    public Card[][] getCards() {
        return cards;
    }

    /**
     * This method sets a card on the board.
     * @param row The row of the card to be set.
     * @param column The column of the card to be set.
     * @param card The card to be set.
     */
    public void setCard(int row, int column, Card card) {
        cards[row][column] = card;
    }

    /**
     * This method gets a card from the board.
     * @param row The row of the card to be retrieved.
     * @param column The column of the card to be retrieved.
     * @return The card at the specified row and column.
     */
    public Card getCard(int row, int column) {
        return cards[row][column];
    }

    /**
     * This method selects a card on the board.
     * @param row The row of the card to be selected.
     * @param column The column of the card to be selected.
     */
    public void selectCard(int row, int column) {
        selectedCard = cards[row][column];
        selectedPosition = new int[] {row, column};
    }

    /**
     * This method places a card on the board.
     * @param row The row where the card should be placed.
     * @param column The column where the card should be placed.
     * @param card The card to be placed.
     * @return True if the card was successfully placed, false otherwise.
     */
    public boolean placeCard(int row, int column, Card card) {
        if (cards[row][column].getValue() == 0) {
            cards[row][column] = card;
            return true;
        }
        return false;
    }

    /**
     * This method gets the currently selected card on the board.
     * @return The selected card.
     */
    public Card getSelectedCard() {
        return selectedCard;
    }

    /**
     * This method gets the position of the currently selected card on the board.
     * @return The position of the selected card.
     */
    public int[] getSelectedPosition() {
        return selectedPosition;
    }

    /**
     * This method clears the currently selected card on the board.
     */
    public void clearSelectedCard() {
        selectedCard = null;
        selectedPosition = null;
    }

    public int getScore(Player player1) {
        return player1.getScore();
    }

    public void initializeBoard() {
        cards = new Card[3][3];
        selectedCard = null;
        selectedPosition = null;
        for (int i = 0; i < cards.length; i++) {
            for (int j = 0; j < cards[i].length; j++) {
                cards[i][j] = new Card(0, 0, 0, 0, Element.FIRE, 0, i, j);
            }
        }
    }


    public boolean isBoardFull() {

        //TODO: Comprovar si el board està ple de cartes.
        return false;
    }
}
