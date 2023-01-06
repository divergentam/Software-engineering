package uusi.vezbe_01.zad_05;

import java.util.Iterator;
import java.util.List;

public class Zad_05 {
    public static void main(String[] args) {
        List<Integer> a = List.of(1,2,3,4,5);
        List<Integer> b = List.of(6,7,8);

        Iterator<Integer> ita = a.iterator();
        Iterator<Integer> itb = b.iterator();
        char from = 'a';

        while(ita.hasNext() || itb.hasNext()){
            if(from == 'a' ){
                if(ita.hasNext()){
                    System.out.println(ita.next());
                }
                from = 'b';
            }
            else {
                if(itb.hasNext()){
                    System.out.println(itb.next());
                }
                from = 'a';
            }
        }

    }
}
