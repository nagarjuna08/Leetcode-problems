class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int ct1=0,ct2=0;
        int e1=0,e2=1;
        for(int x : nums)
        {
            if(ct1==0 && x!=e2)
            {
                ct1=1;
                e1=x;
            }
            else if(ct2==0 && x!=e1)
            {
                ct2=1;
                e2=x;
            }
            else if(x==e1)
            {
                ct1++;
            }
            else if(x==e2)
            {
                ct2++;
            }
            else
            {
                ct1--;
                ct2--;
            }
        }
        ct1=0;ct2=0;
        for(int x:nums)
        {
            if(x==e1) ct1++;
            if(x==e2) ct2++;
        }
        int min=nums.length/3+1;
        if(ct1>=min) res.add(e1);
        if(ct2>=min) res.add(e2);
        return res;
    }
}