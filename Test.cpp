#include <iostream>
#include <unordered_set>
#include <algorithm>

using namespace std;

int lengthOfLongestSubstring(string s) {
    unordered_set<char> charSet;
    int maxLength = 0;
    int left = 0, right = 0;

    while (right < s.length()) {
        if (charSet.find(s[right]) == charSet.end()) {
            charSet.insert(s[right]);
            maxLength = max(maxLength, right - left + 1);
            right++;
        } else {
            charSet.erase(s[left]);
            left++;
        }
    }

    return maxLength;
}

int main() {
    string s = "abcabcbb";
    int maxLength = lengthOfLongestSubstring(s);
    cout << "Input: " << s << endl;
    cout << "Output: " << maxLength << endl;
    return 0;
}

