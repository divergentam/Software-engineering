package uusi.vezbe_01.zad_08;

import java.util.ArrayList;
import java.util.Iterator;

public class MatrixIterator implements Iterator<Integer> {
    ArrayList<ArrayList<Integer>> matrix;
    int current_i = -1, current_j = -1; // in case that all el are zero

    int n, m;

    public MatrixIterator(ArrayList<ArrayList<Integer>> matrix) {
        this.matrix = matrix;
        n = matrix.size();
        m = matrix.get(0).size();
        boolean found = false;
        for(int i = 0; i < n && !found; i++){
            for(int j = 0; j < m; j++){
                if(matrix.get(i).get(j) != 0){
                    current_i = i;
                    current_j = j;
                    found = true;
                    break;
                }
            }
        }
    }

    @Override
    public boolean hasNext() {
        return (current_i != -1);
    }

    @Override
    public Integer next() {
        int temp = matrix.get(current_i).get(current_j);
        if((current_i == n - 1) && (current_j == m - 1)){
            current_i = -1;
            return temp;
        }
        int d = n - 1 - current_i + m - 1 - current_j; // rastojanje od najudaljenijeg polja - mat[n-1][m-1]
        for(int p = 1 ; p < d; p++){ // zato sto se krecemo po dijagonali odnosno prvo posmatramo sva polja na udaljenosti 1 od trenutnog polja, pa onda sva polja na udaljenosti 2 ... do udaljenosti d
            for(int k = 0; k < p; k++){ // k nam ide o  do p da bi proverravali sve el na dijagonali
                if((current_i + k <= n - 1) && (current_j + p - k <= m - 1)){
                    if(matrix.get(current_i + k).get(current_j + p - k) != 0){
                        current_i = current_i + k;
                        current_j = current_j + p - k;
                        return temp;
                    }
                } else if((current_i + k <= n - 1) && (current_j + p - k - 1 <= m - 1)){ // u slucaju kada ne vazi prethodni uslov to znaci da neki od indexa izxlazi van granica ukoliko vazi: current_j + p - k - 1 <= m - 1 to znaci da je moguce da idemo samo dole, jer desno element ne postoji!!!!!!!!!!!!
                    if(matrix.get(current_i + k + 1).get(current_j + p - k - 1) != 0) {
                        current_i = current_i + k + 1;
                        current_j = current_j + p - k - 1;
                        return temp;
                    }
                }
            }
        }
        // nije vratio temp
        current_i = -1;
        return temp;
    }
}
