package uusi.vezbe_01.zad_08_ponovo;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(4,4);
        matrix.add(0, 1);
        matrix.add(0, 2);
        matrix.add(0, 0);
        matrix.add(0, 7);

        matrix.add(1, 0);
        matrix.add(1, 0);
        matrix.add(1, 3);
        matrix.add(1, 0);

        matrix.add(2, 1);
        matrix.add(2, 5);
        matrix.add(2, 0);
        matrix.add(2, 7);

        matrix.add(3, 0);
        matrix.add(3, 0);
        matrix.add(3, 1);
        matrix.add(3, 0);

        for(int i = 0; i < 4; i++){
            for(int j = 0; j <4; j++){
                System.out.print(matrix.elementAt(i, j) + " ");
            }
            System.out.println();
        }

        Iterator<Integer> iterator = matrix.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
