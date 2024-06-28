#include<iostream>
#include<vector>
using namespace std;

class Solution {
public:
    int subsetXORSum(vector<int>& nums) {
        int result = 0;
        // Capture each bit that is set in any of the elements
        for (int num : nums) {
            cout<<"\nIteration : "<<num;
            result |= num;
            cout<<"\nResult : "<<result;
        }
        // Multiply by the number of subset XOR totals that will have each bit set
        cout<<"\nANS : "<<result << (nums.size() - 1)<<endl;
        return result << (nums.size() - 1);
    }
};

int main(){
 Solution s;
 vector<int> nums = {1,3};
 cout<<s.subsetXORSum(nums);
 return 0;
}
