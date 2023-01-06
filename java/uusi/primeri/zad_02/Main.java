package uusi.primeri.zad_02;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Triangle<Integer>> triangles = new ArrayList<>();
        Triangle<Integer> t1 = new Triangle<Integer>(new Point<Integer>(1,1), new Point<Integer>(2, 2), new Point<Integer>(3,6));
        Triangle<Integer> t2 = new Triangle<Integer>(new Point<Integer>(1,1), new Point<Integer>(3,3), new Point<Integer>(12,13));
        Triangle<Integer> t3 = new Triangle<Integer>(new Point<Integer>(2,2), new Point<Integer>(4, 4), new Point<Integer>(13,14));
        Triangle<Integer> t4 = new Triangle<Integer>(new Point<Integer>(2,3), new Point<Integer>(6, 6), new Point<Integer>(8,9));
        triangles.add(t1);
        triangles.add(t2);
        triangles.add(t3);
        triangles.add(t4);

        HashMap<Double, Triangle<Integer>> hashMap = new HashMap<>();

        Iterator<Triangle<Integer>> it = triangles.iterator();
        while (it.hasNext()){
            Triangle<Integer> triangle = it.next();
            double key = triangle.getMeasure();
            if(!hashMap.containsKey(key)){
                    hashMap.put(key, triangle);
            }
        }

        Iterator<Double> it2 = hashMap.keySet().iterator();
        System.out.println("Triangles in hashMap where two triangles are equal when their measure are equal!");
        while (it2.hasNext()){
           double key = it2.next();
           Triangle<Integer> value = hashMap.get(key);
           System.out.println(key + " => " + value);
        }

        TreeSet<Triangle<Integer>> treeSet = new TreeSet<Triangle<Integer>>();

        Iterator<Triangle<Integer>> it3 = triangles.iterator();
        while (it3.hasNext()){
            Triangle<Integer> triangle = it3.next();
            if(!treeSet.contains(triangle)){
                treeSet.add(triangle);
            }
        }

        Iterator<Triangle<Integer>> itSet = treeSet.iterator();
        System.out.println("Triangles in set where elements are sorted in ascending order by measure!");
        while (itSet.hasNext()){
            Triangle<Integer> triangle = itSet.next();
            System.out.println(triangle + " -> measure: " + triangle.getMeasure());
        }
    }
}
