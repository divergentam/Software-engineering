package uusi.vezbe_01.zad_09_ponovo;

import uusi.vezbe_01.zad_08_ponovo.Matrix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Ball {
    ArrayList<ArrayList<Integer>> matrix;
    int n;
    int m;

    public Ball(int n, int m) {
        this.n = n;
        this.m = m;
        matrix = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i<n; i++){
            matrix.add(new ArrayList(m));
        }
    }

    public void add(int numList, int el){
        matrix.get(numList).add(el);
    }

    public int elementAt(int i, int j){
        return matrix.get(i).get(j);
    }

    public Iterator<Integer> iterator(int i0, int j0){
        return new MyIt(i0, j0);
    }

    public class MyIt implements Iterator<Integer>{
        int current_i = -1;
        int current_j = -1;
        int x[] = {0, 1, 0, -1};
        int y[] = {-1, 0, 1, 0};

        MyIt(int i0, int j0){
            if((i0 >= 0) && (i0 < n) && (j0 >= 0) && (j0 < m)){
                current_i = i0;
                current_j = j0;
            }else{
                throw new IndexOutOfBoundsException("The element for index " + i0 + " and " + j0 + " is out of bounds!");
            }

        }

        @Override
        public boolean hasNext() {
            return current_i != -1;
        }

        @Override
        public Integer next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            int temp = matrix.get(current_i).get(current_j);
            int min = matrix.get(current_i).get(current_j);
            int min_i = -1;
            int min_j = -1;

            for(int i = 0; i < 4; i++){
                if(current_i + x[i] >= 0 && current_i + x[i] < n && current_j + y[i] >= 0 && current_j + y[i] < m){
                    if(matrix.get(current_i + x[i]).get(current_j + y[i]) < min){
                        min = matrix.get(current_i + x[i]).get(current_j + y[i]);
                        min_i = current_i + x[i];
                        min_j = current_j + y[i];
                    }
                }
            }
            System.out.print("(" + current_i + ", " + current_j + ")");
            current_i = min_i;
            current_j = min_j;
            return temp;
        }
    }
}
