class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        Arrays.sort(piles);
        int left=1;
        int right=piles[n-1];
        int mid;
        int res=right;
        while(left<=right)
        {
            mid=left+(right-left)/2;
            if(valid(piles,mid,h))
            {
                res=Math.min(res,mid);
                right=mid-1;
            }
            else
            {
                left=mid+1;
            }
        }
        return res;
    }
    public boolean valid(int[] piles,int x, int h)
    {
        long time=0;
        for(int i=0;i<piles.length;i++)
        {
            int y=piles[i];
            time+=y/x;
            if(y%x!=0)
            {
                time++;
            }
        }
        return time<=h;
    }
}