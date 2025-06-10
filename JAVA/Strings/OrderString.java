/*Input:  order = "bcafg", s = "abcd" 

Output:  "bcad" 

Explanation: The characters "b", "c", and "a" from order dictate the order for the characters in s. The character "d" in s does not appear in order, so its position is flexible.

Following the order of appearance in order, "b", "c", and "a" from s should be arranged as "b", "c", "a". "d" can be placed at any position since it's not in order. The output "bcad" correctly follows this rule. Other arrangements like "bacd" or "bcda" would also be valid, as long as "b", "c", "a" maintain their order.

*/




import java.util.HashMap;
import java.util.Map;

public class OrderString {
    public static String customSortString(String order, String s) {
        // Create a map to store character positions according to the order
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }

        // Convert the string to a character array for easier manipulation
        char[] charArray = s.toCharArray();

        // Use counting sort to sort the characters based on the order
        int[] count = new int[26]; // Assuming lowercase English alphabets
        for (char c : charArray) {
            count[c - 'a']++;
        }

        int index = 0;
        for (char c : order.toCharArray()) {
            int charCount = count[c - 'a'];
            while (charCount-- > 0) {
                charArray[index++] = c;
            }
            count[c - 'a'] = 0; // Reset count for current character
        }

        // Append remaining characters which are not in order
        for (char c = 'a'; c <= 'z'; c++) {
            if (count[c - 'a'] > 0) {
                int charCount = count[c - 'a'];
                while (charCount-- > 0) {
                    charArray[index++] = c;
                }
            }
        }

        // Convert the sorted character array back to string
        return new String(charArray);
    }

    public static void main(String[] args) {
        String order = "bcafg";
        String s = "abcd";
        String result = customSortString(order, s);
        System.out.println(result);  // Output: bcad
    }
}

