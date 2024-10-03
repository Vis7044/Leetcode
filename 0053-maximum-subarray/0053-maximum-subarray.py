class Solution(object):
    def maxSubArray(self, nums):
        maxi=nums[0]
        sum=0
        for n in nums:
            sum+=n
            maxi = max(maxi,sum)
            if sum<0:
                sum=0
        return maxi
        