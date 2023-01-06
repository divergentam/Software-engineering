package uusi.vezbe_01.zad_01;

import java.util.ArrayList;
import java.util.Iterator;

public class Zad_01 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(9);
        arrayList.add(3);
        arrayList.add(1);

        //Iterator<Integer> myIterator = new ArrayIterator(arrayList);
        int sum = 0;
        Iterator<Integer> it = arrayList.iterator();
        while(it.hasNext()) {
            sum += it.next();
        }
        System.out.println("Sum of elements in list is " + sum);


        /*  while(myIterator.hasNext()){
            sum += myIterator.next();
        }*/

    }
}
