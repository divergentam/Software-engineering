package uusi.vezbe_02.zad_01;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

// napisati fju za sortiranje niza koristeci TreeMap
public class Zad_01 {
    /*
    * Niz moze da ima i vrednosti koje se javljaju vise puta // npr: 1 5 3 1 5 3 3 2 9 4
    * Da bi u mapi zapamtili da se odredjeni elementi javlajju vise puta
    * key - vrednost broja | value - broj ponavljanja tog broja
    * tako ce dodavanjem novih el. automatski elemnti biti sortirani po kljucu
    * odnosno po brojevima
    * */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/ulaz_01.txt");
        Scanner scanner = new Scanner(file);

        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        while(scanner.hasNext()){
            int element = scanner.nextInt();
            list.add(element);
            if(treeMap.containsKey(element)){ //ako postoji  vec u mapi onda je broj ponavljanja jednak dosadasnji br ponavljanja + 1
                int val = treeMap.get(element);
                treeMap.put(element, val+1);
            }else{
                treeMap.put(element, 1); // ako kljuc ne postoji vec u mapi onda kazi da je broj ponavljanja 1
            }
        }

        //sad samo popunili mapu
        // pravimo iteratora i sortList niz

        Iterator<Integer> it = treeMap.keySet().iterator();
        ArrayList<Integer> sortedList = new ArrayList<>();
        while(it.hasNext()){
            int key = it.next();
            int val = treeMap.get(key);
            for(int i =0; i<val; i++){
                sortedList.add(key);
            }
        }
        System.out.println("Nesortiran niz: " + list);
        System.out.println("Sortiran niz: " + sortedList);
    }



}
