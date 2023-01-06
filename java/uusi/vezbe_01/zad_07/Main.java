package uusi.vezbe_01.zad_07;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Node<Integer> n13 = new Node<>(13, null);
        Node<Integer> n12 = new Node<>(12, n13);
        Node<Integer> n11 = new Node<>(11, n12);
        Node<Integer> n10 = new Node<>(10, n11);
        Node<Integer> n9 = new Node<>(9, n10);
        Node<Integer> n8 = new Node<>(8, n9);
        Node<Integer> n7 = new Node<>(7, n8);
        Node<Integer> n6 = new Node<>(6, n7);
        Node<Integer> n5 = new Node<>(5, n6);
        Node<Integer> n4 = new Node<>(4, n5);
        Node<Integer> n3 = new Node<>(3, n4);
        Node<Integer> n2 = new Node<>(2, n3);
        Node<Integer> n1 = new Node<>(1, n2);
        List<Integer> list = new List<Integer>(n1);

        Iterator<Integer> iterator = list.iterator(3);

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
