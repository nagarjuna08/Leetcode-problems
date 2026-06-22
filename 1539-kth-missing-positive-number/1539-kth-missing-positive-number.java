class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>k)
            {
                break;
            }
            else
            {
                k++;
            }
        }
        return k;
        // int low=arr[0];
        // if(low>k)
        // {
        //     return k;
        // }
        // Set<integer> set=new HashSet<>();
        // for(int i=0;i<n;i++)
        // {
        //     set.add(arr[i]);
        // }
        // int high=arr[n-1]+k;
        // int mid;
        // while(low<=high)
        // {
        //     mid=low+(high-low)/2;
        //     int x=solve(set,mid,k);
        //     if(x==0)
        //     {
        //         return mid;
        //     }
        //     else if(x<0)
        //     {
        //         low=mid+1;
        //     }
        //     else
        //     {
        //         high=mid-1;
        //     }
        // }
        // return 0;
    }
}