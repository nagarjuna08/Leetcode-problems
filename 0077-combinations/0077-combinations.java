class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        combination(n,k,res,1,new ArrayList<>());
        return res;
    }
    public void combination(int n,int k,List<List<Integer>> res,int start,List<Integer>li)
    {
        if(li.size()==k)
        {
            res.add(new ArrayList<>(li));
            return;
        }
        for(int i=start;i<=n;i++)
        {

            li.add(i);
            combination(n,k,res,i+1,li);
            li.remove(li.size()-1);
        }
    }
}