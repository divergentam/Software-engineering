package uusi.vezbe_01.zad_01;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

@RequiredArgsConstructor
public class ArrayIterator implements Iterator<Integer> {

    private final ArrayList<Integer> arrayList;
    private int currentElement = 0;
    //private int sum = 0;

    @Override
    public boolean hasNext() {
        return arrayList.size() > currentElement;
    }

    @Override
    public Integer next() { // get currentElement and set up next element
        if (!hasNext()){
            throw new NoSuchElementException("That element does not exist");
        }
        return arrayList.get(currentElement++);
    }

    /*public int getSum(){
        while(this.hasNext()){
            sum += this.next();
        }
        return sum;
    }*/
}

