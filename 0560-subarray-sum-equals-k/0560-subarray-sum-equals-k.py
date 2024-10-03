class Solution(object):
    def subarraySum(self, nums, k):
        prefix = defaultdict(int)
        prefix[0]=1
        sum=0
        cnt=0
        for i in range(len(nums)):
            sum+=nums[i]
            rem = sum-k
            cnt+=prefix[rem]
            prefix[sum]+=1
        return cnt;
        