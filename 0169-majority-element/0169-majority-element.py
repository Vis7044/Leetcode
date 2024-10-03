class Solution(object):
    def majorityElement(self, nums):
        curr=0
        total=0
        for i in nums:
            if total==0:
                curr=i
                total+=1
            elif curr==i:
                total+=1
            else:
                total-=1
        return curr