import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {

        // Creating a TreeSet
        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements
        numbers.add(50);
        numbers.add(20);
        numbers.add(10);
        numbers.add(40);
        numbers.add(30);
        numbers.add(20); // Duplicate, will be ignored

        System.out.println("TreeSet (Sorted): " + numbers); // Ascending by default

        // size()
        System.out.println("Size: " + numbers.size());

        // contains()
        System.out.println("Contains 30? " + numbers.contains(30));
        System.out.println("Contains 100? " + numbers.contains(100));

        // remove()
        numbers.remove(40);
        System.out.println("After removing 40: " + numbers);

        // first() and last()
        System.out.println("First (lowest): " + numbers.first());
        System.out.println("Last (highest): " + numbers.last());

        // ceiling() and floor()
        System.out.println("Ceiling of 25: " + numbers.ceiling(25)); // ≥ 25
        System.out.println("Floor of 25: " + numbers.floor(25));     // ≤ 25

        // higher() and lower()
        System.out.println("Higher than 20: " + numbers.higher(20)); // > 20
        System.out.println("Lower than 20: " + numbers.lower(20));   // < 20

        // headSet(), tailSet(), subSet()
        System.out.println("HeadSet(<30): " + numbers.headSet(30));  // < 30
        System.out.println("TailSet(30): " + numbers.tailSet(30));   // ≥ 30
        System.out.println("SubSet(10, 40): " + numbers.subSet(10, 40)); // [10, 40)

        // descendingSet()
        System.out.println("Descending: " + numbers.descendingSet());

        // iterator()
        System.out.print("Iterator (ascending): ");
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // descendingIterator()
        System.out.print("Descending Iterator: ");
        Iterator<Integer> descIt = numbers.descendingIterator();
        while (descIt.hasNext()) {
            System.out.print(descIt.next() + " ");
        }
        System.out.println();

        // clear()
        numbers.clear();
        System.out.println("After clear(): " + numbers);
        System.out.println("Is empty? " + numbers.isEmpty());
    }
}
