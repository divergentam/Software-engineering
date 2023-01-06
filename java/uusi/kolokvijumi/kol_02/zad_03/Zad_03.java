package uusi.kolokvijumi.kol_02.zad_03;

import java.util.Iterator;

public class Zad_03 {
    public static void main(String[] args) {
        Matrix<Integer> mat = new Matrix<>(4,5);
        mat.add(0, 1);
        mat.add(0, 7);
        mat.add(0, 3);
        mat.add(0, 4);
        mat.add(0, 5);

        mat.add(1, 6);
        mat.add(1, 2);
        mat.add(1, 0);
        mat.add(1, 9);
        mat.add(1, 5);

        mat.add(2, 1);
        mat.add(2, 2);
        mat.add(2, 3);
        mat.add(2, 7);
        mat.add(2, 9);

        mat.add(3, 1);
        mat.add(3, 2);
        mat.add(3, 3);
        mat.add(3, 7);
        mat.add(3, 9);


        Iterator<Integer> it = mat.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
