class Solution {
public:
    string addBinary(string a, string b) {
        int j=b.length()-1;
        int i=a.length()-1;
        char c='0';
        string s = "";
        stack<char> res;
        
        while(i>=0 && j>=0){
            if(b[j]=='0'&& a[i]=='0'){
                res.push(c);
                c='0';
            }
            else if(b[j]=='1' && a[i]=='1'){
                res.push(c);
                c='1';
            }else {
                if(c=='1') {
                    res.push('0');
                    c='1';
                }else{
                    res.push('1');
                    c='0';
                }
            };
            j--;
            i--;
        }
        while(i>=0){
            if(a[i]=='0'){
                res.push(c);
                c='0';
            }else{
                if(c=='1'){
                    res.push('0');
                    c='1';
                }else{
                    res.push('1');
                    c='0';
                }
            }
            i--;
        }
        while(j>=0){
            if(b[j]=='0'){
                res.push(c);
                c='0';
            }else{
                if(c=='1'){
                    res.push('0');
                    c='1';
                }else{
                    res.push('1');
                    c='0';
                }
            }
            j--;
        }
        if(c=='1') res.push('1');
        while(!res.empty()){
            s+=res.top();
            res.pop();
        }
        return s;
    }
};