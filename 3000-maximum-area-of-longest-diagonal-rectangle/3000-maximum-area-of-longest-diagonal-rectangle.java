class Solution {
    public int areaOfMaxDiagonal(int[][] d) {
        int area=0;
        double di=0;
        int n=d.length;
        for(int i=0;i<n;i++)
        {
            double dio=Math.sqrt(d[i][0]*d[i][0]+d[i][1]*d[i][1]);
            if(dio>di || (dio==di&& d[i][0]*d[i][1]>area))
            {
                di=dio;
                int a=d[i][0]*d[i][1];
                area=Math.max(area,a);
            }
        }
        return area;
    }
}