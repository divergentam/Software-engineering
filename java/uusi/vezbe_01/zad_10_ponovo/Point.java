package uusi.vezbe_01.zad_10_ponovo;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

public class Point<T extends Number> extends IMeasure {
    // ako kaze da su dve tacke jednake  onda treba

    @Getter @Setter
    public T x;
    @Getter @Setter
    public T y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point<T> point = (Point<T>) o;
        return this.getMeasure() == (point.getMeasure());
    }

    @Override
    public int hashCode() {
        int hash = 19;
        hash += hash + Objects.hashCode(x);
        hash += hash + Objects.hashCode(y);
        return hash;
    }

    @Override
    public double getMeasure() {
        return Math.sqrt(x.doubleValue() * x.doubleValue() + y.doubleValue() * y.doubleValue());
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ')';
    }
}
