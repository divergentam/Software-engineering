package uusi.kolokvijumi.kol_01.zad_03;

import java.util.Iterator;

public class Zad_03 {
    public static void main(String[] args) {
        Array<Integer> array = new Array<>();
        array.addEl(1);
        array.addEl(7);
        array.addEl(3);
        array.addEl(5);
        array.addEl(4);
        array.addEl(7);
        array.addEl(3);
        array.addEl(7);
        array.addEl(1);
        array.addEl(9);
        array.addEl(5);

        Iterator<Integer> it = array.iterator(1);
        while(it.hasNext()){
            int el = it.next();
            System.out.println(el + " ");
        }

    }
}
