class Solution {
    public int numberOfSubstrings(String s) {
        int count=0;
        int n=s.length();
        int abc[]={-1,-1,-1};
        for(int i=0;i<n;i++)
        {
            char x=s.charAt(i);
            abc[x-'a']=i;
            if(abc[0]!=-1 && abc[1]!=-1 && abc[2]!=-1)
            {
                count+=1+minval(abc);
            }
        }
        return count;
    }
    public int minval(int arr[])
    {
        int minIndex = Integer.MAX_VALUE;
        for(int i = 0; i < 3; i++){
                minIndex = Math.min(minIndex, arr[i]);
            }
            return minIndex;
    }

}