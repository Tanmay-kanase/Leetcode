#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
    int partitionArray(vector<int>& nums, int k) {
        // Step 1: Sort the array
        sort(nums.begin(), nums.end());

        int count = 0;  // To store the number of subsequences
        int i = 0;      // Pointer to iterate the array

        while (i < nums.size()) {
            int minVal = nums[i];  // Start of the current group
            count++;               // New group started

            // Step 2: Keep extending the current group while difference <= k
            while (i < nums.size() && nums[i] - minVal <= k) {
                i++;  // Move to next element in the same group
            }

            // When the difference exceeds k, we exit the inner loop and start a new group
        }
        return count;
    }
};
int main() {
    Solution sol;
    vector<int> nums1 = {3, 6, 1, 2, 5};
    int k1 = 2;
    cout << "Output 1: " << sol.partitionArray(nums1, k1) << endl;
    return 0;
}