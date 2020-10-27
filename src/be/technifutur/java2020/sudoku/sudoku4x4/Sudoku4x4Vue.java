package be.technifutur.java2020.sudoku.sudoku4x4;

import be.technifutur.java2020.sudoku.be.technifutur.java2020.sudoku.commun.AbstractSudokuVue;

public class Sudoku4x4Vue extends AbstractSudokuVue {

     private static String grille = "" +
            "+-----+-----+\n" +
            "| . . | . . |\n" +
            "| . . | . . |\n" +
            "+-----+-----+\n" +
            "| . . | . . |\n" +
            "| . . | . . |\n" +
            "+-----+-----+\n";

    static {
        grille = grille.replace(".", "%s");
    }


    public void afficheGrilleVide(){
        internalAfficheGrille(new Sudoku4x4Model());
    }

    @Override
    protected String getGrille() {
        return grille;
    }

}
