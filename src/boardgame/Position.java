package boardgame;

public class Position {
    //encapsulamento dos campos
    private int row;
    private int column;
   
   //construtor
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

//encapsulamento
    public int getRow() {
        return row;
    }

//encapsulamento
    public void setRow(int row) {
        this.row = row;
    }

    

    public int getColumn() {
        return column;
    }


    public void setColumn(int column) {
        this.column = column;
    }

    //conceito object é uma super classe de todas classes
    
    public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}

	@Override
	public String toString() {
		return row + ", " + column;
    }
}