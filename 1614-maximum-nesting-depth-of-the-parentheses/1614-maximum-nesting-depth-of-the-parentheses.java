class Solution {
    public int maxDepth(String s) 
    {
        int res=Integer.MIN_VALUE;
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char x=s.charAt(i);
            if(x=='(')
            {
                st.push(x);
                res=Math.max(res,st.size());
            }
            else if(x==')')
            {
                st.pop();
            }
        }
        if(res==Integer.MIN_VALUE)
        {
            return 0;
        }
        return res;
    }
}