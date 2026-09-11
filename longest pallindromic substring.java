class Solution 
{
    public String longestPalindrome(String s) 
    {
        for(int len = s.length(); len >= 1; len--)
        {
            for(int i = 0; i <= s.length() - len; i++)
            {
                String st = s.substring(i, i + len);

                if(pallindrome(st) == true)
                {
                    return st;
                }
            }
        }

        return "";
    }

    public boolean pallindrome(String s)
    {
        for(int i = 0; i < s.length() / 2; i++)
        {
            char ch = s.charAt(i);
            char ch1 = s.charAt(s.length() - 1 - i);

            if(ch != ch1)
            {
                return false;
            }
        }

        return true;
    }
}
