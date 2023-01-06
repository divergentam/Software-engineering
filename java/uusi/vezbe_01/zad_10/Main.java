package uusi.vezbe_01.zad_10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       LinkedList<Point<Integer>> pointLinkedList = new LinkedList<>();
        pointLinkedList.add(new Point<Integer>(2,5));
        pointLinkedList.add(new Point<Integer>(5,2));
        pointLinkedList.add(new Point<Integer>(3,5));
        pointLinkedList.add(new Point<Integer>(2,7));
        pointLinkedList.add(new Point<Integer>(1,0));

        //iteriraj kroz listu i napravi nesortiranu kolekciju gde
        //je key mera, a value tacka, ako već nije dodata tačka sa takvom merom

        HashMap<Double, Point<Integer>> map = new HashMap<Double, Point<Integer>>();


        for (Point<Integer> point : pointLinkedList) {
            if (!map.containsKey(point.getMeasure())) {
                map.put(point.getMeasure(), point);
            }
        }

        //map entry je key-value par
        for (Map.Entry<Double, Point<Integer>> doublePointEntry : map.entrySet()) {
            System.out.println(doublePointEntry.getValue());
        }


    }
}
