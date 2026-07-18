class Solution {
    public int findGCD(int[] nums) {
        int s=Integer.MAX_VALUE,l=Integer.MIN_VALUE;
        for(int x: nums)
        {
            if(s>x)
            {
                s=x;
            }
            if(l<x)
            {
                l=x;
            }
        }
        return findGCD(s,l);
    }
    public int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
}