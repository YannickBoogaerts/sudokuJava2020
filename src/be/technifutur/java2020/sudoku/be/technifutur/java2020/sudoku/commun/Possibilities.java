package be.technifutur.java2020.sudoku.be.technifutur.java2020.sudoku.commun;

import java.util.Set;

public class Possibilities {

    private int data; // 0b111111111

    public Possibilities(Set<Integer> initialValues){
        for (int val : initialValues) {
            add(val);
        }
    }

    public Possibilities(int max){
        ///for (int i = 1; i<=  max ; i++) {
            //add(i);
            data = (1 << max) -1;
        //}
    }

    public boolean contains( int value){
        boolean contains = (data & (1 << value-1) )!= 0;
        return contains;
    }

    public boolean add( int value){
        boolean added = false;
        int ancData = data;
        data  |= 1 << value - 1;
        added = ancData != data ;
        return added;
    }

    public boolean remove( int value){
        boolean removed = false;
        int ancData = data;
        data  &= ~(1 << value - 1);
        removed = ancData != data ;

        return removed;
    }

    public int size( ){

        return Integer.bitCount(this.data);
    }

/*
    public static void main(String[] args) {
        Possibilities possibilities = new Possibilities(1, 3, 4, 7);
        System.out.println(possibilities.contains(1)); // true
        System.out.println(possibilities.remove(1)); // true
        System.out.println(possibilities.contains(1)); //false
        System.out.println(possibilities.remove(1)); // false

        System.out.println(possibilities.contains(9)); //false

        System.out.println(possibilities.add(9));//true
        System.out.println(possibilities.contains(9)); //true
        System.out.println(possibilities.size());//4

    }

 */
}
