package uusi.vezbe_02.zad_03;

import java.io.File;
import java.io.FileNotFoundException;

public class Zad_03 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/podaci.dat");
        Cinema cinema = new Cinema(file);

        System.out.println("Average mark is: " + cinema.zadatak1("user1"));
        System.out.println("Average mark for movie is: " + cinema.zadatak2("movie2"));

        System.out.println(cinema.top10());









    }



}
