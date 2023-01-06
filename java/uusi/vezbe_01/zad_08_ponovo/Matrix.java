package uusi.vezbe_01.zad_08_ponovo;

import java.util.ArrayList;
import java.util.Iterator;

public class Matrix {
    ArrayList<ArrayList<Integer>> matrix;
    int n;
    int m;

    public Matrix(int n, int m) {
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

    public Iterator<Integer> iterator(){
        return new MyIt();
    }

    public class MyIt implements Iterator<Integer>{
        //pamtimo indexe trenutnog el
        int current_i = -1;
        int current_j = -1;
        // stavljamo ove indexe za slucaj ako su svi elementi matrice nula

        public MyIt(){
            boolean found = false;
            for(int i = 0;i<n && !found; i++){
                for(int j = 0; j<m; j++){
                    if(matrix.get(i).get(j) != 0){
                        current_i = i;
                        current_j = j;
                        found = true;
                        break;
                    }
                }
            }
/*
            System.out.println("start: " + matrix.get(current_j).get(current_j) + " (" + current_i + ", " + current_j + ")");
*/
        }

        @Override
        public boolean hasNext() {
            return current_i != -1;
        }

        @Override
        public Integer next() {
            int temp= matrix.get(current_i).get(current_j);
            if((current_i == n -1) && (current_j == m - 1)){
                current_i = -1;
                return temp;
            }
            int d = n - 1 - current_i + m - 1 - current_j;
            for(int p = 1; p < d; p++){
                for(int k = 0; k < p; k++){
                    // ovo je za iteraciju kroz dijagonalu gde su svi elementi na ratsojanju p
                    if((current_i + k <= n - 1) && (current_j + p - k <= m - 1)){
                        if(matrix.get(current_i + k).get(current_j + p - k) != 0){
                            current_i = current_i + k;
                            current_j = current_j + p - k;
                            return temp;
                        }
                    }
                    else if((current_i + k <= n - 1) && (current_j + p - k - 1 <= m -1)){
                        if(matrix.get(current_i + k + 1).get(current_j + p - k - 1) != 0) { // spustas jednu vrstu dole i vracas jedanu kolonu nazad
                            current_i = current_i + k + 1;
                            current_j = current_j + p - k - 1;
                            return temp;
                        }
                    }
                }
            }
            //ako nismo do sad vratili bilo sta
            current_i = -1;

            return temp;
        }
    }


}
