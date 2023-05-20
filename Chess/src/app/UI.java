package app;

import model.chess.ChessPiece;

public class UI {
    
    public static void printBoard(ChessPiece[][] matrixChessPieces) {
        for (int i = 0; i < matrixChessPieces.length; i++) {
            // The numbers at the left side of the board.
            System.out.printf("%d ", 8 - i);
            for (int j = 0; j < matrixChessPieces.length; j++) {
                // Will print each Chesspiece inside the matrix.
                printChessPiece(matrixChessPieces[i][j]);
            }
            // Pass to the next line.
            System.out.println();
        }
        System.out.println("  a b c d e f g h");
    }

    private static void printChessPiece(ChessPiece chessPiece) {
        if (chessPiece == null) {
            // Positions that don't have chesspieces.
            System.out.print("-");
        } else {
            System.out.print(chessPiece);
        }
        System.out.print(" ");
    }
}
