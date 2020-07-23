https://github.com/Yashwanth-Chennu

Problem Statement :https://www.hackerrank.com/challenges/balanced-brackets/problem



Solution:
#include<iostream>
#include<stack>
using namespace std;
int balanced(){
    string s;
    cin >> s;
    stack<char> st;
    for(int i = 0; i < s.size(); i++){
        if(s[i] == '(' || s[i] == '{' || s[i] == '[')
            st.push(s[i]);
        else if(!st.empty() && st.top() == '('  && s[i] == ')')
            st.pop();
        else if(!st.empty() && st.top() == '['  && s[i] == ']')
            st.pop();
        else if(!st.empty() && st.top() == '{'  && s[i] == '}')
            st.pop();    
        else if((s[i] == '}' || s[i] == ']' || s[i] == ')' ))    
            return 0;  

    }
    if(st.empty())
        return 1;
    else
        return 0;
}

int main(){
    int test;
    cin >> test;
    while(test--){
        if(balanced())
            cout << "YES"<< endl;
        else 
            cout << "NO"<< endl;
    }

    return 0;
}