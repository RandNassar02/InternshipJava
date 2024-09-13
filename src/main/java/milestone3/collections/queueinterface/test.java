package milestone3.collections.queueinterface;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
public class test {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add("First");
        queue.add("Second");
        queue.add("Third");

        // Removing elements from the queue
        System.out.println(queue.remove()); // Output: First
        System.out.println(queue.remove()); // Output: Second
        System.out.println(queue.remove()); // Output: Third
        System.out.println(queue.remove()); // Output: Third

        // Attempting to remove from an empty queue
        try {
            System.out.println(queue.remove()); // Throws NoSuchElementException
        } catch (NoSuchElementException e) {
            System.out.println("Queue is empty, cannot remove element.");
        }
    }
}
