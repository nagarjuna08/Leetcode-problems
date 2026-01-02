class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length/2;
        for(int i=0;i<nums.length;i++)
        {
            if(!hm.containsKey(nums[i]))
            {
                hm.put(nums[i],1);
            }
            else
            {
                int fr=hm.get(nums[i]);
                fr++;
                hm.put(nums[i],fr);
            }
        }
        for(int key:hm.keySet())
        {
            if(hm.get(key)==n)
            {
                return key;
            }
        }
        return 0;
    }
}