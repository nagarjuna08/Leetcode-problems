class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1=nums1.length;
        int n2=nums2.length;
        int arr[]=new int[n+m];
        int left=0;
        int right=0;
        int j=0;
        while(left<m && right<n)
        {
            if(nums1[left]<=nums2[right])
            {
                arr[j]=nums1[left];
                j++;
                left++;
            }
            else
            {
                arr[j]=nums2[right];
                j++;
                right++;
            }
        }
        while(left<m)
        {
            arr[j]=nums1[left];
            j++;
                left++;
        }
        while(right<n)
        {
            arr[j]=nums2[right];
                j++;
                right++;
        }
        for(int i=0;i<arr.length;i++)
        {
            nums1[i]=arr[i];
        }
    }
}