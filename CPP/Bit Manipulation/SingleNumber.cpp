#include<iostream>
#include<vector>
using namespace std;

class Solution{
 public:
   vector<int> singleNumber(vector<int>& nums){
     int diff = accumlate(nums.begin() , nums.end() , 0 , bit_xor<int>());
     diff &= -diff;
     vector<int> rets = {0,0};
     for(int num : nums){
       if((num & diff) == 0){
          rets[0] ^= num;
       }else{
          rets[1] ^= num;
       }
     }
     return rets;
   }
};

int main(){
  Solution s;
  vector<int> nums = {1,2,1,3,2,5};
  s.singleNumber(nums);
  return 0;
}
