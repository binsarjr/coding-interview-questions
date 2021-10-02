// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
//User function template for C++

class Solution {
public:
    
    int multiple(int x,int arr[],int arr_size)
    {
        int carry=0,i,prod;
        for(i=0;i<arr_size;i++)
        {
            prod=arr[i]*x+carry;
            arr[i]=prod%10;
            carry=prod/10;
        }
        while(carry)
        {
            arr[arr_size]=carry%10;
            carry=carry/10;
            arr_size++;
        }
        return arr_size;
    }
    vector<int> factorial(int N){
        int arr[2600];
        arr[0]=1;
        vector<int>v;
        int i,arr_size=1;
        for(i=2;i<=N;i++)
        {
            arr_size=multiple(i,arr,arr_size);
        }
        for(i=arr_size-1;i>=0;i--)
        {
            v.push_back(arr[i]);
        }
        return v;
    }
};

// { Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        cin >> N;
        Solution ob;
        vector<int> result = ob.factorial(N);
        for (int i = 0; i < result.size(); ++i){
            cout<< result[i];
        }
        cout << endl;
    }
    return 0;
}  // } Driver Code Ends
