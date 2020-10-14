package be.technifutur.java2020.sudoku.sudoku4x4;

public class Sudoku4x4Model {

    private char[][] grille = new char[4][4];

    public void setValue(char value, int line, int column){
        grille[line][column] = value;

    }

    public char getValue(int line, int column){
        return grille[line][column];
    }

    public static void main(String[] args) {
        Sudoku4x4Model model = new Sudoku4x4Model();
        model.setValue('4',1,1);
        char val = model.getValue(1,1);

        System.out.println("---"+val);
    }
}
