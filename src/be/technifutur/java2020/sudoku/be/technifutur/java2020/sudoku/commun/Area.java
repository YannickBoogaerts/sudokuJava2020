package be.technifutur.java2020.sudoku.be.technifutur.java2020.sudoku.commun;


import java.util.LinkedHashSet;
import java.util.Set;

public class Area {

    private Possibilities possibilities;
    private AreaType type;
    private Set<Position> positionSet;

    public Area(int size, AreaType type, Position first) {
        possibilities = new Possibilities(size);
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

    public static void main(String[] args) {
        Area area = new Area(9, AreaType.SQUARE, new Position(3, 3));
        for (Position p : area.getPositionSet()) {
            System.out.println(p.toString());
        }
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
        return positionSet;
    }
}