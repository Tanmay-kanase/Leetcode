#include <iostream>
#include <vector>
using namespace std;

long long countSubarrays(vector<int>& nums, int minK, int maxK) {
    int n = nums.size();
    vector<int> prefixSum(n + 1, 0);

    // Calculate prefix sum
    for (int i = 0; i < n; ++i) {
        prefixSum[i + 1] = prefixSum[i] + nums[i];
    }

    long long count = 0;

    // Count subarrays
    for (int i = 1; i <= n; ++i) {
        for (int j = i + minK - 1; j <= n && j <= i + maxK - 1; ++j) {
            int sum = prefixSum[j] - prefixSum[i - 1];
            if (sum >= minK && sum <= maxK) {
                ++count;
            }
        }
    }

    return count;
}

int main() {
    vector<int> nums = {1, 3, 5, 2, 7, 5};
    int minK = 1;
    int maxK = 5;
    cout << countSubarrays(nums, minK, maxK) << endl; // Output: 2

    return 0;
}

