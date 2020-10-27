package be.technifutur.java2020.sudoku.sudoku9x9;

import be.technifutur.java2020.sudoku.be.technifutur.java2020.sudoku.commun.AbstractSudokuVue;
import be.technifutur.java2020.sudoku.sudoku4x4.Sudoku4x4Model;

public class Sudoku9x9Vue extends AbstractSudokuVue {

    private static String grille = "" +
            "+-------+-------+-------+\n" +
            "| . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |\n" +
            "+-------+-------+-------+\n" +
            "| . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |\n" +
            "+-------+-------+-------+\n" +
            "| . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |\n" +
            "| . . . | . . . | . . . |\n" +
            "+-------+-------+-------+\n";

    static {
        grille = grille.replace(".", "%s");
    }


    public void afficheGrilleVide() {
        internalAfficheGrille(new Sudoku9x9Model());
    }

    @Override
    protected String getGrille() {
        return grille;
    }

}
