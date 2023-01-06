package uusi.vezbe_01.zad_09_ponovo;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Ball matrix = new Ball(3, 5);
        matrix.add(0, 1);
        matrix.add(0, 7);
        matrix.add(0, 3);
        matrix.add(0, 4);
        matrix.add(0, 5);

        matrix.add(1, 6);
        matrix.add(1, 2);
        matrix.add(1, 0);
        matrix.add(1, 9);
        matrix.add(1, 6);


        matrix.add(2, 1);
        matrix.add(2, 2);
        matrix.add(2, 3);
        matrix.add(2, 7);
        matrix.add(2, 9);

        Iterator<Integer> it = matrix.iterator(2,4);
        while(it.hasNext()){
            System.out.println("  =>  " + it.next());
        }
    }
}
