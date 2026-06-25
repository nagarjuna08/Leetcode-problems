class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int high=0,n=weights.length;
        int low=0,mid=0;
        int res=0;
        for(int i=0;i<n;i++)
        {
            high+=weights[i];
            if(low<weights[i])
            {
                low=weights[i];
            }
        }
        while(low<=high)
        {
            mid=low+(high-low)/2;
            if(valid(weights,days,mid))
            {
                high=mid-1;
               res=mid;
            }
            else
            {
                 low=mid+1;
            }
        }
        return res;
    }
    public boolean valid(int[] arr,int days,int max)
    {
        int count=1;
        int sum=0,i=0;
        while(i<arr.length)
        {
            if(sum+arr[i]<=max)
            {
                sum+=arr[i];
                i++;
            }
            else
            {
                sum=0;
                count++;
            }
            
        }
        return count<=days;
    }
}