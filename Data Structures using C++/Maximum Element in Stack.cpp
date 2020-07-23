https://github.com/Yashwanth-Chennu

Problem Statement :https://www.hackerrank.com/challenges/maximum-element/problem

Solution :
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <stack>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int query;
    cin >> query;
    vector<int> v;
    vector<int> max;
    while(query--){
        int value;
        cin >> value;
        switch(value){
            case 1: int val;
                    cin >> val;
                    if(max.empty())
                        max.push_back(val);
                    else{
                        if(max.back() <= val)
                            max.push_back(val);                        
                    }
                    v.push_back(val);
                break;
            case 2: if(max.back() == v.back()){
                        max.pop_back();
                        v.pop_back();
                    }else
                        v.pop_back();
                break;
            case 3: cout << max.back() << endl;
                break;
            
        }
    } 
    return 0;
}
