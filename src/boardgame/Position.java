package boardgame;

public class Position {
    //encapsulamento dos campos
    private Integer row;
    private Integer column;
   
   //construtor
    public Position(Integer row, Integer column) {
        this.row = row;
        this.column = column;
    }

//encapsulamento
    public Integer getRow() {
        return row;
    }

//encapsulamento
    public void setRow(Integer row) {
        this.row = row;
    }


    public Integer getColumn() {
        return column;
    }


    public void setColumn(Integer column) {
        this.column = column;
    }

    public void setValues (Integer row, Integer column){
        this.row = row;
        this.column = column;
    }
    
    //conceito object é uma super classe de todas classes
    
    @Override //sobreposição de metodo toString que é da classe object

    public String toString() {
        return "Position: " +
                "row = " + row +
                ", column = " + column;
                }
}