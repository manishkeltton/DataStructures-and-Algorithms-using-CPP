#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    vector<int> v2;
    v2.resize(n);
    for(int i=0; i<n;i++){
        cin>>v2[i];
    }

    vector<int> v1;

    stack<int> st;
    // 18 3 2 5 10
    for(int i=0; i<n;i++){
        st.push(v2[i]);
        bool greater = true;
        for(int j=i+1; j<n;j++){
            if(v2[i] > v2[j]){
                st.push(v2[j]);
            }
            else {
                greater = false;
                while(true){
                    if( !st.empty() && st.top() < v2[j]){
                       st.pop();
                    }
                    else {
                        v1.push_back(v2[j]);
                        break;
                    }
                }
                break;
            }
        }
        if(greater){
            v1.push_back(-1);
        }
        while(!st.empty()){
            st.pop();
        }
    }

    for(int i=0; i<v1.size(); i++){
        cout<< v1[i] << " ";
    }

}