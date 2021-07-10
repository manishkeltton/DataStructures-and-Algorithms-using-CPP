#include<bits/stdc++.h>
using namespace std;

int main(){

    string s;
    bool status = true;
    cin >> s;
    stack<int> st;
    for(int i=0; i<s.size(); ++i){
        if(s[i] == '('){
            st.push(s[i]);
        } else if(s[i] == '{'){
            st.push(s[i]);
        } else if(s[i] == '['){
            st.push(s[i]);
        } else if(s[i] == ')'){
            if(st.top() == '('){
                st.pop();
                status = true;
            } else {
                status = false;
            }
        } else if(s[i] == '}'){
            if(st.top() == '{'){
                st.pop();
                status = true;
            } else {
                status = false;
            }
        } else if(s[i] == ']'){
            if(st.top() == '['){
                st.pop();
                status = true;
            } else {
                status = false;
            }
        }
        if(!status) break;
    }

    if(status){
        cout << "Valid"<< endl;
    } else {
        cout << "Invalid"<< endl;
    }
    return 0;
}