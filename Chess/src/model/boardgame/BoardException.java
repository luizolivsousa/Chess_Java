package model.boardgame;

public class BoardException extends RuntimeException {

    static final long serialVersionUID = 1L;

    public BoardException(String message) {
        super(message);
    }
}