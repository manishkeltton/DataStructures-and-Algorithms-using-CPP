#include<bits/stdc++.h>
using namespace std;
typedef long long LL;
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
	string s;
        int n,i,cur=0;
	LL ans=0;
	cin >> n >> s;
        for(i=0; i<n; i++)
        {
            if(s[i]=='1')
            {
                cur++;
                // cout<< cur << endl;

                ans+=(long long)(cur);
                // cout<<ans<<endl;
            }
        }
	cout << ans << endl;
    }
    return 0;
}