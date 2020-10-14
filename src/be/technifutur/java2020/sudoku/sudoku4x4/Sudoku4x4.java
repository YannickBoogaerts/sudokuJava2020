package be.technifutur.java2020.sudoku.sudoku4x4;

import be.technifutur.java2020.sudoku.Sudoku;

public class Sudoku4x4 implements Sudoku {
    private String grille = "" +
            "+-----+-----+\n" +
                    "| . . | . . |\n" +
                    "| . . | . . |\n" +
                    "+-----+-----+\n" +
                    "| . . | . . |\n" +
                    "| . . | . . |\n" +
                    "+-----+-----+\n";

    @Override
    public void afficheGrilleVide() {
        System.out.println(grille);
    }

    @Override
    public String getName() {
        return "Sudoku 4 X 4";
    }

}
