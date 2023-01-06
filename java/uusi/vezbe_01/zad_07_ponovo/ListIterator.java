package uusi.vezbe_01.zad_07_ponovo;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListIterator<T> implements Iterator<T> {
    Node<T> current;
    int k;

    public ListIterator(Node<T> start, int k) {
        this.current = start;
        this.k = k;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public T next() {
        if(!hasNext()){
            throw new NoSuchElementException("You don't have next element");
        }
        Node<T> temp = current;
        for(int i = 0; i<k && current != null; i++){
            current = current.next;
        }


        return temp.element;
    }
}
