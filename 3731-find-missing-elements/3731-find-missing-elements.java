class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int start=nums[0];
        int end=nums[nums.length-1];
        List<Integer> res=new ArrayList<>();
        int j=0;
        for(int i=start;i<=end;i++)
        {
            if(nums[j]==i)
            {
                j++;
            }else
            {
                res.add(i);
            }
        }
        return res;
    }
}