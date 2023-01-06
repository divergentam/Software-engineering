package uusi.vezbe_01.zad_07_ponovo;

public class Node<T> {
    T element;
    Node<T> next;

    public Node(T element, Node<T> next) {
        this.element = element;
        this.next = next;
    }
}
