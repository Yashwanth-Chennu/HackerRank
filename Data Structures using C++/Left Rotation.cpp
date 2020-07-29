https://github.com/Yashwanth-Chennu

Problem Statement:https:https://www.hackerrank.com/challenges/array-left-rotation/problem

Solution:

#include<bits/stdc++.h>
using namespace std;

void lr(int arr[], int size, int rotate){
    int g = __gcd(size, rotate);
    for(int i = 0; i < g; i++){
        int temp = arr[i];
        int j =i;
        while(1){
            int k = j + rotate;
            if(k >= size)
                k  = k - size;
            if(k == i)
                break;
            arr[j] = arr[k];
            j = k;
        }
        arr[j] = temp;


    }
    for(int i = 0; i <  size; i++)
        cout << arr[i] << " ";


}

int main(){
    int size, rotate;
    cin >> size >> rotate;
    int arr[size];
    for(int i = 0; i < size; i++)
        cin >> arr[i];
    lr(arr, size, rotate);
} 

