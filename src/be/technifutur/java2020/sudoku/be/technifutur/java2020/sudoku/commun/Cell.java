package be.technifutur.java2020.sudoku.be.technifutur.java2020.sudoku.commun;

import java.util.HashSet;
import java.util.Set;

public class Cell {
    private Position position;
    private Set<Area> areaSet;

    public Cell(Position position){
        this.position = position;
        areaSet = new HashSet<>();
    }

    public Position getPosition() {
        return position;
    }

    public boolean add(Area area) {
        boolean add = false;
        if(area.getPositionSet().contains(this.position)) {
            add = areaSet.add(area);
        }
        return add;
    }

    public void setValue(char value) {
        //TODO à coder
    }

    public void removeValue() {
        //TODO à coder
    }

    public char getValue() {
        //TODO à coder
        return 0;
    }
}
