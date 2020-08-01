https://github.com/Yashwanth-Chennu

Problem Statement:https://www.hackerrank.com/challenges/equal-stacks/problem

Solution: 

#include<bits/stdc++.h>
using namespace std;
vector <int> h1, h2, h3;
int height(int s1, int s2, int s3){
    int h = 0;
    while(!h1.empty() && !h2.empty() && !h3.empty()){
       int m = min(min(s1, s2), min(s2, s3));
        if(s1 == s2 && s2 == s3){
            h = s1;
            break;
        }
        while(s1 > m){
            s1 -= h1.front();
            h1.erase(h1.begin());
        }
        while(s2 > m){
            s2 -= h2.front();
            h2.erase(h2.begin());
        }
        while(s3 > m){
            s3 -= h3.front();
            h3.erase(h3.begin());
        }
        
    }
    return h;
    
}


int main(){
    int a, b, c, s1 = 0, s2 =0, s3 = 0;
    cin >> a >> b >> c;
    
    for(int i =0; i < a; i++){
        int value;
        cin >> value;
        s1 += value;
        h1.push_back(value);
    }
    for(int i =0; i < b; i++){
        int value;
        cin >> value;
        s2 += value;
        h2.push_back(value);
    }
    for(int i =0; i < c; i++){
        int value;
        cin >> value;
        s3 += value;
        h3.push_back(value);
    }
    cout <<height( s1, s2, s3);

    return 0;
}



   
