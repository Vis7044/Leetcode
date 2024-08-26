class Solution {
public:
    long long createPalindrome(string prefix, int len) {
        string p = prefix;
        string palindrome = p+ string(p.rbegin() + (len%2), p.rend());
        return stoll(palindrome);
    }
    string nearestPalindromic(string n) {
        int len = n.length();
        long long number = stoll(n);
        
        if (number <= 10 || (number == pow(10, len - 1))) {
            return to_string(number - 1);
        }
        
        long long prefix = stoll(n.substr(0, (len + 1) / 2));
        
        vector<long long>pal;
        
        pal.push_back(pow(10,len-1)-1);
        pal.push_back(pow(10,len)+1);
        
        for(int i=-1;i<=1;i++) {
            string p=to_string(prefix+i);
            pal.push_back(createPalindrome(p,len));
        }
        
        long long closest = -1;
    for (long long candidate : pal) {
        if (candidate != number) {
            if (closest == -1 || abs(candidate - number) < abs(closest - number) ||
                (abs(candidate - number) == abs(closest - number) && candidate < closest)) {
                closest = candidate;
            }
        }
    }

    return to_string(closest);
    }
};