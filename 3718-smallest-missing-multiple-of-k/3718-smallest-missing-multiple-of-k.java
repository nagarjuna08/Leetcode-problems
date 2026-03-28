class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> res=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            res.add(nums[i]);
        }
        int j=1;
        for( j=1;j<=100;j++)
        {
            if(!res.contains(k*j))
            {
                return k*j;
            }
        }
        return k*j;
    }
}