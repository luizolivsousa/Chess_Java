package model.chess;

public class ChessException extends RuntimeException {

    static final long serialVersionUID = 1L;

    public ChessException(String message) {
        super(message);
    }
}