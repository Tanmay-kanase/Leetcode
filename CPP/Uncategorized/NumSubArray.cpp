#include<iostream>
#include <vector>
using namespace std;

class Solution{
  public:
    int numSubArrayProduct(vector<int>& nums , int k){
      int count = 0;
      int product = 1;
      int left = 0;
      
      for(int right = 0; right<nums.size(); right++){
        product *= nums[right];
        
        while(left<=right && product >= k){
          product /= nums[left];
          left++;
        }
        count += (right-left+1);
     }
     return count;
    }
};
int main(){
 int k = 8;
 nums = [10,5,2,6];
 Solution s;
 cout<<"number product less than k "<<s.numSubArrayProduct(nums,k);
 return 0;
}
