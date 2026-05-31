class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) 
    {
        double ma=mass;
        Arrays.sort(asteroids);
        for(int i=0;i<asteroids.length;i++)
        {
            if(ma>=asteroids[i])
            {
                ma+=asteroids[i];
                System.out.println(asteroids[i]);
            }
            else
            {
                return false;
            }
        }    
        return true;
    }
}