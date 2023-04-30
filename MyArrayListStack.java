import java.util.EmptyStackException; //necessary exception
import java.util.NoSuchElementException;

public class MyArrayListStack<E> {
    private MyArrayList<E> list; // instance variable of type MyArrayList

    public MyArrayListStack() {
        list = new MyArrayList<>(); // instance variable
    }
    public void push(E element) { //push method that add element
        list.add(element);
    }

    public E pop() { //method is to remove and return the top element of a stack
        if (list.isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return list.remove(list.size() - 1);
    }

    public E peek() { // method that return the top element of the stack without removing it
        if (list.isEmpty()) {
            throw new EmptyStackException();
        }
        return list.get(list.size() - 1);
    }

    public boolean isEmpty() { //method is to check if the stack is empty
        return list.isEmpty();
    }

    public int size() { //method is to return the number of elements in the stack
        return list.size();
    }

}