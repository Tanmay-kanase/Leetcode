#include<iostream>
#include<vector>
using namespace std;

class Solution {
public:
    int longestIdealString(string s, int k) {
        int N = s.size();
        vector<int> dp(26, 0);

        int res = 0;
        // Updating dp with the i-th character
        for (int i = 0; i < N; i++) {
            int curr = s[i] - 'a';
            cout<<"curr = "<<curr<<endl;
            int best = 0;
            for (int prev = max(0, curr - k); prev < min(26, curr + k + 1); prev++) {
                cout<<"\nIteraton 1: "<<endl;
                cout<<"prev = "<<prev<<endl;
                best = max(best, dp[prev]);
                cout<<"best = "<<best<<endl;
            }

            // Append s[i] to the previous longest ideal subsequence
            dp[curr] = best + 1;
            res = max(res, dp[curr]);
            cout<<"res = "<<res;
        }

        return res;
    }
};

int main(){
 Solution s;
 cout<<s.longestIdealString("acfgbd",2);
 return 0;
}
