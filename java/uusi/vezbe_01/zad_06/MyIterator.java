/*
package uusi.vezbe_01.zad_06;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

@RequiredArgsConstructor
public class MyIterator<T> implements Iterator<T> {

    private final ArrayList<T> arrayList;
    @Getter
    private int current = 0;

    @Override
    public boolean hasNext() {
        return arrayList.size() > current;
    }

    @Override
    public T next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        T currentEl = arrayList.get(current);
        current += 5;
        return currentEl;
    }
}
*/
