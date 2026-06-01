class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    res[i]=next(nums2,j,nums1[i]);
                }
            }
        }
        return res;
    }
    public int next(int arr[],int x,int target)
    {
        if(x==arr.length-1)
        {
            return -1;
        }
        for(int j=x+1;j<arr.length;j++)
        {
            if(arr[j]>target)
            {
                return arr[j];
            }   
        }
        return -1;
    }
}