import java.util.NoSuchElementException;

public class main {
    public static void main(String[] args) {
        MyArrayListQueue<String> queue = new MyArrayListQueue<>();
        MyArrayListStack<Integer> stack = new MyArrayListStack<>();

        queue.enqueue("straykids");
        queue.enqueue("bts");
        queue.enqueue("blackpink");

        stack.push(10);
        stack.push(20);
        stack.push(20);

        // Print the size of the queue
        System.out.println("Size of the queue: " + queue.size());

        // Print the size of the stack
        System.out.println(stack.size());



    }
}