package uusi.set.HasSet;

import uusi.vezbe_01.zad_10.Point;
import uusi.vezbe_01.zad_11.Rectangle;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // pravimo set sa razlicitim elementima
        HashSet<Object> hs = new HashSet<>();

        hs .add(new Rectangle(new Point<>(0,4), new Point<>(7,6)));
        hs.add(true);
        hs.add(10);
        hs.add("Kaca");
        hs.add("Taki");
        hs.add(0.75);
        hs.add(null);

        System.out.println(hs);
    }
}
