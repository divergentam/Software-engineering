package uusi.vezbe_01.zad_03;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;


public class MatrixIterator implements Iterator<Integer> {

    private ArrayList<ArrayList<Integer>> matrix;


    @Getter
    private int current_i = 0;
    @Getter
    private int current_j = 0;

    public MatrixIterator(ArrayList<ArrayList<Integer>> matrix) {
        this.matrix = matrix;
    }

    @Override
    public boolean hasNext() {
        return (current_i != -1) && (current_j != -1);
    }

    @Override
    public Integer next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        ArrayList<Integer> list = matrix.get(current_i);
        int temp = matrix.get(current_i).get(current_j);

        if((current_i == matrix.size() -1) && (current_j == list.size() - 1)){
            current_i = -1;
            return temp;
        }
        if(list.size() - 1 > current_j){ // ako to vazi mozemo da idemo desno u listi, tacnije imamo jos elemenata za iteraciju
            current_j++;
        }else {
            current_i++;
            current_j = 0;
        }
        return temp;
    }
}
