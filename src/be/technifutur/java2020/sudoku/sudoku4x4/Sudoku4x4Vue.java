package be.technifutur.java2020.sudoku.sudoku4x4;

public class Sudoku4x4Vue {

    private Sudoku4x4Model model;
    private User user = new ConsoleUser();

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

    public void setUser(User user) {
        this.user = user;
    }



    public void setModel(Sudoku4x4Model a_model){
        this.model = a_model;
    }

    public void afficheGrilleVide(){
        internalAfficheGrille(new Sudoku4x4Model());
    }

    public void afficheGrille(){
        internalAfficheGrille(this.model);
    }

    private void internalAfficheGrille(Sudoku4x4Model model){

        Character[] tabValue = new Character[4*4];

        for(int lig = 0; lig <4 ; lig++){
            for(int col = 0; col < 4 ; col++){

                char value = model.getValue(lig, col);
                if(value == 0){
                    tabValue[lig * 4 + col]= '.';
                }else{
                    tabValue[lig * 4 + col]= value;
                }
            }
        }
        System.out.printf(this.grille, tabValue);
    }

    public static void main(String[] args) {
        Sudoku4x4Vue vue = new Sudoku4x4Vue();
        Sudoku4x4Model model = new Sudoku4x4Model();

        vue.setModel(model);

        model.setValue('2',1,1);

        vue.afficheGrilleVide();

        vue.afficheGrille();
    }

    public String saisirNewValue() {
        System.out.print(" valeur ( ligne.colonne.valeur) : ");
        return user.getString();
    }
}
