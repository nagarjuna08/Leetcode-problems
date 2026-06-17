class Solution {
    public int searchInsert(int[] arr, int x) {
       int n=arr.length;
       int low=0;
       int high=n-1;
       int mid;
       if(x<arr[0]) return 0;
       while(low<=high)
       {
            mid=low+(high-low)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
            else if(arr[mid]>x)
            {
                if(mid>0 && arr[mid-1]<x)
                {
                    return mid;
                }
                high=mid-1;
            }
            else
            {
                if(mid<n-1 && arr[mid+1]>x)
                {
                    return mid+1;
                }
                low=mid+1;
            }
       }
       return n;
    }
}