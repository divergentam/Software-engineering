package uusi.vezbe_03_cpp.zad_09_sorted_set;

import java.util.Objects;

/* kada pravimo svoje klase u javi
    moramo da implementiramo equals i hash code, a za sortiranje nam je potreban i compareTo

  */
public class Pair implements Comparable<Pair>{
    public int x;
    public int y;
    public Pair(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair pair = (Pair) o;
        return Objects.equals(x, pair.x) && Objects.equals(y, pair.y);
    }

    @Override
    public int hashCode() {
        int hash = 13;
        hash = hash * 19 + Objects.hashCode(x);
        hash = hash * 19 + Objects.hashCode(y);
        return hash;
    }

    @Override
    public int compareTo(Pair other) {
        if(this.x > other.x){
            return -1;
        }
        if((this.x == other.x) && (this.y > other.y)){
            return -1;
        }
        if(this.x < other.x){
            return 1;
        }
        if((this.x == other.x) && (this.y < other.y)){
            return 1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Pair(" + x + ", " + y + ')';
    }
}
