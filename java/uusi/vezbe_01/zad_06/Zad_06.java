package uusi.vezbe_01.zad_06;

import java.util.ArrayList;
import java.util.Iterator;

public class Zad_06 {
    public static void main(String[] args) {
        MyArray<String> string = new MyArray<>();
        string.add("Ja");
        string.add("imam");
        string.add("malo");
        string.add("godina");
        string.add("a");
        string.add("Aleksa");
        string.add("ima");
        string.add("puno");
        string.add("i mnogo mi");
        string.add("Je dobar");
        string.add("drug");

        Iterator<String> iterator = string.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
