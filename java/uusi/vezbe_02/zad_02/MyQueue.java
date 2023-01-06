package uusi.vezbe_02.zad_02;

import java.util.NoSuchElementException;
import java.util.Stack;

public class MyQueue<T> {
    public Stack<T> stackIn = new Stack<>();
    public Stack<T> queue = new Stack<>();

    public MyQueue(){

    }

    public void enqueue(T el){
        stackIn.push(el);
    }

    public T dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is empty!");
        }
        if(queue.isEmpty()){
            while(!stackIn.isEmpty()){
                queue.push(stackIn.pop());
            }
        }
        return queue.pop();
    }

    public boolean isEmpty(){
        if((stackIn.isEmpty())&&(queue.isEmpty())){
            return true;
        }
        return false;
    }

}
