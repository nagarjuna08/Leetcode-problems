class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> res=new ArrayList<>();
        for(int x:bulbs)
        {
            if(res.contains(x))
            {
                res.remove(Integer.valueOf(x));
            }
            else
            {
                res.add(x);
            }
        }
        Collections.sort(res);
        return res;
    }
}