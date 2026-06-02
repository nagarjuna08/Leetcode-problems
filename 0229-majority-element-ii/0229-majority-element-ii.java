class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                int x=hm.get(nums[i]);
                x++;
                hm.put(nums[i],x);
            }
            else
            {
                hm.put(nums[i],1);
            }
        }
        for(int x: hm.keySet())
        {
            if(hm.get(x)>(nums.length)/3)
            {
                res.add(x);
            }
        }
        return res;
    }
}