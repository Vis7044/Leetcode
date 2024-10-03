class Solution(object):
    def plusOne(self, digits):
        ans = []
        n=len(digits)
        carry=1
        for i in range(n):
            val=digits[n-i-1]
            val+=carry
            if(val>9):
                ans.append(val%10)
                carry=1
            else:
                ans.append(val)
                carry=0
        if carry==1:
            ans.append(1)
        ans=ans[::-1]
        return ans
                
        