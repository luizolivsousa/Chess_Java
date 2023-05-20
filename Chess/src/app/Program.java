package app;

import model.chess.ChessMatch;

public class Program {
    public static void main(String[] args) throws Exception {
       
        ChessMatch ChessMatch = new ChessMatch();
        UI.printBoard(ChessMatch.getChessPieces());

    }
}
