/*
Given a string s, return the longest palindromic substring in s

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
*/

public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0)
            return "";

        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int start = 0, end = 0;

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i < 3 || dp[i + 1][j - 1]);

                if (dp[i][j] && (end - start < j - i)) {
                    start = i;
                    end = j;
                }
            }
        }

        return s.substring(start, end + 1);
    }

    public static void main(String[] args) {
        String s = "babad";
        String result = longestPalindrome(s);
        System.out.println(result);  // Output: "bab" or "aba"
    }
}

