class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    hs.add(nums1[i]);
                }
            }
        }
        int x=hs.size();
        int res[]=new int[x];
        int q=0;
        for(int d: hs)
        {
            res[q]=d;
            q++;
        }
        return res;
    }
}