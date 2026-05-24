class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int r=0,l=0,b=0;
        for(int i=0;i<moves.length();i++){

            if(moves.charAt(i)=='L')
                l++;
            else if(moves.charAt(i)=='R')
                r++;
            else
                b++;
        }

        return Math.abs(r-l)+b;
    }
}