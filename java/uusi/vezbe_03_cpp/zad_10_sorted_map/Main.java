package uusi.vezbe_03_cpp.zad_10_sorted_map;

import uusi.vezbe_03_cpp.zad_09_sorted_set.Pair;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        TreeMap<Triangle, Integer> map = new TreeMap<>();
        File file = new File("D:\\III god\\Uvod u softversko inzinjerstvo\\vezbe_java\\src\\main\\java\\uusi\\vezbe_03_cpp\\zad_10_sorted_map\\zad_10_sorted_map.txt");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNext()){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            Triangle triangle = new Triangle(x,y,z);
            if(!(map.containsKey(triangle))){
                map.put(triangle,1);
            }
            else{
                int val = map.get(triangle);
                map.put(triangle, val+1);
            }
        }
        Iterator<Triangle> it = map.keySet().iterator();
        while(it.hasNext()){
            Triangle triangle = it.next();
            System.out.println( triangle + " => " + map.get(triangle));
        }
    }
}
