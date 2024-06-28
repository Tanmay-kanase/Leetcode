#include<iostream>
#include<vector>
using namespace std;

class Solution {
public:
   int numRescueBoats(vector<int> people, int limit) {
        int i, j;
        //sort(people.rbegin(), people.rend());
        for (i = 0, j = people.size() - 1; i <= j; ++i){
            cout<<"\nIteration : "<<"i = "<<i<<" j = "<<j<<endl;
            cout<<people[i]<<" + "<<people[j]<<" <= "<<limit<<endl;
            if (people[i] + people[j] <= limit) {
            
               j--;
            }
        }
        return i;
    }
};

int main(){
 Solution s;
 vector<int> nums = {3,2,2,1};
 cout<<s.numRescueBoats(nums , 3);
 return 0;
}
