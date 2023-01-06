package uusi.kolokvijumi.kol_02.zad_03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Matrix<T> {
    public int n;
    public int m;
    ArrayList<ArrayList<T>> matrix;

    public Matrix(int n, int m) {
        matrix = new ArrayList<ArrayList<T>>();
        this.n = n;
        this.m = m;
        for(int i = 0; i <n; i++){
            matrix.add(new ArrayList<T>(m));
        }
    }

    public void add(int numList,T el){
        matrix.get(numList).add(el);
    }

    public Iterator<T> iterator(){
        return new MyIterator();
    }

    class MyIterator implements Iterator<T>{
        int current_i;
        int current_j;

        MyIterator(){
            current_i = 0;
            current_j = 0;
        }

        @Override
        public boolean hasNext() {
            return current_i != -1;
        }

        @Override
        public T next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            T temp = matrix.get(current_i).get(current_j);
            if(current_i + 2 >= n || current_j + 2 >= m){
                current_i = -1;
                current_j = -1;
                return temp;
            }
            current_i += 2;
            current_j += 2;
            return temp;
        }
    }

}
