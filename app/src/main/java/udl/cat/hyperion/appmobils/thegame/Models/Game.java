package udl.cat.hyperion.appmobils.thegame.Models;


import udl.cat.hyperion.appmobils.thegame.Models.Player.Player;


/**
 * Esta clase representa el juego.
 * */
public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private boolean player1Turn;
    private boolean endGame;

    /**
     * Este método se llama para inicializar el juego. Se encarga de inicializar el tablero y las cartas de los jugadores y establece el primer turno.
     * */
    public void initializeGame(){
        //TODO
    }


    /**
     * Este método se llama cuando acaba el turno de un jugador y se cambia al siguiente.
     * Se encarga de actualizar el turno, de capturar las cartas que correspondan y de verificar si el juego ha terminado.
     * */
    public void nextTurn(){
        //TODO
    }


    /**
     * Este método se llama cuando el jugador selecciona una carta. Se encarga de verificar si la carta es jugable en ese turno y de actualizar los atributos correspondientes.
     * */
    public void selectCard(Card card){
        //TODO
    }

    /**
     * Este método se llama cuando el jugador coloca una carta sobre el tablero. Se encarga de colocar la carta en el tablero, de actualizar los atributos
     * correspondientes y cambiar al siguiente turno.
     * */
    public void playCard(Card card){
        //TODO
    }

    /**
     * Este método se llama cuando un jugador ha capturado una o más cartas del oponente. Se encarga de actualizar los atributos correspondientes y
     * de cambiar al siguiente turno.
     * */
    public void captureCards(){
        //TODO
    }


    /**
     * Este método se llama cuando se finaliza el juego. Se calcula las puntuaciones de cada jugador y determina el ganador.
     * */
    public void calculatePuntuation(){
        //TODO
    }


    /**
     * Este método se llama cuando se desea reiniciar el juego. Se encarga de volver a iniciar todos los atributos y objetos del juego.
     * */
    public void restartGame(){
        //TODO
    }
}
