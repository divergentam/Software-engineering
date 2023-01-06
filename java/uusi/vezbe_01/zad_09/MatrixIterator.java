package uusi.vezbe_01.zad_09;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MatrixIterator implements Iterator<Integer> {
    ArrayList<ArrayList<Integer>> matrix;
    int current_i;
    int current_j;
    int[] movement_x = {-1, 0, 1, 0};
    int[] movement_y = {0, 1, 0, -1};

    public MatrixIterator(int i0, int j0, ArrayList<ArrayList<Integer>>matrix) {
        current_i = i0;
        current_j = j0;
        this.matrix = matrix;
    }

    @Override
    public boolean hasNext() {
        return (current_i != -1 && current_j != -1);
    }

    @Override
    public Integer next() {
        int n = matrix.size();
        int m = matrix.get(0).size();
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        int min = matrix.get(current_i).get(current_j);
        int min_i = -1;
        int min_j = -1;

        for(int i = 0; i<4; i++){
            if(current_i + movement_x[i] < n && current_i + movement_x[i] >= 0 && current_j + movement_y[i] < m && current_j + movement_y[i] >= 0){
                if(matrix.get(current_i + movement_x[i]).get(current_j + movement_y[i]) < min){
                    min = matrix.get(current_i + movement_x[i]).get(current_j + movement_y[i]);
                    min_i = current_i + movement_x[i];
                    min_j = current_j + movement_y[i];
                }
            }
        }
        int temp= matrix.get(current_i).get(current_j);
        System.out.println(temp + "(" + current_i + ", " + current_j + ")");
        current_i = min_i;
        current_j = min_j;
        return temp;
    }
}
