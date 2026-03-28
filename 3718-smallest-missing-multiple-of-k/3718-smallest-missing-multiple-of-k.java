class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> res=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            res.add(nums[i]);
        }
        for(int i=1;i<=100;i++)
        {
            if(!res.contains(k*i))
            {
                return k*i;
            }
        }
        return 0;
    }
}