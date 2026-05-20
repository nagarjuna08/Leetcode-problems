class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n=A.length;
        int [] C=new int[n];
        int [] fre=new int[n+1];
        for(int i=0;i<n;i++)
        {
            fre[A[i]]++;
            fre[B[i]]++;
            int count=0;
            for(int j=0;j<n+1;j++)
            {
                if(fre[j]!=0 && fre[j]%2==0)
                {
                    count++;
                }
            }
            C[i]=count;
            count=0;
        }
        return C;
    }
}