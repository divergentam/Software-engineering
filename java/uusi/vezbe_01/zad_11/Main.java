package uusi.vezbe_01.zad_11;

import uusi.vezbe_01.zad_10.Point;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //final InputStream is = StreamDemo.class.getClassLoader().getResourceAsStream("brojevi.txt"); ako se nalazi u resources
        Scanner scanner = new Scanner(new File("src/in.txt"));

        HashSet<Rectangle> hashSet = new HashSet<Rectangle>();
        while(scanner.hasNext()){
            Rectangle rectangle = new Rectangle(new Point<Integer>(scanner.nextInt(),
                    scanner.nextInt()), new Point<Integer>(scanner.nextInt(), scanner.nextInt()));
            if(!hashSet.contains(rectangle)){
                hashSet.add(rectangle);
            }else{
                break;
            }
        }

        Iterator<Rectangle> iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
