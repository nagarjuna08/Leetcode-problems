class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> a1=new HashSet<>();
        for(int i=0;i<arr1.length;i++)
        {
            int a=arr1[i];
            while(a>0)
            {
                a1.add(a);
                a=a/10;
            }
        }
        int res=0;
        for(int i=0;i<arr2.length;i++)
        {
            int a=arr2[i];
            while(a>0)
            {
                if(a1.contains(a))
                {
                    res=Math.max(res,a);
                }
                a=a/10;
            }
        }
        System.out.print(res);
        if(res!=0)
        {
            return String.valueOf(res).length();
        }
        return 0;
    }
}