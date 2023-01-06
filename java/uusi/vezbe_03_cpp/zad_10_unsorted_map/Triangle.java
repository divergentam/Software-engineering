package uusi.vezbe_03_cpp.zad_10_unsorted_map;

import java.util.Objects;

public class Triangle implements Comparable<Triangle> {
    public int a;
    public int b;
    public int c;
    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return a == triangle.a && b == triangle.b && c == triangle.c;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash = hash * 19 + Objects.hashCode(a);
        hash = hash * 19 + Objects.hashCode(b);
        hash = hash * 19 + Objects.hashCode(c);
        return hash;
    }

    @Override
    public String toString() {
        return "Triangle(" + a + ", " + b + ", " + c + ')';
    }

    @Override
    public int compareTo(Triangle other) {
        if(this.a < other.a){
            return -1;
        }
        if(this.a == other. a && this.b < other.b){
            return -1;
        }
        if(this.a == other. a && this.b == other.b && this.c < other.c){
            return -1;
        }
        if(this.a > other.a){
            return 1;
        }
        if(this.a == other.a && this.b > other.b){
            return 1;
        }
        if(this.a == other.a && this.b == other.b && this.c > other.c){
            return 1;
        }
        return 0;
    }
}
