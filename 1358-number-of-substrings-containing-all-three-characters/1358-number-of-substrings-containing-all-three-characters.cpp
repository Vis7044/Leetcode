class Solution {
public:
    int numberOfSubstrings(string s) {
        int arr[3] ={-1,-1,-1};
        int j=0,cnt=0;
        while(j<s.size()) {
            arr[s[j]-'a']=j;
            if(arr[0]!=-1 && arr[1]!=-1 && arr[2]!=-1) {
                cnt += min(arr[0],min(arr[1],arr[2]))+1;
            }
            j++;
        }
        return cnt;
    }
};