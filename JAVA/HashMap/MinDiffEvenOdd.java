import java.util.HashMap;

public class MinDiffEvenOdd {
    public int maxDifference(String s) {
        HashMap<Character, Integer> c = new HashMap<>();
        
        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            c.put(ch, c.getOrDefault(ch, 0) + 1);
        }

        int maxOdd = 1;
        int minEven = s.length();

        // Iterate over frequencies
        for (int value : c.values()) {
            if (value % 2 == 1) {
                maxOdd = Math.max(maxOdd, value);
            } else {
                minEven = Math.min(minEven, value);
            }
        }

        return maxOdd - minEven;
    }

    public static void main(String[] args) {
        MinDiffEvenOdd mn = new MinDiffEvenOdd();
        String input = "aaaaaabbb";
        System.out.println("Maximum difference between even and odd string '" + input + "' is " + mn.maxDifference(input));
    }
}
