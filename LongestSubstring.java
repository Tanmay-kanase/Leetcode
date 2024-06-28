import java.util.HashMap;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int start = 0, end = 0; end < n; end++) {
            if (map.containsKey(s.charAt(end))) {
                start = Math.max(map.get(s.charAt(end)), start);
            }
            maxLength = Math.max(maxLength, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        String testString1 = "abcabcbb";
        String testString2 = "bbbbb";
        String testString3 = "pwwkew";

        System.out.println("Length of longest substring in '" + testString1 + "': " + lengthOfLongestSubstring(testString1));
        System.out.println("Length of longest substring in '" + testString2 + "': " + lengthOfLongestSubstring(testString2));
        System.out.println("Length of longest substring in '" + testString3 + "': " + lengthOfLongestSubstring(testString3));
    }
}

