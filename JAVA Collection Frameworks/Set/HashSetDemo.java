import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        // 1. Create HashSet
        HashSet<String> fruits = new HashSet<>();

        // 2. Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        // 3. Add duplicate element (will be ignored)
        fruits.add("Apple");

        // 4. Display HashSet (unordered, unique)
        System.out.println("Fruits Set: " + fruits);

        // 5. Check size
        System.out.println("Size: " + fruits.size());

        // 6. Check if element exists
        System.out.println("Contains Mango? " + fruits.contains("Mango"));
        System.out.println("Contains Grapes? " + fruits.contains("Grapes"));

        // 7. Remove element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // 8. Iterate using for-each loop
        System.out.print("Iterating with for-each: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 9. Iterate using Iterator
        System.out.print("Iterating with Iterator: ");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 10. Clone HashSet
        HashSet<String> clonedSet = (HashSet<String>) fruits.clone();
        System.out.println("Cloned Set: " + clonedSet);

        // 11. Convert to array
        Object[] fruitArray = fruits.toArray();
        System.out.println("Array: " + Arrays.toString(fruitArray));

        // 12. Check if set is empty
        System.out.println("Is empty? " + fruits.isEmpty());

        // 13. Clear set
        HashSet<String> tempSet = new HashSet<>(fruits);
        tempSet.clear();
        System.out.println("After clear(): " + tempSet);

        // 14. Bulk operations: addAll, retainAll, removeAll
        HashSet<String> tropical = new HashSet<>(Arrays.asList("Mango", "Pineapple", "Guava"));
        HashSet<String> exotic = new HashSet<>(Arrays.asList("Dragonfruit", "Guava", "Mango"));

        // Union
        HashSet<String> union = new HashSet<>(tropical);
        union.addAll(exotic);
        System.out.println("Union: " + union);

        // Intersection
        HashSet<String> intersection = new HashSet<>(tropical);
        intersection.retainAll(exotic);
        System.out.println("Intersection: " + intersection);

        // Difference
        HashSet<String> difference = new HashSet<>(tropical);
        difference.removeAll(exotic);
        System.out.println("Difference (tropical - exotic): " + difference);
    }
}
