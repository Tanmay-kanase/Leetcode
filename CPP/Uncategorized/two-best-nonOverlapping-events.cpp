/* 
You are given a 0-indexed 2D integer array of events where events[i] = [startTimei, endTimei, valuei]. The ith event starts at startTimei and ends at endTimei, and if you attend this event, you will receive a value of valuei. You can choose at most two non-overlapping events to attend such that the sum of their values is maximized.

Return this maximum sum.

Note that the start time and end time is inclusive: that is, you cannot attend two events where one of them starts and the other ends at the same time. More specifically, if you attend an event with end time t, the next event must start at or after t + 1.

 

Example 1:


Input: events = [[1,3,2],[4,5,2],[2,4,3]]
Output: 4
Explanation: Choose the green events, 0 and 1 for a sum of 2 + 2 = 4.


*/


#include<iostream>
#include<vector>
#include <array>
#include <algorithm>
using namespace std;

class Solution {
public:
    int maxTwoEvents(vector<vector<int>>& events) {
        vector<array<int , 3>> times;
        for(auto& e : events){
            // 1 denotes start time.
            times.push_back({e[0], 1, e[2]});
            // 0 denotes end time.
            times.push_back({e[1] +1 , 0, e[2]});
        }
        int ans = 0 , maxValue = 0;
        sort(begin(times) , end(times));
        for(auto& timeValue : times){
            // If current time is a start time , find the maximum sum of maximum end 
            // time till now.
            if(timeValue[1]){
                ans = max(ans , timeValue[2] + maxValue);
            }
            else{
                maxValue = max(maxValue , timeValue[2]);
            }
        }
        return ans;
    }
};

int main(){
    
    vector<vector<int>> events = {{1,3,2},{4,5,2},{2,4,3}};
    Solution s;
    cout << "Maimum Sum of the 2 overlapping events : " << endl;
    cout<< s.maxTwoEvents(events);
    
    
    
    return 0;

}