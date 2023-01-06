package uusi.vezbe_01.zad_02;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyArray<Integer> array = new MyArray<>();
        array.add(5);
        array.add(10);
        array.add(7);
        array.add(1);
        array.add(6);
        array.add(78);
        array.add(9);
        Iterator<Integer> it = array.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
