class Solution {
    public List<List<Integer>> combinationSum(int[] c, int t) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        combination(c,res,li,t,0,0);
        return res;
    }
    public void combination(int []c, List<List<Integer>> res,List<Integer> li,int t,int sum,int i)
    {
        if(i==c.length)
        {
        if(t==sum)
        {
            res.add(new ArrayList<>(li));
        }
            return;
        }
        if (t>=sum+c[i])
        {
        li.add(c[i]);
        combination(c,res,li,t,sum+c[i],i);
        li.remove(li.size()-1);
        }
        combination(c,res,li,t,sum,i+1);

    }
}