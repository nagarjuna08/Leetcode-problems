class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int res=n*n;
        int total=res*w;
        while(total>maxWeight)
        {
            total-=w;
            res--;
        }
        return res;
    }
}