import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeExample {
    public static void main(String[] args) {

        // Create an ArrayDeque
        Deque<String> deque = new ArrayDeque<>();

        // Add elements to the deque (queue behavior)
        deque.add("Apple"); // addLast
        deque.addFirst("Banana"); // add to front
        deque.addLast("Cherry"); // add to back
        deque.offer("Date"); // addLast, returns boolean
        deque.offerFirst("Elderberry");
        deque.offerLast("Fig");

        // Display current deque
        System.out.println("Initial deque: " + deque);

        // Peek methods (do not remove)
        System.out.println("Peek: " + deque.peek()); // front
        System.out.println("PeekFirst: " + deque.peekFirst()); // front
        System.out.println("PeekLast: " + deque.peekLast()); // back

        // Poll and remove methods (remove and return)
        System.out.println("Poll: " + deque.poll()); // front
        System.out.println("PollFirst: " + deque.pollFirst()); // front
        System.out.println("PollLast: " + deque.pollLast()); // back
        System.out.println("Remove: " + deque.remove()); // front
        System.out.println("RemoveFirst: " + deque.removeFirst());// front
        System.out.println("RemoveLast: " + deque.removeLast()); // back

        // Add again for demonstration
        deque.add("Grape");
        deque.push("Honeydew"); // Push onto front (stack behavior)

        System.out.println("\nAfter push and add: " + deque);

        // Pop (stack behavior: LIFO)
        System.out.println("Popped: " + deque.pop());

        // Check if deque contains an element
        System.out.println("Contains 'Grape'? " + deque.contains("Grape"));

        // Size and isEmpty
        System.out.println("Size: " + deque.size());
        System.out.println("Is empty? " + deque.isEmpty());

        // Iterate using for-each
        System.out.println("\nIterating using for-each:");
        for (String fruit : deque) {
            System.out.println(fruit);
        }

        // Iterate using iterator
        System.out.println("\nIterating using iterator:");
        Iterator<String> it = deque.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Clear deque
        deque.clear();
        System.out.println("\nDeque after clear(): " + deque);
    }
}
