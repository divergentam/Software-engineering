package uusi.kolokvijumi.kol_01.zad_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Array<T extends Number> {
    ArrayList<T> array;
    public Array() {
        array = new ArrayList<T>();
    }
    public void addEl(T el){
        array.add(el);
    }
    public Iterator<T> iterator(int k){
        return new MyIterator(k);
    }

    public class MyIterator implements Iterator<T> {
        int current;
        T max;

        public MyIterator(int k) {
            this.current = k;
            max = array.get(k);
        }

        @Override
        public boolean hasNext() {
            return current != -1;
        }

        @Override
        public T next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            T temp = array.get(current);
            if(current + 2 > array.size() - 1){
                current = -1;
                return temp;
            }
            else if(array.get(current).doubleValue() > max.doubleValue()){
                current = -1;
                return temp;
            }
            // ako nije do sad vratio temp onda ni index ne prelazi granice niti je current + 2 el veci ok current
            //onda menjamo current u current + 2
            current +=2;
            return temp;
        }
    }
}
