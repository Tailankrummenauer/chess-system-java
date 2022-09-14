package chess;

import boardgame.Board;
import boardgame.Piece;

//subclasse de peça, como la tem contrutor aqui tem que ter tb
public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

}