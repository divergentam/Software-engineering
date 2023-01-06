package uusi.vezbe_01.zad_09;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < 3; i++){
            matrix.add(new ArrayList<Integer>());
        }
        matrix.get(0).add(1);
        matrix.get(0).add(7);
        matrix.get(0).add(3);
        matrix.get(0).add(4);
        matrix.get(0).add(5);
        matrix.get(1).add(6);
        matrix.get(1).add(2);
        matrix.get(1).add(0);
        matrix.get(1).add(9);
        matrix.get(1).add(6);
        matrix.get(2).add(1);
        matrix.get(2).add(2);
        matrix.get(2).add(3);
        matrix.get(2).add(7);
        matrix.get(2).add(9);

        Iterator<Integer> it = new MatrixIterator(2, 4, matrix);

        while(it.hasNext()){
            it.next();
        }

    }
}
