class Solution {
    public int gcdOfOddEvenSums(int n) {
        int esum=n*(n+1),osum=n*n;
        return getGCD(esum,osum);
    }
    public int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); // Returns positive GCD even for negative inputs
    }
}