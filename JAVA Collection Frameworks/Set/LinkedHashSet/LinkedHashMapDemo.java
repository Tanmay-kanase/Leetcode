import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // 1. Create LinkedHashMap (preserves insertion order)
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();

        // 2. Add key-value pairs
        lhm.put(101, "Alice");
        lhm.put(102, "Bob");
        lhm.put(103, "Charlie");
        lhm.put(104, "David");

        // 3. Duplicate key (updates value)
        lhm.put(103, "Chris");

        // 4. Print full map
        System.out.println("Original LinkedHashMap: " + lhm);

        // 5. Access a value
        System.out.println("Value for key 102: " + lhm.get(102));

        // 6. Check existence
        System.out.println("Contains key 101? " + lhm.containsKey(101));
        System.out.println("Contains value 'Eve'? " + lhm.containsValue("Eve"));

        // 7. Remove a key
        lhm.remove(104);
        System.out.println("After removing key 104: " + lhm);

        // 8. Iterate over entries (preserves insertion order)
        System.out.println("\nIterating using entrySet():");
        for (Map.Entry<Integer, String> entry : lhm.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // 9. Iterate over keys and values separately
        System.out.println("\nKeys: " + lhm.keySet());
        System.out.println("Values: " + lhm.values());

        // 10. Size and isEmpty
        System.out.println("Size: " + lhm.size());
        System.out.println("Is empty? " + lhm.isEmpty());

        // 11. Replace value for a key
        lhm.replace(102, "Brian");
        System.out.println("After replacing key 102: " + lhm);

        // 12. PutIfAbsent
        lhm.putIfAbsent(105, "Eve");
        lhm.putIfAbsent(101, "Alex"); // Won't replace
        System.out.println("After putIfAbsent: " + lhm);

        // 13. Clear map
        LinkedHashMap<String, Integer> temp = new LinkedHashMap<>();
        temp.put("A", 1);
        temp.put("B", 2);
        System.out.println("\nBefore clear: " + temp);
        temp.clear();
        System.out.println("After clear: " + temp);

        // 14. Clone (deep copy via constructor)
        LinkedHashMap<Integer, String> clone = new LinkedHashMap<>(lhm);
        System.out.println("Cloned Map: " + clone);

        // 15. Convert keys/values to arrays
        System.out.println("Keys Array: " + Arrays.toString(lhm.keySet().toArray()));
        System.out.println("Values Array: " + Arrays.toString(lhm.values().toArray()));

        // 16. Access in insertion order (confirm order preservation)
        System.out.println("\nInsertion Order Check:");
        lhm.forEach((k, v) -> System.out.println(k + " => " + v));
    }
}
