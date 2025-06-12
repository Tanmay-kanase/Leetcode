import java.util.*;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // add(E e) - Add elements to the end
        list.add("Apple");
        list.add("Banana");

        // add(int index, E element) - Add at specific index
        list.add(1, "Mango");  // [Apple, Mango, Banana]

        // addFirst(E e) and addLast(E e)
        list.addFirst("FirstFruit");
        list.addLast("LastFruit");  // [FirstFruit, Apple, Mango, Banana, LastFruit]

        // addAll(Collection<? extends E>)
        List<String> moreFruits = Arrays.asList("Pineapple", "Orange");
        list.addAll(moreFruits);

        // addAll(int index, Collection<? extends E>)
        list.addAll(2, Arrays.asList("Kiwi", "Grapes"));

        // Print list
        System.out.println("List: " + list);

        // get(), getFirst(), getLast()
        System.out.println("First: " + list.getFirst());  // FirstFruit
        System.out.println("Last: " + list.getLast());    // Orange
        System.out.println("Element at index 2: " + list.get(2)); // Kiwi

        // indexOf, lastIndexOf
        System.out.println("Index of Banana: " + list.indexOf("Banana"));

        // contains()
        System.out.println("Contains Mango? " + list.contains("Mango"));

        // size()
        System.out.println("Size: " + list.size());

        // remove(), removeFirst(), removeLast(), remove(int), remove(Object)
        list.remove(); // removes first
        list.remove("Banana");
        list.remove(2);
        list.removeFirst();
        list.removeLast();

        System.out.println("After Removals: " + list);

        // offer(), offerFirst(), offerLast()
        list.offer("Papaya");
        list.offerFirst("Guava");
        list.offerLast("Blueberry");

        System.out.println("After Offers: " + list);

        // peek(), peekFirst(), peekLast()
        System.out.println("Peek: " + list.peek());
        System.out.println("Peek First: " + list.peekFirst());
        System.out.println("Peek Last: " + list.peekLast());

        // poll(), pollFirst(), pollLast()
        System.out.println("Poll: " + list.poll());
        System.out.println("Poll First: " + list.pollFirst());
        System.out.println("Poll Last: " + list.pollLast());

        System.out.println("After Polls: " + list);

        // push() and pop() (like Stack)
        list.push("Strawberry");  // addFirst
        System.out.println("After Push: " + list);
        System.out.println("Popped: " + list.pop());  // removeFirst

        // clear()
        list.clear();
        System.out.println("Cleared list: " + list);

        // clone()
        LinkedList<String> original = new LinkedList<>(Arrays.asList("A", "B", "C"));
        LinkedList<String> clone = (LinkedList<String>) original.clone();
        System.out.println("Cloned list: " + clone);

        // toArray()
        Object[] array = original.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // toArray with type
        String[] typedArray = original.toArray(new String[0]);
        System.out.println("Typed Array: " + Arrays.toString(typedArray));
    }
}
