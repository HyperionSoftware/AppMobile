## Define android version

La versión escogida ha sido “Oreo 8.0 API LEVEL 26” porque es la versión más nueva de Android que tiene la condición impuesta por la asignatura del mínimo de 90% de dispositivos compatibles.
Esta versión nos añade mejoras de seguridad, notificaciones mejoradas y mejoras en el acceso a “media”.

## Define java version 7 or 8

La versión utilizada es la 17.0.6 LTS, porque con esta versión obtenemos soporte por parte de Oracle hasta 2024. En cambio con la versión 19 sólo
obtenemos soporte hasta marzo de 2023.

## Diagram UML

+---------------------+         +-------------------+         +-------------------+         +-----------------+
| Game                |         | Player            |         | Card              |         | Deck            |
+---------------------+         +-------------------+         +-------------------+         +-----------------+
| -board: int[][]     |         | -name: String     |         | -up: int          |         | -cards: ArrayList<TripleTriadCard> |
| -player1: TripleTriadPlayer |  |-cards: ArrayList<TripleTriadCard> | | -down: int |         | +shuffle()      |
| -player2: TripleTriadPlayer |  | -points: int      |         | -left: int        |         +-----------------+
| -currentPlayer: TripleTriadPlayer | | -isComputer: boolean |  | -right: int       |
| -deck: TripleTriadDeck |      | -points: int      |         | -element: Element | 
|                     |         | +selectCard(): int |         | +value: int       | 
|                     |         | +placeCard(): void |         | +element: Element |
|                     |         | +addPoints(): void |         +-------------------+
|                     |         | +getName(): String |
|                     |         | +getPoints(): int  |
|                     |         +-------------------+
|                     | 
+---------------------+

En este diagrama, la clase Game representa el juego en sí, con variables de instancia para el tablero de juego, los jugadores, el jugador actual y la baraja de cartas. La clase Player representa a un jugador, con variables de instancia para el nombre del jugador, sus cartas y sus puntos. La clase Card representa una carta, con variables de instancia para los valores numéricos de la carta, el tipo de elemento y un método para recuperar el valor de la carta. La clase Deck representa la baraja de cartas, con un método para barajar la baraja.

El diagrama también incluye algunas firmas de métodos para las clases, como selectCard(), placeCard(), addPoints(), getName() y getPoints(). Estos métodos deberían implementarse en el código real.
