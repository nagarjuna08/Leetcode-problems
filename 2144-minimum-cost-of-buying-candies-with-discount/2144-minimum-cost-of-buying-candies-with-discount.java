class Solution 
{
    public int minimumCost(int[] cost) 
    {
        if(cost.length<=1)
        {
            return cost[0];
        }
        Arrays.sort(cost);
        int buy=0;
        int i=cost.length-1;
        while(i>0)
        {
            buy+=cost[i]+cost[i-1];
            i=i-3;
        }   
        if(i==0)
        {
            buy+=cost[i];
        }
        return buy;     
    }
}