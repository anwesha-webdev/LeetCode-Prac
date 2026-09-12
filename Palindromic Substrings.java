class Solution 
{
    public int countSubstrings(String s)
    {
        int c = 0;

        for(int i = 0; i < s.length(); i++)
        {
            String st = "";

            for(int j = i ; j < s.length(); j++)
            {
                char ch = s.charAt(j);
                st = st + ch;

                if(pallindrome (st) == true)
                {
                    c++;
                }
            }
        }
        
        return c;
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
