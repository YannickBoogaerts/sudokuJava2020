package be.technifutur.java2020.sudoku.be.technifutur.java2020.sudoku.commun;

public class Position {

    private int line;
    private int column;

    public Position(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }
}
