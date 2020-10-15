package be.technifutur.java2020.sudoku.sudoku9x9;

import be.technifutur.java2020.sudoku.be.technifutur.java2020.sudoku.commun.AbstractSudokuModel;

public class Sudoku9x9Model extends AbstractSudokuModel {

    protected Sudoku9x9Model() {
        super(9, 9);
    }

    public boolean isPositionValid(int line, int column) {
        return line>=0 && line < 9 && column >= 0 && column < 9;
    }

    public boolean isValid(char value) {
        boolean valid = false;

        if(Character.isDigit(value)){
            int val = Character.getNumericValue(value);
            valid = val >= 1 && val <= 9;
        }
        return valid;
    }
}
