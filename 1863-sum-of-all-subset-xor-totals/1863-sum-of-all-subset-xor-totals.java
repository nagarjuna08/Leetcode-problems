class Solution {
    public int subsetXORSum(int[] nums) 
    {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        sub(0,res,nums,li);
        int sum=0;
        for(List<Integer> l : res)
        {
            int k=0;
            for(int x: l)
            {
                k=k^x;
            }
            sum+=k;
        }
        return sum;
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