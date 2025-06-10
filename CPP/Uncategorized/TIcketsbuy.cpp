#include<iostream>
#include<queue>
#include<vector>
using namespace std;

class Solution{
 public:
  int timeRequiredtobuy(vector<int>& tickets, int k){
  queue<int> queue;
  int time = 0;
  for(int i = 0; i<tickets.size(); i++){
    queue.push(i);
  }
  while(!queue.empty()){
    time++;
    cout<<"\nTime = "<<time;
    int front = queue.front();
    cout<<"\nFront = "<<front;
    queue.pop();
    tickets[front]--;
    cout<<"Ticket = "<<tickets[front];
    if(k == front && tickets[front] == 0){
      return time;
    }
    if(tickets[front] != 0){
      queue.push(front);
    }
  }
  return time;
}
};

int main(){
 vector<int> tickets = {2,3,2};
 int k = 2;
 Solution s;
 int result = s.timeRequiredtobuy(tickets,k);
 cout<<"Result = "<<result;
 return 0;
}
      
    
