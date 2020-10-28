package be.technifutur.java2020.sudoku.be.technifutur.java2020.sudoku.commun;

import java.util.Map;

public abstract class AbstractSudokuModel {

    public static final char EMPTY = 0;

    public void setValue(char value, int line, int column) {
        setValue(value, new Position(line, column));
    }

    public void setValue(char value, Position position) {
        if (this.isValid(value) && this.isPositionValid(position)) {
            Cell cell = getCell(position);
            cell.setValue(value);
        }
    }

    private Cell getCell(Position position) {
        return getGrille().get(position);
    }

    public void removeValue(int line, int column) {
        this.removeValue(new Position(line, column));
    }

    public void removeValue(Position position) {
        if (isPositionValid(position)) {
            getCell(position).removeValue();
        }
    }

    public boolean isPositionValid(int line, int column) {
        return isPositionValid(new Position(line, column));
    }

    public boolean isPositionValid(Position position) {
        return this.getGrille().containsKey(position);
    }

    public abstract boolean isValid(char value);

    public abstract Map<Position, Cell> getGrille();


    public char getValue(int line, int column) {
        return getValue(new Position(line, column));
    }

    public char getValue(Position position) {
        char val = EMPTY;
        if (isPositionValid(position)) {
            val = getCell(position).getValue();
        }
        return val;

    }

    public boolean isEmpty(int lig, int col) {
        return isEmpty(new Position(lig, col));
    }

    public boolean isEmpty(Position position) {
        boolean empty = true;
        if (isPositionValid(position)) {
            empty = getValue(position) == EMPTY;
        }
        return empty;
    }

    public abstract int getNbCase();

    public int getMaxLine() {
        return getGrille()
                .keySet()
                .stream()
                .map((p) -> p.getLine())
                .max((i, j) -> j - i)
                .orElse(0);
    }

    public int getMaxColumn() {
        return getGrille()
                .keySet()
                .stream()
                .map((p) -> p.getColumn())
                .max((i, j) -> j - i)
                .orElse(0);
    }
}
