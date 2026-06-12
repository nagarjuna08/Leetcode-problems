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
            if(hm.get(nums[i])>(nums.length)/3 && !res.contains(nums[i]))
                {
                    res.add(nums[i]);
                }
                if(res.size()==2)
                {
                    break;
                }
        }
        return res;
    }
}