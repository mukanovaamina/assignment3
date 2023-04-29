import java.util.NoSuchElementException; //necessary exception

public class MyArrayListQueue<E> {
    private MyArrayList<E> list;

    public MyArrayListQueue() {
        list = new MyArrayList<>(); //instance variable
    }
    public void enqueue(E element) { //method is to add an element to the back of the queue
        list.add(element);
    }

}