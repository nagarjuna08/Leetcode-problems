class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        n=len(nums)
        count=0
        mcount=0
        for i in range(0,n):
            if nums[i]==1:
                count+=1
                mcount=max(count,mcount)
            else :
                count=0
        return mcount