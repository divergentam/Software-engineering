package uusi.vezbe_01.zad_03;

import java.util.ArrayList;
import java.util.Iterator;

public class Zad_03 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<ArrayList<Integer>>();

        int n = 4;
        int m = 4;

        for(int i = 0; i < n; i++){
            matrix.add(new ArrayList<>(m));
        }

        matrix.get(0).add(1);
        matrix.get(0).add(2);
        matrix.get(0).add(3);
        matrix.get(0).add(4);

        matrix.get(1).add(5);
        matrix.get(1).add(6);
        matrix.get(1).add(7);
        matrix.get(1).add(8);

        matrix.get(2).add(1);
        matrix.get(2).add(4);
        matrix.get(2).add(3);
        matrix.get(2).add(4);

        matrix.get(3).add(5);
        matrix.get(3).add(6);
        matrix.get(3).add(7);
        matrix.get(3).add(8);

        MatrixIterator iterator = new MatrixIterator(matrix);

        int sumMainDiagonal = 0;
        int sumSideDiagonal = 0;

        while(iterator.hasNext()){
            for(int i = 0; i < 4; i++){
                System.out.print(iterator.next() + " ");
            }
            System.out.println();
        }

        MatrixIterator iterator2 = new MatrixIterator(matrix);

        for(int i = 0; i <n; i++){
            sumMainDiagonal += matrix.get(i).get(i);
        }

        for(int i = 0; i <n; i++){
            sumSideDiagonal += matrix.get(i).get(m-1-i);
        }

        System.out.println("Sum on main diagonal is " + sumMainDiagonal);
        System.out.println("Sum on side diagonal is " + sumSideDiagonal);


    }
}
