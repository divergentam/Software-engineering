package uusi.vezbe_01.zad_07;

import java.util.Iterator;

public class List<T> {
    Node<T> start;

    public List(Node<T> start) {
        this.start = start;
    }

    Iterator<T> iterator(int k){
        return new ListIterator<>(start, k);
    }
}
