class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> mat = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<Integer> li=new ArrayList<>();
            int x=1;
            for(int j=0;j<=i;j++)
            {
                  li.add(x);
                  x=x*(i-j)/(j+1);
            }
            mat.add(li);
        }
        return mat;
    }
}