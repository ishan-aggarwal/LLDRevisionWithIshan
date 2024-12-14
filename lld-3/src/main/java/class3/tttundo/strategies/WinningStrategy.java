package class3.tttundo.strategies;

import class3.tttundo.models.Board;
import class3.tttundo.models.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);
}
