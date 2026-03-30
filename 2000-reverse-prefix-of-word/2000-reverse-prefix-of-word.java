class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder str=new StringBuilder();
        Stack<Character> st=new Stack<>();
        int i=0;
        while(i<word.length() && word.charAt(i)!=ch)
        {
            st.push(word.charAt(i));
            i++;
        }
        if(i==word.length())
        {
            return word;
        }
        else
        {
            st.push(word.charAt(i));
            i++;
            while(!st.empty())
            {
                str.append(st.pop());
            }
            while(i<word.length())
            {
                str.append(word.charAt(i));
                i++;
            }
        }
        String res=str.toString();
        return res;
    }
}