package uusi.vezbe_01.zad_11;

import lombok.Getter;
import uusi.vezbe_01.zad_10.Point;

import java.util.Objects;

public class Rectangle {
    Point<Integer> point1;
    Point<Integer> point2;
    @Getter
    int width,height;

    public Rectangle(Point<Integer> point1, Point<Integer> point2) {
        if(point2.getX() < point1.getX() || point2.getY() < point1.getY()){
            throw new IndexOutOfBoundsException("This is not a good coordinate, first parametar is for left top point and second for right bottom");
        }
        this.point1 = point1;
        this.point2 = point2;
        this.width = point2.getY() - point1.getY();
        this.height = point2.getX() - point1.getX();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return this.width == rectangle.width && this.height == rectangle.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "Rectangle[ " +
                "width=" + width +
                ", height=" + height +
                " point1=(" + point1.getX() + ", " + point1.getY() + ") point2=("
                + point2.getX() + ", " + point2.getY() + ") ]";
    }
}
