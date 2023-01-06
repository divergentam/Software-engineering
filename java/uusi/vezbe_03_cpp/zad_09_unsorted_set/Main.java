package uusi.vezbe_03_cpp.zad_09_unsorted_set;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    /*Zadatak 9. Ucitavati parove brojeva sve dok se ne pojavi vec ucitani par ili je ucitano m
    brojeva. Koristiti uredjeni i neuredjeni skup.
    * */
    public static void main(String[] args) throws FileNotFoundException {
        HashSet<Pair> set = new LinkedHashSet<>(); // LinkedHashSet - insertion sort
        File file = new File("D:\\III god\\Uvod u softversko inzinjerstvo\\vezbe_java\\src\\main\\java\\uusi\\vezbe_03_cpp\\zad_09_sorted_set\\zad_09_sorted_set.txt");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNext()){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Pair pair = new Pair(x,y);
            if(!(set.contains(pair))){
                set.add(pair);
            }
            else{
                System.out.println("Nije moguce dodati element koji vec postoji u skupu");
                break;
            }
        }

        Iterator<Pair> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
