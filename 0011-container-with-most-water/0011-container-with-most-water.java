class Solution {
    public int maxArea(int[] arr) {
       int n=arr.length;
        int max=0;
        int left=0;
        int right=n-1;
        while(left<right)
        {
            int area=Math.min(arr[left],arr[right])*(right-left);
            max=Math.max(area,max);
            if(arr[left]>arr[right])
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return max; 
    }
}