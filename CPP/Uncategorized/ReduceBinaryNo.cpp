#include<iostream>
using namespace std;

class Solution{
  public:
    int numSteps(string s){
      int N = s.size();
      int operations = 0;
      int carry = 0;
      for(int i = N-1; i > 0; i--){
        cout<<"\nIteration : "<<i<<endl;
        bool value = ((s[i]) + carry ) % 2 ;
        cout<<"Value = "<<value<<endl;
        if(((s[i]) + carry ) % 2){
          operations += 2;
          carry = 1;
        }else{
          operations++;
        }
        cout<<"Operation = "<<operations<<endl;
        cout<<"Carry = "<<carry<<endl;
      }
       return operations + carry;
    }
};

int main(){
  Solution s;
  cout<<s.numSteps("1000");
  cout<<endl;
  return 0;
}
