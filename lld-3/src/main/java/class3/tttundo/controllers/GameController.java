package class3.tttundo.controllers;

import class3.tttundo.exceptions.EmptyMovesException;
import class3.tttundo.exceptions.InvalidMoveException;
import class3.tttundo.models.Game;
import class3.tttundo.models.GameState;
import class3.tttundo.models.Player;

import java.util.List;

public class GameController {
    public Game startGame(int dimension, List<Player> players) throws Exception {
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(players)
                .build();
    }

    public void makeMove(Game game) throws InvalidMoveException {
        game.makeMove();
    }

    public void displayBoard(Game game) {
        game.displayBoard(game.getBoard());
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void undo(Game game) throws EmptyMovesException {
        game.undo();
    }

    public GameState getGameState(Game game) {
        return game.getGameState();
    }
}
