class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> li=new ArrayList<>();
        combination(0,candidates,target,res,li,0);
        return res;
    }
    public void combination(int i,int [] arr,int t,List<List<Integer>> res,List<Integer> li,int sum)
    {
            if(t==sum)
            {
                res.add(new ArrayList<>(li));
            return;
            }
            for(int in=i;in<arr.length;in++)
            {
                if(in>i && arr[in]==arr[in-1]) continue;
                if(sum+arr[in]>t) break;
            li.add(arr[in]);
            combination(in+1,arr,t,res,li,sum+arr[in]);
            li.remove(li.size()-1);
            }
    }
}