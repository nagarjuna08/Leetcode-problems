class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();

        permutation(nums,res,new ArrayList<>(),new boolean[nums.length]);
        return res;
    }
    public void permutation(int []nums,List<List<Integer>> res, List<Integer> li,boolean[] fre)
    {
        if(li.size()==nums.length)
        {
            res.add(new ArrayList<>(li));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
             if (i > 0 && nums[i] == nums[i - 1] && !fre[i - 1]) continue;
            if(!fre[i])
            {
                fre[i]=true;
                li.add(nums[i]);
                permutation(nums,res,li,fre);
                li.remove(li.size()-1);
                fre[i]=false;
            }
        }
    }
}