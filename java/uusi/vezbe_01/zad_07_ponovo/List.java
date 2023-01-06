package uusi.vezbe_01.zad_07_ponovo;

import java.util.Iterator;

public class List<T> {
    Node<T> start;

    public List(Node<T> start) {
        this.start = start;
    }

    public Iterator<T> iterator(int k){
        return new ListIterator<T>(start, k);
    }
}
