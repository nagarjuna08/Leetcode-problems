class Solution {
    public int passwordStrength(String password) {
        int score=0;
        Set<Character> hs=new HashSet<>();
        for(int i=0;i<password.length();i++)
        {
            char x=password.charAt(i);
            if(hs.contains(x))
            {
                continue;
            }
            else
            {
                if(x>='a' && x<='z')
                {
                    score+=1;
                }
                else if(x>='A' && x<='Z')
                {
                    score+=2;
                }
                else if(x>='0' && x<='9')
                {
                    score+=3;
                }
                else
                {
                    score+=5;
                }
                hs.add(x);
            }
        }
        return score;
    }
}