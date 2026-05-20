class Solution {
    public int compress(char[] chars) {
        StringBuilder str=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<chars.length;i++)
        {
            if(st.isEmpty())
            {
                st.push(chars[i]);
            }
            else if(st.peek()==chars[i])
            {
                st.push(chars[i]);
            }
            else
            {
                if(st.size()==1)
                {
                    str.append(st.peek());
                    st.clear();
                }
                else
                {
                str.append(st.peek());
                str.append(st.size());
                st.clear();
                }
                st.push(chars[i]);
            }
        }
        if(!st.isEmpty())
        {
            if(st.size()==1)
                {
                    str.append(st.peek());
                }
                else
                {

            str.append(st.peek());
            str.append(st.size());
                }
        }
        for(int i=0;i<str.length();i++ )
        {
            chars[i]=str.charAt(i);
        }
        return str.length();
    }
}