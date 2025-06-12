/* 
3423. Maximum Difference Between Adjacent Elements in a Circular Array
Given a circular array nums, find the maximum absolute difference between adjacent elements.
Note: In a circular array, the first and last elements are adjacent.

Example 1:
Input: nums = [1,2,4]
Output: 3

Explanation:
Because nums is circular, nums[0] and nums[2] are adjacent. They have the maximum absolute difference of |4 - 1| = 3.

Example 2:
Input: nums = [-5,-10,-5]
Output: 5

Explanation:
The adjacent elements nums[0] and nums[1] have the maximum absolute difference of |-5 - (-10)| = 5.
*/
#include<iostream>
#include<vector>
using namespace std;

class Solution{
    public:
    int MaxDiff(vector<int>& nums){
        int n = nums.size();
        int res = nums[0] - nums[n-1];
        for(int i = 0; i < n-1; i++){
            res = max(res , abs(nums[i] - nums[i+1]));
        }
        return res;
    }
};

int main(){
    vector<int> nums = {-5 , -10, -5};
    Solution s;
    cout << "Maximum absolute difference between adjacent pairs of circular array nums is " << s.MaxDiff(nums);
    return 0;
}
