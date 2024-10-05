class Solution(object):
    def longestPalindrome(self, s):
        dict = defaultdict(int)
        for c in s:
            dict[c]+=1;
            
        odd,ans=0,0
        for key in dict:
            if dict[key]%2==0:
                ans+=dict[key]
            else:
                if odd==0:
                    odd=1
                    ans+=dict[key]
                else:
                    ans+=dict[key]-1
        
        return ans