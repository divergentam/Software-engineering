package uusi.vezbe_01.zad_10_ponovo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Point<Integer>> pointLinkedList = new ArrayList<Point<Integer>>();
        pointLinkedList.add(new Point<Integer>(2,5));
        pointLinkedList.add(new Point<Integer>(5,2));
        pointLinkedList.add(new Point<Integer>(3,5));
        pointLinkedList.add(new Point<Integer>(2,7));
        pointLinkedList.add(new Point<Integer>(1,0));

        HashMap<Double, Point<Integer>> hashMap = new HashMap<>();
        for(int i = 0; i< pointLinkedList.size(); i++){
            double key = pointLinkedList.get(i).getMeasure();
            if(!hashMap.containsKey(key)){
                hashMap.put(key, pointLinkedList.get(i));
            }
        }

        Iterator<Double> it = hashMap.keySet().iterator();
        while(it.hasNext()){
            double key = it.next();
            Point<Integer> point = hashMap.get(key);
            System.out.println("Key: " + key + " => " + point);
        }

    }
}
