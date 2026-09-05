class Solution {
    public boolean isPalindrome(String s) 
    {
        s = s.toLowerCase();

        String str = "";
        String original = "";

        int n = s.length();

        for(int i = 0; i < n; i++)
        {
            char ch = s.charAt(i);

            if((ch >= 'a' && ch <= 'z') || 
               (ch >= '0' && ch <= '9'))
            {
                original = original + ch;
            }
        }

        for(int i = n - 1; i >= 0; i--)
        {
            char ch = s.charAt(i);

            if((ch >= 'a' && ch <= 'z') || 
               (ch >= '0' && ch <= '9'))
            {
                str = str + ch;
            }
        }

        if(original.equals(str))
            return true;
        else
            return false;
    }
}
