package be.technifutur.java2020.sudoku.sudokuEtoile;

import be.technifutur.java2020.sudoku.be.technifutur.java2020.sudoku.commun.AbstractSudokuModel;

public class SudokuEtoileModel extends AbstractSudokuModel {

    protected SudokuEtoileModel() {
        super(9, 9);
    }

    public boolean isPositionValid(int line, int column) {
        boolean valid = false;
        if (line >= 0 && line <= this.getMaxLine() && column >= 0 && column <= this.getMaxColumn()) {
            if (line < 6 || line >= 15) {
                valid = column < 9 || column >= 12;
            } else if (line >= 9 && line < 12) {
                valid = column >= 6 && column < 15;
            } else {
                valid = true;
            }
        }
        return valid;
    }

    public boolean isValid(char value) {
        boolean valid = false;

        if (Character.isDigit(value)) {
            int val = Character.getNumericValue(value);
            valid = val >= 1 && val <= 9;
        }
        return valid;
    }

    @Override
    public int getNbCase() {
        return (9 * 9 * 5) - (3 * 3 * 4);
    }
}
