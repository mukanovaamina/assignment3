import java.util.EmptyStackException; //necessary exception
import MyArrayList;

public class MyArrayListStack<E> {
    private MyArrayList<E> list; // instance variable of type MyArrayList

    public MyArrayListStack() {
        list = new MyArrayList<>(); // instance variable
    }
    public void push(E element) { //push method that add element
        list.add(element);
    }


}