class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        boolean [] fre=new boolean[nums.length];
        permutation(nums,res,new ArrayList<>() ,fre);
        return res;
    }
    public void permutation(int[] nums,List<List<Integer>> res,List<Integer> li,boolean[] fre)
    {
        if(li.size()==nums.length)
        {
            res.add(new ArrayList<>(li));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
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