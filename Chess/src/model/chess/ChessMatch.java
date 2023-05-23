package model.chess;

import model.boardgame.Board;
import model.chess.pieces.King;
import model.chess.pieces.Rook;

public class ChessMatch {
    
    private Board board;

    public ChessMatch() {
        this.board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getChessPieces() {
        ChessPiece[][] matrixChessPieces = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                // It is necessary to downcast Piece to ChessPiece.
                matrixChessPieces[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return matrixChessPieces;
    }

    private void placeNewPiece(char column, int row, ChessPiece piece) {
        board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup() {
        // Will place the pieces on the board.
        placeNewPiece('b', 6, new Rook(board, Color.WHITE));
        placeNewPiece('e', 8, new King(board, Color.BLACK));
        placeNewPiece('e', 1, new King(board, Color.WHITE));
    }

}
