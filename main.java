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
        System.out.println("Size of the stack: " + stack.size());

        // Peek at the front element of the queue
        System.out.println("Front element of the queue: " + queue.peek());

        // Peek at the front element of the stack
        System.out.println("Front element of the stack: " + stack.peek());

        // Dequeue and print all elements in the queue
        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }

        // Try to dequeue from an empty queue
        try {
            queue.dequeue();
        } catch (NoSuchElementException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // testing isEmpty method
        System.out.println("Stack is empty: " + stack.isEmpty());

        // testing pop method
        System.out.println("Popped element of stack: " + stack.pop());
        System.out.println("Popped element of stack: " + stack.pop());

        // testing pop method on empty stack
        System.out.println("Popped element of stack: " + stack.pop()); // throws NoSuchElementException











    }
}
