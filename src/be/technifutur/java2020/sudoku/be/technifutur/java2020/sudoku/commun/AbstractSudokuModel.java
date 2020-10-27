package be.technifutur.java2020.sudoku.be.technifutur.java2020.sudoku.commun;

public abstract class AbstractSudokuModel {

    public static final char EMPTY = 0;

    private char[][] grille ;

    protected AbstractSudokuModel( int nbLigne, int nbColonne){
        grille = new char[nbLigne][nbColonne];

    }

    public void setValue(char value, int line, int column) {
        if (this.isValid(value)&& this.isPositionValid(line, column)) {
            grille[line][column] = value;
        }

    }

    public void removeValue(int line, int column){
        if(isPositionValid(line,column)){
            grille[line][column] = EMPTY;
        }
    }

    public abstract boolean isPositionValid(int line, int column);

    public abstract boolean isValid(char value);


    public char getValue(int line, int column) {
        char val = EMPTY;
        if(isPositionValid(line,column)){
            val = grille[line][column];
        }
        return val;

    }

    public boolean isEmpty(int lig, int col) {
        boolean empty = true;
        if(isPositionValid(lig,col)){
            empty = grille[lig][col]  == EMPTY;
        }
        return empty;
    }

    public abstract int getNbCase();

    public int getMaxLine() {
       return this.grille.length;
    }

    public int getMaxColumn() {
        return this.grille[0].length;
    }
}
