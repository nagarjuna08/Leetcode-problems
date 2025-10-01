class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        sub(0,res,nums,li);
        return res;
    }
    public void sub(int in, List<List<Integer>> res ,int [] nums,List<Integer> li)
    {
        if(in==nums.length) 
        {
        res.add(new ArrayList<>(li));
        return ;
        }
        li.add(nums[in]);
        sub(in+1,res,nums,li);
        li.remove(li.size()-1);
        sub(in+1,res,nums,li);
    }
}