package be.technifutur.java2020.sudoku.sudoku4x4;

import be.technifutur.java2020.sudoku.be.technifutur.java2020.sudoku.commun.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sudoku4x4Model extends AbstractSudokuModel {

    private HashMap<Position, Cell> map;

    public boolean isValid(char value) {
        boolean valid = false;

        if (Character.isDigit(value)) {
            int val = Character.getNumericValue(value);
            valid = val >= 1 && val <= 4;
        }
        return valid;
    }

    @Override
    public Map<Position, Cell> getGrille() {
        if(map == null) {
            ArrayList<Area> lineList = new ArrayList<>();
            Area[] columnTab = new Area[4];
            Area[] squareTab = new Area[4];
            for (int i = 0; i <= 4; i++) {
                lineList.add(new Area(4, AreaType.LINE, new Position(i, 0)));
                columnTab[i] = new Area(4, AreaType.COLUMN, new Position(0, i));
                squareTab[i] = new Area(
                        4,
                        AreaType.SQUARE,
                        new Position(i / 2 * 2, i % 2 * 2));
            }

            //construire les cellules
            for (int line = 0; line < 4; line++) {
                for (int column = 0; column < 4; column++) {
                    Position position = new Position(line, column);
                    Cell cell = new Cell(position);
                    map.put(position, cell);
                    cell.add(lineList.get(line));
                    cell.add(columnTab[column]);
                    cell.add(squareTab[line / 2 * 2 + column / 2]);
                }
            }
        }
        return map;
    }

    @Override
    public int getNbCase() {
        return 4 * 4;
    }

    void poubelle(){
        ArrayList<List<Position>> lists = new ArrayList<>();
    }

}
