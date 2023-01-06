package uusi.vezbe_01.zad_10;

import lombok.Getter;

public class Point<T extends Number> implements IMeasure {
    @Getter
    private T x;
    @Getter
    private T y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        //udaljenost this tacke (this.x, this.y) od koordinatnog pocetka (0, 0)
        Point<T> other = (Point<T>)obj;
        double d1 = Math.sqrt(Math.pow(this.x.doubleValue(), 2) + Math.pow(this.y.doubleValue(),2));
        double d2 = Math.sqrt(Math.pow(other.x.doubleValue(), 2) + Math.pow(other.y.doubleValue(),2));
        return d1 == d2;
    }


    @Override
    public double getMeasure() {
        return Math.sqrt(Math.pow(this.x.doubleValue(), 2) + Math.pow(this.y.doubleValue(), 2));
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ") -> " + this.getMeasure();
    }

}
