class Solution {
    public int digitFrequencyScore(int n) {
        int[] map = new int[10];
        int sum = 0;
        while(n>0){
            int r = n%10;
            map[r]++;
            n/=10;
        }
        for(int i = 0; i<10; i++){
            sum+=(i*map[i]);
        }
        return sum;
    }
}