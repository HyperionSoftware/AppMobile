package cat.udl.hyperion.appmobils.thegame.Models;


import cat.udl.hyperion.appmobils.thegame.Models.Player.Player;


/**
 * Esta clase representa el juego.
 * */
public class Game {
    private Player player1;
    private Player player2;
    private Board board;
    private Player currentPlayer;
    private Player winner;
    private boolean isGameOver;

    /**
     * Constructor for the Game class that initializes the players and board.
     * Player 1 always starts the game.
     */
    public Game(Player player1, Player player2, Board board) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = board;
        this.currentPlayer = player1;
        this.winner = null;
        this.isGameOver = false;
    }

    /**
     * This method starts the game.
     */
    public void startGame() {
        board.initializeBoard(player1.getDeck(), player2.getDeck());
    }

    /**
     * This method selects the card at the specified position on the board.
     * @param x The x-coordinate of the card.
     * @param y The y-coordinate of the card.
     */
    public void selectCard(int x, int y) {
        board.selectCard(x, y, currentPlayer);
    }

    /**
     * This method places the selected card at the specified position on the board.
     * @param x The x-coordinate of the position.
     * @param y The y-coordinate of the position.
     * @return True if the card was placed successfully, false otherwise.
     */
    public boolean placeCard(int x, int y) {
        boolean success = board.placeCard(x, y, currentPlayer.getDeck().getCard());
        if (success) {
            currentPlayer.playCard();
            endTurn();
        }
        return success;
    }

    /**
     * This method ends the current player's turn and switches to the other player.
     */
    public void endTurn() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    /**
     * This method checks if the game is over and sets the winner accordingly.
     * @return True if the game is over, false otherwise.
     */
    public boolean isGameOver() {
        if (board.isBoardFull()) {
            isGameOver = true;
            int score1 = board.getScore(player1);
            int score2 = board.getScore(player2);
            if (score1 > score2) {
                winner = player1;
            } else if (score2 > score1) {
                winner = player2;
            }
        }
        return isGameOver;
    }

}
