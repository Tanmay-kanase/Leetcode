#include<iostream>
using namespace std;

class Solution {
public:
    int pivotInteger(int n) {
        // Iterate through possible pivot values
        for (int i = 1; i <= n; i++) {
            int sumLeft = 0;
            int sumRight = 0;

            // Calculate the sum of elements on the left side of the pivot
            for (int j = 1; j <= i; j++) {
                sumLeft += j;
            }

            // Calculate the sum of elements on the right side of the pivot
            for (int k = i; k <= n; k++) {
                sumRight += k;
            }

            // Check if the sums on both sides are equal
            if (sumLeft == sumRight) {
                return i; // Return the pivot value if found
            }
        }

        return -1; // Return -1 if no pivot is found
    }
};

int main()
{
 int n;
 cout<<"Enter the value of n = ";
 cin>>n;
 Solution obj;
 cout<<obj.pivotInteger(n)<<endl;
 return 0;
}
