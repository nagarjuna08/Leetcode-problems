class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) 
    {
         Arrays.sort(asteroids);          // Sort asteroids by size
        long currentMass = mass;         // Use long to avoid overflow
        
        for (int asteroid : asteroids) {
            if (asteroid > currentMass) {
                return false;            // Cannot absorb this asteroid
            }
            currentMass += asteroid;     // Absorb asteroid and grow
        }
        
        return true;
    }
}