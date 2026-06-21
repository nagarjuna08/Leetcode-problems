class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if((long)m*k>n) return -1;
        int low=Integer.MAX_VALUE,high=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(low>bloomDay[i])
            {
                low=bloomDay[i];
            }
            if(high<bloomDay[i])
            {
                high=bloomDay[i];
            }
        }   
        System.out.print(low+" "+high);
        int mid,res=high;
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(possiable(bloomDay,mid,m,k))
            {
                res=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return res;
    }
    public boolean possiable(int[] b,int mid, int m, int k)
    {
        int count=0,val=0;
        for(int i=0;i<b.length;i++)
        {
            if(b[i]<=mid)
            {
                count++;
            }
            else
            {
                val+=(count/k);
                count=0;
            }
        }
        val+=(count/k);
        System.out.print(val+" ");
        return val>=m; 
    }
}