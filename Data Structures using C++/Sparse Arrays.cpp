https://github.com/Yashwanth-Chennu

Problem Statement:https://www.hackerrank.com/challenges/sparse-arrays/problem

Solution: 

#include<bits/stdc++.h>
using namespace std;
int main(){
    int s;
    cin >> s;
    string str[s];
    vector <int> v;
    for(int i = 0; i < s; i++)
        cin >> str[i];
    int qs;
    cin >> qs;
    string q[qs];
    for(int i = 0; i < qs; i++)
        cin >> q[i];
    for(int i = 0; i < qs; i++){
        int count = 0;
        for(int j = 0; j < s; j++){
            
            if(q[i] == str[j])
                count++;
            
        }
        v.push_back(count);
    }
    for(int i = 0; i < qs; i++)
        cout << v[i] << endl;
    


}


