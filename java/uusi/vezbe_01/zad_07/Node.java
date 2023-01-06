package uusi.vezbe_01.zad_07;

public class Node<T> {
    T element;
    Node<T> next; // kad nema sledeceg cvora onda je sledeci = null

    public Node(T element, Node<T> next) {
        this.element = element;
        this.next = next;
    }
}
