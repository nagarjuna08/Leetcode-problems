class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        boolean over[]=new boolean[arr.length];
        int n=arr.length;
        int j;
        int m=0;
        for(int i=0;i<n-1;i++)
        {
            j=i+1;
            while(j<n && !over[i] && arr[j][0]>=arr[i][0] && arr[j][0]<=arr[i][1])
            {
                int ele= Math.max(arr[i][1],arr[j][1]);
                arr[i][1]=ele;
                over[j]=true;
                m++;
                j++;
            }
        }
        // for(int i=0;i<n;i++)
        // {
        //     System.out.println(arr[i][0]+" "+ arr[i][1]);
        // }
        int res[][]=new int[n-m][2];
        j=0;
        for(int k=0;k<n;k++)
        {
            if(!over[k])
            {
                res[j][0]=arr[k][0];
                res[j][1]=arr[k][1];
                j++;
            }
        }
        return res;
    }
}