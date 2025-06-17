import java.util.*;

public class PriorityQueueExample {
    public static void main(String[] args) {

        // Creating a PriorityQueue of integers (min-heap by default)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding elements using add() and offer()
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.offer(20);  // offer() is similar to add()

        System.out.println("PriorityQueue (min-heap): " + pq);

        // peek() - retrieves head element (but does not remove)
        System.out.println("Peek (head): " + pq.peek());

        // poll() - retrieves and removes head
        System.out.println("Poll (removes head): " + pq.poll());
        System.out.println("After poll(): " + pq);

        // contains()
        System.out.println("Contains 30? " + pq.contains(30));

        // remove() specific element
        pq.remove(30);
        System.out.println("After removing 30: " + pq);

        // size()
        System.out.println("Size: " + pq.size());

        // isEmpty()
        System.out.println("Is empty? " + pq.isEmpty());

        // iterator() - order not guaranteed
        System.out.print("Iterator output: ");
        for (Integer num : pq) {
            System.out.print(num + " ");
        }
        System.out.println();

        // clear()
        pq.clear();
        System.out.println("After clear(): " + pq);

        // Custom comparator (max-heap)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(Arrays.asList(10, 40, 20, 30));

        System.out.println("PriorityQueue (max-heap): " + maxHeap);
        System.out.println("Poll from max-heap: " + maxHeap.poll());
    }
}
