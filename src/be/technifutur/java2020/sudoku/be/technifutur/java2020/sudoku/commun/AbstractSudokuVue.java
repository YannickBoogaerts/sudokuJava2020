package be.technifutur.java2020.sudoku.be.technifutur.java2020.sudoku.commun;

import be.technifutur.java2020.sudoku.sudoku4x4.Sudoku4x4Model;

public abstract class AbstractSudokuVue {

    private AbstractSudokuModel model;
    private User user = new ConsoleUser();

    public void setUser(User user) {
        this.user = user;
    }

    public void setModel(AbstractSudokuModel a_model) {
        this.model = a_model;
    }

    public abstract void afficheGrilleVide();

    public void afficheGrille() {
        internalAfficheGrille(this.model);
    }

    protected void internalAfficheGrille(AbstractSudokuModel model) {

        Character[] tabValue = new Character[model.getNbCase()];

        int pos = 0;
        for (int lig = 0; lig < model.getMaxLine(); lig++) {
            for (int col = 0; col < model.getMaxColumn(); col++) {

                if (model.isPositionValid(lig, col)) {
                    if (model.isEmpty(lig, col)) {
                        tabValue[pos] = '.';
                    } else {
                        tabValue[pos] = model.getValue(lig, col);
                    }
                    pos++;
                }
            }
        }
        System.out.printf(this.getGrille(), tabValue);
    }

    protected abstract String getGrille();

    public String saisirNewValue() {
        System.out.print(" valeur ( ligne.colonne.valeur) : ");
        return user.getString();
    }
}
