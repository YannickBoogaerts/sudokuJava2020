package be.technifutur.java2020.sudoku.sudoku4x4;

import be.technifutur.java2020.sudoku.be.technifutur.java2020.sudoku.commun.AbstractSudokuModel;

public class Sudoku4x4Model extends AbstractSudokuModel {


    protected Sudoku4x4Model() {
        super(4, 4);
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

    @Override
    public int getNbCase() {
        return 4*4;
    }

}
