class Solution {
    public boolean isPalindrome(String str) {
        int l=0;
        int r=str.length()-1;
        String s=str.toLowerCase();
        System.out.print(s);
        while(l<r)
        {
            while(l<r&&!((s.charAt(l)>=97&&s.charAt(l)<=122)|| (s.charAt(l)>='0'&&s.charAt(l)<='9')))
            {
                l++;
            }
            while(l<r&&!((s.charAt(r)>=97&&s.charAt(r)<=122)|| (s.charAt(r)>='0'&&s.charAt(r)<='9')))
            {
                r--;
            }
            if(s.charAt(l)!=s.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}