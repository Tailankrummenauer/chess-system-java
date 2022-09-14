package application;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class App {
    public static void main(String[] args) throws Exception {

        ChessMatch chessMatch = new ChessMatch();
        //user interface
        UI.printBoard(chessMatch.getPieces());
    }
}
