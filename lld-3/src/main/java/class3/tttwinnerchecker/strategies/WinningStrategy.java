package class3.tttwinnerchecker.strategies;

import class3.tttwinnerchecker.models.Board;
import class3.tttwinnerchecker.models.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);
}
