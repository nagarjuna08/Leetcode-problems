class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++)
        {
            if(isprime(Integer.bitCount(i)))
            {
                count++;
            }
        }
        return --count;
    }
    public boolean isprime(int n)
    {
        for(int i=2;i*i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}