class Solution {
    public List<String> letterCombinations(String digits) {
        String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> li=new ArrayList<>();
        if(digits.length()==0)
        {
            return li;
        }
        perm(arr,digits,li,0,new StringBuilder());
        return li;
    }
    public void perm(String[] arr, String di,List<String> li,int in, StringBuilder str)
    {
        if(str.length()==di.length())
        {
            li.add(str.toString());
            return;
        }
        String st=arr[di.charAt(in)-'0'];
        for(char c: st.toCharArray())
        {
            str.append(c);
            perm(arr,di,li,in+1,str);
            str.deleteCharAt(str.length() - 1);
        }
    }
}