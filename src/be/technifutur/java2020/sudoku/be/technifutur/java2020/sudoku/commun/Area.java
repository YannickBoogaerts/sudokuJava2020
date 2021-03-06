package be.technifutur.java2020.sudoku.be.technifutur.java2020.sudoku.commun;


import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class Area {

    private Possibilities possibilities;

    private AreaType type;
    private Set<Position> positionSet;

    public Area(int size, AreaType type, Position first) {
        this.possibilities = new Possibilities(size);
        this.type = type;
        this.positionSet = new LinkedHashSet<>();
        switch (type) {
            case LINE:
                initLine(first, size);
                break;
            case COLUMN:
                initColumn(first, size);
                break;
            case SQUARE:
                initSquare(first, size);
                break;
        }
    }

    public AreaType getType() {
        return type;
    }

    private void initSquare(Position first, int size) {
        int sqrt = (int) Math.sqrt(size);
        for (int i = 0; i < size; i++) {
            this.positionSet.add(
                    new Position(
                            first.getLine() + i / sqrt,
                            first.getColumn() + i % sqrt));
        }
    }

    private void initColumn(Position first, int size) {
        for (int i = 0; i < size; i++) {
            this.positionSet.add(
                    new Position(
                            first.getLine() + i,
                            first.getColumn()
                    )
            );
        }
    }

    private void initLine(Position first, int size) {
        for (int i = 0; i < size; i++) {
            this.positionSet.add(
                    new Position(
                            first.getLine(),
                            first.getColumn() + i
                    )
            );
        }
    }

    public Set<Position> getPositionSet() {
        return Collections.unmodifiableSet(positionSet);
    }

    public boolean contains(int value) {
        return possibilities.contains(value);
    }

    public boolean add(int value) {
        return possibilities.add(value);
    }

    public boolean remove(int value) {
        return possibilities.remove(value);
    }

    public int size() {
        return possibilities.size();
    }
}
