package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterface {
    public static void main(String[] args) {
        // create deque > fifo, lilo
        Deque<String> deque = new ArrayDeque<>();
        // deque methods > also use queue methods in deque
        // Insert
        deque.add("Java");
        deque.addFirst("Spring");
        deque.addLast("Angular");
        deque.offerFirst("HTML");
        deque.offerLast("CSS");
        System.out.println(deque); // [HTML, Spring, Java, Angular, CSS]
        
        // examine
        System.out.println(deque.getFirst()); // HTML
        System.out.println(deque.getLast()); // CSS
        System.out.println(deque.peekFirst()); // HTML
        System.out.println(deque.peekLast()); // CSS

        // Remove
        deque.removeFirst();
        deque.removeLast();
        deque.pollFirst();
        deque.pollLast();
        System.out.println(deque);// [Java]

        System.out.println(deque.contains("Java")); // true

        // Stack Methods
        deque.push("Spring");
        System.out.println(deque); // [Spring, Java]
        deque.pop();
        System.out.println(deque); // [Java]
        System.out.println(deque.peek()); // Java

    }
}
