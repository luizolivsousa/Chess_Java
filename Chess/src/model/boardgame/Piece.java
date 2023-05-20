package model.boardgame;

public class Piece {
    
    // Not to be visible by chass layer.
    protected Position position;
    private Board board;

    // Initial position will receive null
    public Piece(Board board) {
        this.board = board;
    }

    // Only subclasses and classes on the same package will access board.
    protected Board getBoard() {
        return board;
    }

    public boolean PossibleMoves() {
        return false;
    }

    public boolean PossibleMove(Position position) {
        return false;
    }

    public boolean isThereAnyPossibleMove() {
        return false;
    }
}
