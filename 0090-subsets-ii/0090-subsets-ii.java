class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);
        subset(nums,0,res,new ArrayList<>());
        return res;
    }
    public void subset(int [] nums,int in,List<List<Integer>> res,List<Integer> li)
    {
        res.add(new ArrayList<>(li));
        for(int i=in;i<nums.length;i++)
        {
            if(i!=in && nums[i]==nums[i-1]) continue;
            li.add(nums[i]);
            subset(nums,i+1,res,li);
            li.remove(li.size()-1);
        }
        //subset(nums,in+1,res,li);
    }
}