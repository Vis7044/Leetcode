class Solution {
public:
    string minWindow(string s, string t) {
        int arr[256] = {0};
        for(int i=0;i<t.size();i++) {
            arr[t[i]]++;
        }
        int i=0,j=0,min=1e9,cnt=0,s_ind=-1;
        while(j<s.size()) {
            if(arr[s[j]]>0) cnt++;
            
            arr[s[j]]--;

            while(cnt==t.size()) {
                if(j-i+1<min) {
                    min=j-i+1;
                    s_ind=i;
                }
                arr[s[i]]++;
                if(arr[s[i]]>0) cnt--;
                i++;
            }
            j++;
        }
        return s_ind==-1?"":s.substr(s_ind,min);
    }
};