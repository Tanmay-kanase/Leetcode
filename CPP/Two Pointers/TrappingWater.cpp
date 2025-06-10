#include<iostream>
#include<vector>
using namespace std;

class Sol{
 public:
  int trap(vector<int>& height){
   int l = 0, r = height.size()-1,level = 0,water = 0;
   while(l < r){
        cout<<"\n\nHeight[l] = "<<height[l];
     cout<<"\nHeight[r] = "<<height[r];
     int lower = height[height[l] < height[r] ? l++ : r--];

     cout<<"\nLower = "<<lower;
     level = max(level,lower);
     cout<<"\nLevel = "<<level;
     water += level-lower;
     cout<<"\nWater = "<<water;
   }
   return water;
  }
};

int main(){
 vector<int> height = {4,2,0,3,2,5};
 Sol s;
 int r = s.trap(height);
 cout<<"\n\n\nOutput ="<<r;
 return 0;
}
