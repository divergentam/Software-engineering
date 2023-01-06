package uusi.vezbe_01.zad_04;

import java.util.ArrayList;
import java.util.Iterator;

public class Zad_04 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Majmunee");
        arrayList.add("Test");
        arrayList.add("Jedan");


        Iterator<String> iterator = arrayList.iterator();

        while(iterator.hasNext()){
            String s = iterator.next();
            if(s.equals("Test")){
                iterator.remove();
            }
            else{
                System.out.println(s);
            }
        }

    }
}
