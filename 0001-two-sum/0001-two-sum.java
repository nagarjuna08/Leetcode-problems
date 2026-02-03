class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        Map<Integer,Integer> st=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            int x=target-nums[i];
            if(st.containsKey(x))
            {
                return new int[]{i,st.get(x)};
            }
            else
            {
                st.put(nums[i],i);
            }
        }
        return new int[]{0,0};
    }
}