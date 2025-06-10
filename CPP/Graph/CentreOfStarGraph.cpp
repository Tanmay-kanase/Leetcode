#include<iostream>
#include<vector>
#include <unordered_map>
using namespace std;

class Solution {
public:
    int findCenter(vector<vector<int>>& edges) {
        unordered_map<int, int> degree;

        for (vector<int> edge : edges) {
            degree[edge[0]]++;
            degree[edge[1]]++;
        }
        for (int i=0; i<=edges.size(); i++){
            cout<<" degree "<<i<<" = "<<degree[i,i];
            cout<<endl;
        }
        
        for (pair<int, int> nodes : degree) {
            int node = nodes.first;
            int nodeDegree = nodes.second;
            cout<<"Iteraton"<<endl;
            cout<<" Node = "<<node<<" nodeDegree = "<<nodeDegree<<endl;
            cout<<nodeDegree<<" = "<<edges.size()<<endl;
            if (nodeDegree == edges.size()) {
                return node;
            }
        }

        return -1;
    }
};

int main(){
    Solution s;
    vector<vector<int>> edges = {{1,2},{2,3},{4,2}};
    cout<<"\n"<<s.findCenter(edges);
    return 0;
}