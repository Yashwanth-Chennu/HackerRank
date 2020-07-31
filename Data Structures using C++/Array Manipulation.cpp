https://github.com/Yashwanth-Chennu

Problem Statement:https://www.hackerrank.com/challenges/crush/problem

Solution: 

#include<bits/stdc++.h>
using namespace std;
int main(){
    long long int size, p, sum = 0, ans = 0, i, a, b, k;
    cin >> size >> p;
    long int *arr=new long int[size];
    while(p--){
     
        cin >> a >> b >> k;
        arr[a - 1] += k;
        if(b <= size)     arr[b] -= k;        
    }
    for( i = 0; i < size; i++){
        sum += arr[i];
        ans = max(ans, sum);
    }
    cout << ans ;
    return 0;


}


   
