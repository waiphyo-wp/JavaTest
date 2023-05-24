package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.function.Consumer;

public class QueueInterface {
    public static void main(String[] args) {

        // create queue object
        var list = new LinkedList<String>();
        Queue<String> queue = list;
        
        // queue methods
        // insert
        queue.add("Java");
        queue.add("C#");
        queue.add("PHP");

        System.out.println(queue); // [Java, C#, PHP]
        System.out.println(list); // [Java, C#, PHP]

        queue.offer("Spring");
        queue.offer("C#Every");
        queue.offer("Laravel");

        System.out.println(queue); // [Java, C#, PHP, Spring, C#Every, Laravel]
        System.out.println(list); // [Java, C#, PHP, Spring, C#Every, Laravel]

        // Remove > first in first out
        queue.remove(); // Java
        queue.poll(); // C#
        System.out.println(queue); // [PHP, Spring, C#Every, Laravel]

        queue.clear(); // []
        System.out.println(queue); // []

        // queue.remove(); // java.util.NoSuchElementException
        queue.poll(); // []
        
        queue.add("hello");
        queue.add("java");
        queue.add("hello");
        System.out.println(queue); // [hello , java, hello]

        // Examine > check next element have or not
        System.out.println(queue.element()); // hello
        System.out.println(queue.peek()); // hello

        queue.clear(); // []
        System.out.println(queue); // []

        try {
            System.out.println(queue.element()); // java.util.NoSuchElementException
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("NosuchExlementException");
        }
        System.out.println(queue.peek()); // null

        // call queue iteration
        Queue<String> queue3 = new ArrayDeque<>(List.of("JAVA", "PHP", "RUBY", "Laravel"));

        QueueInterface.internalLoop(queue3);
        QueueInterface.externalForLoop(queue3);
        QueueInterface.externalWhileLoop(queue3, false);

    }

    // Queue Iteration
    // internal loop
    public static void internalLoop(Queue<String> queue) {
        queue.forEach(new Consumer<>() {
            public void accept(String str) {
                System.out.println(str);
            }
        });
    }

    // external for loop
    public static void externalForLoop(Queue<String> queue) {
        for (var str : queue) {
            System.out.println(str);
        }
    }

    // external while loop
    public static void externalWhileLoop(Queue<String> queue , boolean firstEnd) {

        // change Queue Object to Deque Object
        Deque<String> deque = new ArrayDeque<>(queue);

        while (!deque.isEmpty()) {
            if (firstEnd) {
                System.out.println(deque.pollFirst()); // from first element remove
            } else {
                System.out.println(deque.pollLast());
            }
        }

        System.out.println(deque);

    }

}
