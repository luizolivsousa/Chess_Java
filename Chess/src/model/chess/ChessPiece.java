package model.chess;

import model.boardgame.Board;
import model.boardgame.Piece;

public class ChessPiece extends Piece {
    
    private Color color;
    private int moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void setMoveCount(int moveCount) {
        this.moveCount = moveCount;
    }

/*     public ChessPosition getChessPosition() {
        return position;
    } */
}
