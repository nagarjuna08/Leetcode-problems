class Solution {
    public int[][] merge(int[][] arr) {
        //Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        Arrays.sort(arr,(a, b) -> Integer.compare(a[0], b[0]));
        List<int[]>res=new ArrayList<>();
        for(int []a : arr)
        {
            if(res.isEmpty() || res.get(res.size()-1)[1]<a[0])
            {
                res.add(a);
            }
            else
            {
                res.get(res.size()-1)[1]=Math.max(res.get(res.size()-1)[1],a[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}