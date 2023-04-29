import java.util.NoSuchElementException; //necessary exception

public class MyArrayListQueue<E> {
    private MyArrayList<E> list;

    public MyArrayListQueue() {
        list = new MyArrayList<>(); //instance variable
    }
    public void enqueue(E element) { //method is to add an element to the back of the queue
        list.add(element);
    }
    public E dequeue() { //method is to remove and return the front element of the queue
        if (list.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return list.remove(0);
    }

}