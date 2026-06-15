class Solution {
    int count=0;
    public int reversePairs(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return count;
    }
     public void mergesort(int arr[],int low,int high)
    {   if(low>=high) return;
        int mid=low + (high-low)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        countpairs(arr,low,mid,high);
        merge(arr,low,mid,high);
    }
    public void countpairs(int arr[],int low,int mid,int high)
    {
        int right=mid+1;
        for(int i=low;i<=mid;i++)
        {
            while(right<=high && (long)arr[i]>(long)2*arr[right])
            {
                right++;
            }
            count+=(right-(mid+1));
        }
    }
    public void merge(int arr[],int low,int mid,int high)
    {
        int res[]=new int[high-low+1];
        int left=low;
        int right=mid+1;
        int j=0;
        while(left<=mid && right<=high)
        {
            if(arr[left]>arr[right])
            {
                res[j]=arr[right];
                j++;
                right++;
            }
            else
            {
                res[j]=arr[left];
                left++;
                j++;
            }
        }
        while(left<=mid)
        {
            res[j]=arr[left];
            left++;
            j++;
        }
        while(right<=high)
        {
            res[j]=arr[right];
            j++;
            right++;
        }
        for(int i=low;i<=high;i++)
        {
            arr[i]=res[i-low];
        }
    }
}