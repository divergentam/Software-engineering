package uusi.vezbe_02.zad_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.KeyPair;
import java.util.*;

public class Cinema {
    HashMap<String, HashMap<String,Integer>> map;
    HashMap<String, Integer> userMap;
    private Scanner scanner = null;
    TreeMap<String, Double> treeMap;
    String user;

    public Cinema(File file){
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        map = new HashMap<String, HashMap<String, Integer>>();
        // pamtimo tako sto je svaki korisnik kljuc u hashmap-i
        // za svakog korisnika value bi bila hashmapa koja pamti filmove koje je korisnik ocenio

        while(scanner.hasNext()){
            String username = scanner.nextLine();
            String movie = scanner.nextLine();
            int mark = Integer.parseInt(scanner.nextLine()); // mora parsiranje
            scanner.nextLine();
            if(!map.containsKey(username)){
                map.put(username, new HashMap<String,Integer>());
            }
            // u ovom slucaju korisnika dodajemo samo ako ne postoji
            // ako korisnik postoji onda je za njega vec napravljena njegova mapa
            // u oba slucaja uzimamo mapu korisnika i dodajemo u nju novo-ucitani film i ocenu
            HashMap<String,Integer> userMap = map.get(username); // ovo nam daje mapu za korisnika
            userMap.put(movie, mark);
        }
    }


    // Zadatak1.
    // Za uneto korisniko ime treba da izbaci spisak svih filmova koje je taj korisnik ocenio i prosecnu ocenu koju je dao.

    public double zadatak1(String user){
        double sum = 0.0;
        int numOfMovies = 0;
        double averageMark = 0;

        userMap = map.get(user); // ovo nam daje mapu za korisnika
        ArrayList<String> allMoviesForUser = new ArrayList<>();

        Iterator<String> userIt = userMap.keySet().iterator(); // iteriramo kljucevima(filmovima) mape korisnika
        while(userIt.hasNext()){
            String keyMovie = userIt.next(); // to bi bio kljuc jer iteriramo kljucevima - filmovima
            int valueMark = userMap.get(keyMovie); // ovo bi bila ocena za film key
            allMoviesForUser.add(keyMovie);
            numOfMovies++;
            sum += valueMark;
        }
        averageMark = sum/numOfMovies;
        System.out.println("List of all movies for " + user + " is: " + allMoviesForUser);

        return averageMark;
    }

    // Zadatak2.
    // Za unet naziv filma program treba da odstampa spisak svih korisnika i prosecnu ocenu koju je dobio taj film.

    public double zadatak2(String movie){
        // ocene nalazimo u userMap-u
        //korisnike nalazimo
        Iterator<String> mapIt = map.keySet().iterator(); // iterira kroz user-e
        double sum = 0.0;
        int numOfUsersThatWatchedMovie = 0;
        ArrayList<String> allUsersForMovie = new ArrayList<>();
        double averageMark = 0.0;


        while(mapIt.hasNext()){
            user = mapIt.next();
            userMap = map.get(user); // mapa za korisnika
            if(userMap.containsKey(movie)){
                numOfUsersThatWatchedMovie++;
                sum+= userMap.get(movie);
                allUsersForMovie.add(user);
            }
        }
        averageMark = sum/numOfUsersThatWatchedMovie;
        System.out.println("List of all users that watched and marked " + movie + " is: " + allUsersForMovie);

        return averageMark;
    }


    //Zadatak3.
    //Za unetu komandu "top10" treba da izbaci 10 ili manje filmova koji su dobili najvecu prosecnu ocenu.


    public TreeMap<Double, TreeSet<String>> top10(){

        TreeMap<Double, TreeSet<String>> treeMap = new TreeMap<>();
        Iterator<String> mapIt = map.keySet().iterator(); //iteraor krozs korisnike

        while(mapIt.hasNext()){
            user = mapIt.next();
            userMap = map.get(user); // mapa korisnika
            Iterator<String> userIt = userMap.keySet().iterator(); // iterator kroz filmove
            while(userIt.hasNext()){
                String keyMovie = userIt.next();
                Double mark = zadatak2(keyMovie);
                if(!treeMap.containsKey(mark)){
                    treeMap.put(mark, new TreeSet<String>());
                }
                if(!treeMap.get(mark).contains(keyMovie)){
                    treeMap.get(mark).add(keyMovie);
                }
            }
        }

/*
        TreeMap sortedMap = valueSort(treeMap);
*/

        return treeMap;
    }

    public static <K, V extends Comparable<V> > TreeMap<K, V>
    valueSort(final TreeMap<K, V> map)
    {
        // Static Method with return type Map and
        // extending comparator class which compares values
        // associated with two keys
        Comparator<K> valueComparator = new Comparator<K>() {

            // return comparison results of values of
            // two keys
            public int compare(K k1, K k2)
            {
                int comp = map.get(k2).compareTo(
                        map.get(k1));
                if (comp == 0)
                    return 1;
                else
                    return comp;
            }
        };

        // SortedMap created using the comparator
        TreeMap<K, V> sorted = new TreeMap<K, V>(valueComparator);
        sorted.putAll(map);
        return sorted;
    }

}
