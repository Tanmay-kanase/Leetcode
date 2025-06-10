#include <iostream>
#include <vector>

using namespace std;

int numSubarrayProductLessThanK(vector<int>& nums, int k) {
    int count = 0;
    int product = 1;
    int left = 0;

    for (int right = 0; right < nums.size(); right++) {
        product *= nums[right];
        cout<<"\n\nRight = "<<right;
        cout<<"\nProduct = "<<product;

        while (left <= right && product >= k) {
            product /= nums[left];
            left++;
            cout<<"\nProduct while loop "<<product;
            cout<<"\nLeft = "<<left;
        }
        cout<<"\nLeft for loop = "<<left;
        count += (right - left + 1);
        cout<<"\nCount = "<<count;
    }

    return count;
}

int main() {
    vector<int> nums = {10, 5, 2, 6};
    int k = 100;

    int result = numSubarrayProductLessThanK(nums, k);

    cout << "Output: " << result << endl;

    return 0;
}

