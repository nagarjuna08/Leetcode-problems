class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res=new HashSet<>();
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            HashSet<Integer> hs=new HashSet<>();
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j=i+1;j<n;j++)
            {
                int diff=-(nums[i]+nums[j]);
                if(hs.contains(diff))
                {
                    List<Integer>li=new ArrayList<>();
                    li.add(nums[i]);
                    li.add(diff);
                    li.add(nums[j]);
                    res.add(new ArrayList<>(li));
                }
                else
                {
                    hs.add(nums[j]);
                }
            }
        }
        return new ArrayList<>(res);
    }
}