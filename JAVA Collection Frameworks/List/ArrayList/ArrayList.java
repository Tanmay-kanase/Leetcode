import java.util.*;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.ArrayList;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // 1. add(E e)
        list.add("Apple");
        list.add("Banana");
        System.out.println("After add: " + list);

        // 2. add(int index, E element)
        list.add(1, "Cherry");
        System.out.println("After add at index: " + list);

        // 3. addAll(Collection<? extends E> c)
        List<String> moreFruits = Arrays.asList("Date", "Elderberry");
        list.addAll(moreFruits);
        System.out.println("After addAll: " + list);

        // 4. addAll(int index, Collection<? extends E> c)
        list.addAll(2, Arrays.asList("Fig", "Grape"));
        System.out.println("After addAll at index: " + list);

        // 5. get(int index)
        System.out.println("Element at index 3: " + list.get(3));

        // 6. isEmpty()
        System.out.println("Is list empty? " + list.isEmpty());

        // 7. lastIndexOf(Object o)
        list.add("Apple"); // duplicate for testing
        System.out.println("Last index of 'Apple': " + list.lastIndexOf("Apple"));

        // 8. toArray()
        Object[] array = list.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // 9. toArray(T[] a)
        String[] strArray = list.toArray(new String[0]);
        System.out.println("String Array: " + Arrays.toString(strArray));

        // 10. clone() (only in ArrayList)
        ArrayList<String> clonedList = (ArrayList<String>) ((ArrayList<String>) list).clone();
        System.out.println("Cloned List: " + clonedList);

        // 11. contains(Object o)
        System.out.println("Contains 'Banana'? " + list.contains("Banana"));

        // 12. indexOf(Object o)
        System.out.println("Index of 'Fig': " + list.indexOf("Fig"));

        // 13. remove(int index)
        list.remove(0);
        System.out.println("After removing index 0: " + list);

        // 14. remove(Object o)
        list.remove("Grape");
        System.out.println("After removing 'Grape': " + list);

        // 15. removeAll(Collection<?> c)
        list.removeAll(Arrays.asList("Date", "Elderberry"));
        System.out.println("After removeAll: " + list);

        // 16. removeIf(Predicate<? super E> filter)
        list.removeIf(s -> s.startsWith("F"));
        System.out.println("After removeIf: " + list);

        // 17. replaceAll(UnaryOperator<E> operator)
        list.replaceAll(s -> s.toUpperCase());
        System.out.println("After replaceAll to uppercase: " + list);

        // 18. retainAll(Collection<?> c)
        list.retainAll(Arrays.asList("APPLE"));
        System.out.println("After retainAll: " + list);

        // 19. set(int index, E element)
        list.set(0, "Apricot");
        System.out.println("After set: " + list);

        // 20. sort(Comparator<? super E> c)
        list.add("Mango");
        list.sort(Comparator.naturalOrder());
        System.out.println("After sort: " + list);

        // 21. spliterator()
        Spliterator<String> spliterator = list.spliterator();
        System.out.print("Spliterator output: ");
        spliterator.forEachRemaining(System.out::print);
        System.out.println();

        // 22. subList(int fromIndex, int toIndex)
        List<String> sub = list.subList(0, 1);
        System.out.println("Sublist: " + sub);

        // 23. size()
        System.out.println("List size: " + list.size());

        // 24. ensureCapacity(int minCapacity)
        ((ArrayList<String>) list).ensureCapacity(50);

        // 25. trimToSize()
        ((ArrayList<String>) list).trimToSize();

        // 26. clear()
        list.clear();
        System.out.println("After clear: " + list);
    }
}
