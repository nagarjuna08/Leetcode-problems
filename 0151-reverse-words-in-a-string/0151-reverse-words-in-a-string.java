class Solution {
    public String reverseWords(String s) {
        String [] str=s.trim().split("\\s+");
        for(int i=0;i<str.length/2;i++)
        {
            String temp=str[i];
            str[i]=str[str.length-i-1];
            str[str.length-i-1]=temp;
        }
        StringBuilder res=new StringBuilder();
        for(String x:str)
        {
            res.append(x);
            res.append(" ");
        }
        res.deleteCharAt(res.length()-1);
        String r=res.toString();
        return r;
    }
}