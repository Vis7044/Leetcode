class Solution {
public:
    string intToRoman(int num) {
        int arr[] = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        string s[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        string ans="";
        int i=0;
        while(i<13) {
            if(num>=arr[i]) {
                int n = num/arr[i];
                while(n!=0) {
                    ans+=s[i];
                    n--;
                }
                num=num%arr[i];
            }else i++;
        }
        return ans;
    }
};