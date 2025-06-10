#include<iostream>
using namespace std;

class Solution{
 public:
   int scoreofString(string s){
     int score = 0;
     for(int i=0; i<s.size()-1; i++){
       cout<<"Iteration : "<<i<<endl;
       score += abs(s[i]-s[i+1]);
       cout<<"Score = "<<"("<<s[i]<<")"<<abs(s[i])<<" + "<<"("<<s[i+1]<<")"<<abs(s[i+1])<<" = "<<abs(s[i]-s[i+1]);
       cout<<endl;
       cout<<endl;
     }
   return score;
   }
};

int main(){
  Solution s;
  string str;
  cout<<"Enter the string :";
  cin>>str;
  cout<<"Score = "<<s.scoreofString(str);
  cout<<endl;
  return 0;
}

     
