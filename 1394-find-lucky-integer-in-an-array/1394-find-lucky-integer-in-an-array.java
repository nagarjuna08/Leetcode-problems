class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                int x=hm.get(arr[i]);
                x++;
                hm.put(arr[i],x);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }
        int res=-1;
        for(int x: hm.keySet())
        {
            if(x==hm.get(x))
            {
                res=Math.max(res,x);
            }
        }
        return res;
    }
}