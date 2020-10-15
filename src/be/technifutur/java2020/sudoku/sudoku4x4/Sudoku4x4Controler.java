package be.technifutur.java2020.sudoku.sudoku4x4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sudoku4x4Controler {
    private Sudoku4x4Vue vue;
    private Sudoku4x4Model model;

    public Sudoku4x4Vue getVue() {
        return vue;
    }

    public Sudoku4x4Model getModel() {
        return model;
    }

    public void setVue(Sudoku4x4Vue vue) {
        this.vue = vue;
    }

    public void setModel(Sudoku4x4Model model) {
        this.model = model;
    }

    public void start(){
        Pattern pattern = Pattern.compile("([1-4])\\.([1-4])\\.([1-4])");
        vue.afficheGrille();
        String input = vue.saisirNewValue();
        while( !"q".equalsIgnoreCase(input)){
            Matcher matcher = pattern.matcher(input);
            if(matcher.matches()){
                int line = Integer.parseUnsignedInt(matcher.group(1))-1;
                int col = Integer.parseUnsignedInt(matcher.group(2))-1;
                char val = matcher.group(3).charAt(0);
                model.setValue(val,line,col);
            }
            vue.afficheGrille();
            input = vue.saisirNewValue();
        }
    }

    public static void main(String[] args) {
        Sudoku4x4Model model = new Sudoku4x4Model();
        Sudoku4x4Vue vue = new Sudoku4x4Vue();
        vue.setModel(model);
        Sudoku4x4Controler controler = new Sudoku4x4Controler();
        controler.setModel(model);
        controler.setVue(vue);
        controler.start();
    }
}
