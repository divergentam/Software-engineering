package uusi.vezbe_01.zad_08;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < 5; i++){
            matrix.add(new ArrayList<Integer>());
        }
        matrix.get(0).add(1);
        matrix.get(0).add(2);
        matrix.get(0).add(0);
        matrix.get(0).add(7);
/*        matrix.get(0).add(5);
        matrix.get(0).add(0);*/
        matrix.get(1).add(0);
        matrix.get(1).add(0);
        matrix.get(1).add(3);
        matrix.get(1).add(0);
/*        matrix.get(1).add(0);
        matrix.get(1).add(4);*/
        matrix.get(2).add(1);
        matrix.get(2).add(5);
        matrix.get(2).add(0);
        matrix.get(2).add(7);
/*        matrix.get(2).add(7);
        matrix.get(2).add(5);*/
        matrix.get(3).add(0);
        matrix.get(3).add(0);
        matrix.get(3).add(1);
        matrix.get(3).add(0);
/*        matrix.get(3).add(0);
        matrix.get(3).add(1);
        matrix.get(4).add(0);
        matrix.get(4).add(0);
        matrix.get(4).add(10);
        matrix.get(4).add(0);
        matrix.get(4).add(0);
        matrix.get(4).add(0);*/

        Iterator<Integer> iterator = new MatrixIterator(matrix);

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
