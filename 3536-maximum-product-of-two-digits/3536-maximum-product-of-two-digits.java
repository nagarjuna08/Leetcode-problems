class Solution {
    public int maxProduct(int n) {
        List<Integer> li=new ArrayList<>();
        int m=n;
        while(m>0)
        {
            li.add(m%10);
            m/=10;
        }
        System.out.print(li);
        int maxpro=0;
        for(int i=0;i<li.size();i++)
        {
            for(int j=i+1;j<li.size();j++)
            {
                maxpro=Math.max(maxpro,li.get(i)*li.get(j));
            }
        }
        return maxpro;
    }
}