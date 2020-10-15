package be.technifutur.java2020.sudoku.sudoku4x4;

public class Sudoku4x4Model {

    public static final char EMPTY = 0;

    private char[][] grille = new char[4][4];

    public void setValue(char value, int line, int column) {
        if (isValid(value)&& isPositionValid(line, column)) {
            grille[line][column] = value;
        }

    }

    public void removeValue(int line, int column){
        if(isPositionValid(line,column)){
            grille[line][column] = EMPTY;
        }
    }

    public boolean isPositionValid(int line, int column) {
        return line>=0 && line < 4 && column >= 0 && column < 4;
    }

    public boolean isValid(char value) {
        boolean valid = false;

        if(Character.isDigit(value)){
            int val = Character.getNumericValue(value);
            valid = val >= 1 && val <= 4;
        }
        return valid;
    }

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
}
