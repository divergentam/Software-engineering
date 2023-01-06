package uusi.vezbe_01.zad_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArray<T> {
    private ArrayList<T> array;
    public MyArray(){
        array = new ArrayList<T>();
    }
    public MyArray(int n){
        array = new ArrayList<T>(n);
    }
    public void add(T el){
        array.add(el);
    }
    public int size(){
        return array.size();
    }
    public T at(int index){
        return array.get(index);
    }
    public Iterator<T> iterator(){
        return new MyIterator();
    }


    public class MyIterator implements Iterator<T> {
        int current_index; //index trenutnog el

        public MyIterator() {
            current_index = 0;
        }

        @Override
        public boolean hasNext() {
            return current_index < array.size();
        }

        @Override
        public T next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            int temp = current_index;
            current_index++;
            return array.get(temp);
        }

    }
}
