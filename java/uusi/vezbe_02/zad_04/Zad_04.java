package uusi.vezbe_02.zad_04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Zad_04 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\III god\\Uvod u softversko inzinjerstvo\\vezbe\\src\\main\\java\\uusi\\vezbe_02\\zad_04\\zad_04.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<Integer> listEl = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        while(scanner.hasNext()){
            int num = scanner.nextInt();
            listEl.add(num);
            if(map.containsKey(num)){
                int val = map.get(num);
                map.put(num, val+1);
                list.add(val+1);
            }else{
                list.add(1);
                map.put(num, 1);
            }
        }


        System.out.println(map);

        for(int i = 0; i< list.size(); i++){
            System.out.print(listEl.get(i));
            System.out.print("[" + list.get(i) + "]");
        }


    }
}
