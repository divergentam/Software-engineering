package uusi.primeri.zad_02;

import uusi.primeri.zad_02.Point;

import java.util.Objects;

public class Triangle<T extends Number> extends IMeasure implements Comparable<Triangle<T>>{
    public Point<T> t1;
    public Point<T> t2;
    public Point<T> t3;

    public Triangle(Point<T> t1, Point<T> t2, Point<T> t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    @Override
    public double getMeasure() {
        double a = t1.distance(t2);
        double b = t2.distance(t3);
        double c = t3.distance(t1);
        return (a + b + c)/3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle<T> triangle = (Triangle<T>) o;
        return this.getMeasure() == triangle.getMeasure();
    }

    @Override
    public int hashCode() {
        int hash = 19;
        hash += hash * Objects.hashCode(t1);
        hash += hash * Objects.hashCode(t2);
        hash += hash * Objects.hashCode(t3);
        return hash;
    }

    @Override
    public String toString() {
        return "Triangle(" + t1 + ", " + t2 + ", " + t3 + ')';
    }

    @Override
    public int compareTo(Triangle<T> triangle) {
        if(this.getMeasure() > triangle.getMeasure()){
            return 1;
        }else if(this.getMeasure() == triangle.getMeasure()){
            return 0;
        }
        return -1;
    }
}
