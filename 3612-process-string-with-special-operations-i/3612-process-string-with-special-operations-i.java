class Solution {
    public String processStr(String s) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if(x=='#')
            {
                res.append(res);
            }
            else if(x=='*')
            {
                if(res.length()>=1)
                res.deleteCharAt(res.length()-1);
            }
            else if(x=='%')
            {
                res.reverse();
            }
            else
            {
                res.append(x);
            }
        }
        return res.toString();
    }
}