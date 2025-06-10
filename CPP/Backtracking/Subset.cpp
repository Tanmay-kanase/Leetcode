#include<iostream>
#include<vector>

using namespace std;

class Solution{ 
 public: 
   int countTriplets(vector<int>& arr){
     int count = 0;
     for(int start = 0; start<arr.size() - 1; ++start){
      int xorA = 0;
      cout<<"Iteration : "<<start<<endl;
      for( int mid = start + 1; mid < arr.size(); ++mid){
        xorA ^= arr[mid - 1];
        cout<<"xorA = "<<xorA<<endl;
        int xorB = 0;
        for(int end = mid; end < arr.size(); ++end){
         xorB ^= arr[end];
         cout<<"xorB = "<<xorB<<endl;
         if(xorA == xorB){
           ++count;
         }
         cout<<"count : "<<count<<endl;
        }
       
      }
    }
    return count;
   }
};
int main(){
  vector<int> nums = { 2,3,1,6,7 };
  Solution sl;
  cout<<endl;
  cout<<sl.countTriplets(nums)<<endl;
  return 0;
}
  
 
   
