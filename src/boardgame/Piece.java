package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; // se nao colocar o java por padrao nulo
    }

    protected Board getBoard() {
        return board;
    }





}