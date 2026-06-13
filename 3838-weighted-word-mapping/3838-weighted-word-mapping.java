class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<words.length;i++)
        {
            String str=words[i];
            int sum=0;
            for(int j=0;j<str.length();j++)
            {
                char x=str.charAt(j);
                sum+=weights[x-'a'];
            }
            char temp=(char)('z'-(sum%26));
            res.append(temp);
        }
        return res.toString();
    }
}