package uusi.primeri.zad_02;

public class Point<T extends Number> extends IMeasure{
    public T x;
    public T y;

    public Point(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point<T> t2){
        return Math.sqrt(Math.pow(t2.x.doubleValue() -  this.x.doubleValue(), 2) + Math.pow(t2.y.doubleValue() - this.y.doubleValue(), 2));
    }

    @Override
    public double getMeasure() {
        return Math.sqrt(x.doubleValue() * x.doubleValue() + y.doubleValue() * y.doubleValue());
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ')';
    }
}


