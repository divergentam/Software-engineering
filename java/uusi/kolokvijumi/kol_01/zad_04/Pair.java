package uusi.kolokvijumi.kol_01.zad_04;

import java.util.Objects;

public class Pair{
    public int x;
    public int y;

    public Pair(int x, int y) {
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
    public String toString() {
        return "Pair(" + x + ", " + y + ')';
    }
}
