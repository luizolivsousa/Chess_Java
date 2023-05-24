package model.chess;

import model.boardgame.BoardException;

public class ChessException extends BoardException {

    static final long serialVersionUID = 1L;

    public ChessException(String message) {
        super(message);
    }
}