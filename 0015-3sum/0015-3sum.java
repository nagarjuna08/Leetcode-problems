class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        Set<List<Integer>> res=new HashSet<>();
        for(int i=0;i<n;i++)
        {
             if (i > 0 && nums[i] == nums[i - 1]) continue;
            HashSet<Integer> hs = new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                int diff=-(nums[i]+nums[j]);
                if(!hs.contains(diff))
                {
                    hs.add(nums[j]);
                }
                else
                {
                    List<Integer> li=new ArrayList<>();
                    li.add(nums[i]);
                    li.add(diff);
                    li.add(nums[j]);
                    res.add(li);
                }
            }

        }
        return new ArrayList<>(res);
    }
}