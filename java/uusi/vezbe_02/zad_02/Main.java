package uusi.vezbe_02.zad_02;

public class Main {
    public static void main(String[] args) {
        MyQueue<Integer> queue  = new MyQueue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println("red.dequeue: " + queue.dequeue());
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("red.dequeue: " + queue.dequeue());
        System.out.println("red.dequeue: " + queue.dequeue());
        System.out.println("red.dequeue: " + queue.dequeue());
        System.out.println("red.dequeue: " + queue.dequeue());

        System.out.println();


    }
}
